/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author afri
 */
public class DB {
    private String driver = "com.mysql.jdbc.Driver";
    
    //My PC
    private String url = "jdbc:mysql://localhost:3306/xmusic";
    private String uname = "root";
    private String pword = "";
    

    

    Connection a;
    static DB c;
  

    public DB() {
    }

    public static DB getInstance() {

        if (c == null) {
            c = new DB();
        }

        return c;
    }

    public Connection con() {

        try {

            //connect to db
            Class.forName(driver).newInstance();
            a = (Connection) DriverManager.getConnection(url, uname, pword);


        } catch (NullPointerException N) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, N);
        } catch (Exception ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Connection error. ", "Database Error", JOptionPane.ERROR_MESSAGE);
        }


        return a;
    }

    public void setQuery(String query) {
//when inserting data this is run
        a = con();
        try {
            Statement s = (Statement) a.createStatement();
            s.execute(query);

        } catch (NullPointerException N) {
            // JOptionPane.showMessageDialog(Connect, "Please Check Enter Your Details");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (a == null) {
                try {
                    a.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public ResultSet getQuery(String query) {
        ResultSet r = null;
//when retrieve data this is run
        a = con();
        try {
            Statement s = (Statement) a.createStatement();
            r = s.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (a == null) {
                try {
                    a.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return r;
    }

    public int returnQuery(String query) {
//auto incrementing values........ returns incremented row id
        a = con();

        ResultSet r = null;
        int i = 0;
        try {
            Statement s = (Statement) a.createStatement();
            s.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            r = s.getGeneratedKeys();
            r.next();
            i = r.getInt(1);

            System.out.println("i =" + i);


        } catch (NullPointerException N) {
            // JOptionPane.showMessageDialog(Connect, "Please Check Enter Your Details");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (a == null) {
                try {
                    a.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return i;

    }

}
