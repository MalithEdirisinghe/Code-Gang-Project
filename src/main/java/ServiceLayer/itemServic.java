/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLayer;

import DB_Layer.DB;
import Model.Item;
import javax.swing.JOptionPane;

/**
 *
 * @author afri
 */
public class itemServic {
    static DB c = DB.getInstance();//
    public void addItem(Item d){
        String query = "Insert into item (ID,Name,Company,Quantity,Price,Sprice) values (?,?,?,?,?,?)";
        c.setQuery(query);
        JOptionPane.showMessageDialog(null,"Successfully saver ", "information", JOptionPane.INFORMATION_MESSAGE);
    }
}
