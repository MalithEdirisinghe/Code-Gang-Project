/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.Item;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author afri
 */
public class Instruments extends javax.swing.JInternalFrame {

    /**
     * Creates new form Item
     */
    public Instruments() {
        initComponents();
        show_Item();
        show_ItemUpd();
        show_ItemDlt();
    }

    public ArrayList<Item> ItemList() {
        ArrayList<Item> ItemList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xmusic", "root", "");
            Statement st = con.createStatement();
            String query = "Select * from Item order by Name";
            ResultSet rs = st.executeQuery(query);
            Item item;
            while (rs.next()) {
                item = new Item(rs.getString("ID"), rs.getString("Name"), rs.getString("Company"), rs.getInt("Quantity"), rs.getFloat("Price"), rs.getFloat("Sprice"));
                ItemList.add(item);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ItemList;
    }

    public void show_Item() {
        ArrayList<Item> list = ItemList();
        DefaultTableModel model = (DefaultTableModel) tblAdd.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getID();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getCompany();
            row[3] = list.get(i).getQuantity();
            row[4] = list.get(i).getPrice();
            row[5] = list.get(i).getSprice();
            model.addRow(row);
        }
    }

    public ArrayList<Item> ItemListupd() {
        ArrayList<Item> ItemList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xmusic", "root", "");
            Statement st = con.createStatement();
            String query = "Select * from Item order by Name";
            ResultSet rs = st.executeQuery(query);
            Item item;
            while (rs.next()) {
                item = new Item(rs.getString("ID"), rs.getString("Name"), rs.getString("Company"), rs.getInt("Quantity"), rs.getFloat("Price"), rs.getFloat("Sprice"));
                ItemList.add(item);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ItemList;
    }

    public void show_ItemUpd() {
        ArrayList<Item> list = ItemList();
        DefaultTableModel model = (DefaultTableModel) tblUpdate.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getID();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getCompany();
            row[3] = list.get(i).getQuantity();
            row[4] = list.get(i).getPrice();
            row[5] = list.get(i).getSprice();
            model.addRow(row);
        }
    }

    public ArrayList<Item> ItemListdlt() {
        ArrayList<Item> ItemList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xmusic", "root", "");
            Statement st = con.createStatement();
            String query = "Select * from Item order by Name";
            ResultSet rs = st.executeQuery(query);
            Item item;
            while (rs.next()) {
                item = new Item(rs.getString("ID"), rs.getString("Name"), rs.getString("Company"), rs.getInt("Quantity"), rs.getFloat("Price"), rs.getFloat("Sprice"));
                ItemList.add(item);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ItemList;
    }

    public void show_ItemDlt() {
        ArrayList<Item> list = ItemList();
        DefaultTableModel model = (DefaultTableModel) tblDelete.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getID();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getCompany();
            row[3] = list.get(i).getQuantity();
            row[4] = list.get(i).getPrice();
            row[5] = list.get(i).getSprice();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdd = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnResetadd = new javax.swing.JButton();
        txtSales = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblUpdate = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnResetUpdate = new javax.swing.JButton();
        txtSaleUpdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPriceUpdate = new javax.swing.JTextField();
        txtQuantityUpdate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCompanyUpdate = new javax.swing.JTextField();
        txtNameUpdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIdUpdate = new javax.swing.JTextField();
        txtSearchUpd = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDelete = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnResetDelete = new javax.swing.JButton();
        txtSaleDelete = new javax.swing.JTextField();
        txtPriceDelete = new javax.swing.JTextField();
        txtQuantityDelete = new javax.swing.JTextField();
        txtCompanyDelete = new javax.swing.JTextField();
        txtNameDelete = new javax.swing.JTextField();
        txtIdDelete = new javax.swing.JTextField();
        txtSearchDlt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tblAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Company", "Quantity", "Price", "Sales Of Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdd.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAdd);
        if (tblAdd.getColumnModel().getColumnCount() > 0) {
            tblAdd.getColumnModel().getColumn(0).setResizable(false);
            tblAdd.getColumnModel().getColumn(1).setResizable(false);
            tblAdd.getColumnModel().getColumn(2).setResizable(false);
            tblAdd.getColumnModel().getColumn(3).setResizable(false);
            tblAdd.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Price");

        txtId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtQuantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setText("Add");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnResetadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnResetadd.setText("Reset");
        btnResetadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetaddActionPerformed(evt);
            }
        });

        txtSales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sales Of Price");

        txtCompany.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Company");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel19.setText("Search");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnResetadd)
                        .addGap(30, 30, 30)
                        .addComponent(btnSave)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSales, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtPrice)
                                .addGap(25, 25, 25))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCompany)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnResetadd))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Add Instruments", jPanel2);

        tblUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Company", "Quantity", "Price", "Sales Of Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUpdate.getTableHeader().setReorderingAllowed(false);
        tblUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUpdateMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblUpdate);
        if (tblUpdate.getColumnModel().getColumnCount() > 0) {
            tblUpdate.getColumnModel().getColumn(0).setResizable(false);
            tblUpdate.getColumnModel().getColumn(1).setResizable(false);
            tblUpdate.getColumnModel().getColumn(2).setResizable(false);
            tblUpdate.getColumnModel().getColumn(3).setResizable(false);
            tblUpdate.getColumnModel().getColumn(5).setResizable(false);
        }

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnResetUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnResetUpdate.setText("Reset");
        btnResetUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetUpdateActionPerformed(evt);
            }
        });

        txtSaleUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Sales Of Price");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Price");

        txtPriceUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtQuantityUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Quantity");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Company");

        txtCompanyUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtNameUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Id");

        txtIdUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtSearchUpd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchUpdKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnResetUpdate)
                        .addGap(30, 30, 30)
                        .addComponent(btnUpdate)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSaleUpdate)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantityUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPriceUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCompanyUpdate)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtSearchUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtSearchUpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCompanyUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantityUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPriceUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaleUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnResetUpdate))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Update Instruments", jPanel3);

        tblDelete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Company", "Quantity", "Price", "Sales Of Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDelete.getTableHeader().setReorderingAllowed(false);
        tblDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDeleteMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblDelete);
        if (tblDelete.getColumnModel().getColumnCount() > 0) {
            tblDelete.getColumnModel().getColumn(0).setResizable(false);
            tblDelete.getColumnModel().getColumn(1).setResizable(false);
            tblDelete.getColumnModel().getColumn(2).setResizable(false);
            tblDelete.getColumnModel().getColumn(3).setResizable(false);
            tblDelete.getColumnModel().getColumn(5).setResizable(false);
        }

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnResetDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnResetDelete.setText("Reset");
        btnResetDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDeleteActionPerformed(evt);
            }
        });

        txtSaleDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtPriceDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtQuantityDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtCompanyDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtNameDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtIdDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtSearchDlt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchDltKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Id");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Name");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Company");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Quantity");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Price");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Sales Of Price");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearchDlt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnResetDelete)
                        .addGap(30, 30, 30)
                        .addComponent(btnDelete))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSaleDelete))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtQuantityDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNameDelete)
                                    .addComponent(txtIdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCompanyDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtSearchDlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCompanyDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantityDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaleDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnResetDelete)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Delete Instruments", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 837, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xmusic", "root", "");
            Statement st = con.createStatement();
            String query = "Insert into item (ID,Name,Company,Quantity,Price,Sprice) values (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtId.getText());
            pst.setString(2, txtName.getText());
            pst.setString(3, txtCompany.getText());
            int Quantity = Integer.parseInt(txtQuantity.getText());
            pst.setInt(4, Quantity);
            float Price = Float.parseFloat(txtPrice.getText());
            pst.setFloat(5, Price);
            float Sprice = Float.parseFloat(txtSales.getText());
            pst.setFloat(6, Price);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) tblAdd.getModel();
            model.setRowCount(0);
            show_Item();
            DefaultTableModel modelupd = (DefaultTableModel) tblUpdate.getModel();
            modelupd.setRowCount(0);
            show_ItemUpd();
            DefaultTableModel modeldlt = (DefaultTableModel) tblDelete.getModel();
            modeldlt.setRowCount(0);
            show_ItemDlt();
            JOptionPane.showMessageDialog(null, "Item Sucessfully Added!");
            txtId.setText(null);
            txtName.setText(null);
            txtCompany.setText(null);
            txtPrice.setText(null);
            txtQuantity.setText(null);
            txtSales.setText(null);
            // txtSearchName.setText(null);
            //txtaddSearch.setText(null);
            //txtaddSearchName.setText(null);

            //txtCategorySearch.setText(null);
           /* String Id = txtId.getText();
            String Name = txtName.getText();
            String Company = txtCompany.getText();
            int Quantity = Integer.parseInt(txtQuantity.getText());
            float Price = Float.parseFloat(txtPrice.getText());
            float Sprice = Float.parseFloat(txtSales.getText());
            
            Item myitem = new Item(Id,Name,Company,Quantity,Price,Sprice);
            itemServic service = new itemServic();
            service.addItem(myitem);*/
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alredy Add Product! ,Check The Name", "Save Error", JOptionPane.ERROR_MESSAGE);//
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int YesORNo = JOptionPane.showConfirmDialog(null, "Do you want Update Data", "Update Option", JOptionPane.YES_NO_OPTION);
        if (YesORNo == 0) {
            try {
                int row = tblUpdate.getSelectedRow();
                String value = (tblUpdate.getModel().getValueAt(row, 0).toString());
                String ID = txtIdUpdate.getText();
                String Name = txtNameUpdate.getText();
                String Company = txtCompanyUpdate.getText();
                int Quantity = Integer.parseInt(txtQuantityUpdate.getText());
                float Price = Float.parseFloat(txtPriceUpdate.getText());
                float Sprice = Float.parseFloat(txtSaleUpdate.getText());
                Item items = new Item(ID, Name, Company, Quantity, Price, Sprice);

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xmusic", "root", "");
                PreparedStatement pst;
                String query = "update Item set ID = '" + items.getID() + "', Name = '" + items.getName() + "', Company = '" + items.getCompany() + "', Price = '" + items.getPrice() + "',Quantity = '" + items.getQuantity() + "' , Sprice = '" + items.getSprice() + "' where ID = '" + items.getID() + "'";
                pst = con.prepareStatement(query);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel) tblAdd.getModel();
                model.setRowCount(0);
                show_Item();
                DefaultTableModel modelupd = (DefaultTableModel) tblUpdate.getModel();
                modelupd.setRowCount(0);
                show_ItemUpd();
                DefaultTableModel modeldlt = (DefaultTableModel) tblDelete.getModel();
                modeldlt.setRowCount(0);
                show_ItemDlt();
                JOptionPane.showMessageDialog(null, "Successfully Update ", "information", JOptionPane.INFORMATION_MESSAGE);
                txtIdUpdate.setText(null);
                txtNameUpdate.setText(null);
                txtCompanyUpdate.setText(null);
                txtPriceUpdate.setText(null);
                txtQuantityUpdate.setText(null);
                txtSaleUpdate.setText(null);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);//"Item ID is invalid OR You can't change ID ", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetUpdateActionPerformed
        // TODO add your handling code here:
        int YesORNo = JOptionPane.showConfirmDialog(null, "Do you want Clear All Data", "Clear Option", JOptionPane.YES_NO_OPTION);
        if (YesORNo == 0) {
            txtIdUpdate.setText(null);
            txtNameUpdate.setText(null);
            txtCompanyUpdate.setText(null);
            txtPriceUpdate.setText(null);
            txtQuantityUpdate.setText(null);
            txtSaleUpdate.setText(null);
        }
    }//GEN-LAST:event_btnResetUpdateActionPerformed

    private void btnResetaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetaddActionPerformed
        // TODO add your handling code here:
        int YesORNo = JOptionPane.showConfirmDialog(null, "Do you want Clear All Data", "Clear Option", JOptionPane.YES_NO_OPTION);
        if (YesORNo == 0) {
            txtId.setText(null);
            txtName.setText(null);
            txtCompany.setText(null);
            txtPrice.setText(null);
            txtQuantity.setText(null);
            txtSales.setText(null);
        }
    }//GEN-LAST:event_btnResetaddActionPerformed

    private void btnResetDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDeleteActionPerformed
        // TODO add your handling code here:
        int YesORNo = JOptionPane.showConfirmDialog(null, "Do you want Clear All Data", "Clear Option", JOptionPane.YES_NO_OPTION);
        if (YesORNo == 0) {
            txtIdDelete.setText(null);
            txtNameDelete.setText(null);
            txtCompanyDelete.setText(null);
            txtPriceDelete.setText(null);
            txtQuantityDelete.setText(null);
            txtSaleDelete.setText(null);
        }
    }//GEN-LAST:event_btnResetDeleteActionPerformed

    private void tblDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDeleteMouseClicked
        // TODO add your handling code here:
        int i = tblDelete.getSelectedRow();
        TableModel model = tblDelete.getModel();
        txtIdDelete.setText(model.getValueAt(i, 0).toString());
        txtNameDelete.setText(model.getValueAt(i, 1).toString());
        txtCompanyDelete.setText(model.getValueAt(i, 2).toString());
        txtQuantityDelete.setText(model.getValueAt(i, 3).toString());
        txtPriceDelete.setText(model.getValueAt(i, 4).toString());
        txtSaleDelete.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_tblDeleteMouseClicked

    private void tblUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUpdateMouseClicked
        // TODO add your handling code here:
        int i = tblUpdate.getSelectedRow();
        TableModel model = tblUpdate.getModel();
        txtIdUpdate.setText(model.getValueAt(i, 0).toString());
        txtNameUpdate.setText(model.getValueAt(i, 1).toString());
        txtCompanyUpdate.setText(model.getValueAt(i, 2).toString());
        txtQuantityUpdate.setText(model.getValueAt(i, 3).toString());
        txtPriceUpdate.setText(model.getValueAt(i, 4).toString());
        txtSaleUpdate.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_tblUpdateMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int YesORNo = JOptionPane.showConfirmDialog(null, "Do you want Delete", "Delete Option", JOptionPane.YES_NO_OPTION);
        if (YesORNo == 0) {
            try {
                int row = tblDelete.getSelectedRow();
                String value = (tblDelete.getModel().getValueAt(row, 0).toString());
                String ID = txtIdDelete.getText();
                String Name = txtNameDelete.getText();
                String Company = txtCompanyDelete.getText();
                int Quantity = Integer.parseInt(txtQuantityDelete.getText());
                float Price = Float.parseFloat(txtPriceDelete.getText());
                float Sprice = Float.parseFloat(txtSaleDelete.getText());
                Item items = new Item(ID, Name, Company, Quantity, Price, Sprice);

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xmusic", "root", "");
                PreparedStatement pst;
                String query = "Delete from Item Where ID = '" + items.getID() + "'";
                pst = con.prepareStatement(query);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel) tblUpdate.getModel();
                model.setRowCount(0);
                show_ItemUpd();
                DefaultTableModel model1 = (DefaultTableModel) tblDelete.getModel();
                model1.setRowCount(0);
                show_ItemDlt();
                DefaultTableModel model2 = (DefaultTableModel) tblAdd.getModel();
                model2.setRowCount(0);
                show_Item();
                txtIdDelete.setText(null);
                txtNameDelete.setText(null);
                txtCompanyDelete.setText(null);
                txtPriceDelete.setText(null);
                txtQuantityDelete.setText(null);
                txtSaleDelete.setText(null);
                JOptionPane.showMessageDialog(null, "Successfully Delete ", "information", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Item ID is invalid ", "Error", JOptionPane.INFORMATION_MESSAGE);//
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchUpdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchUpdKeyReleased
        // TODO add your handling code here:
        ArrayList<Item> al = new ArrayList<Item>();
        //al = new ArrayList<AddItems>();
        String val = txtSearchUpd.getText().toString().trim();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xmusic", "root", "");
            String query = "Select * from Item where ID like '" + val + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            Item item;
            while (rs.next()) {
                item = new Item(rs.getString("ID"), rs.getString("Name"), rs.getString("Company"), rs.getInt("Quantity"), rs.getFloat("Price"), rs.getFloat("Sprice"));
                al.add(item);
            }

            DefaultTableModel model = (DefaultTableModel) tblUpdate.getModel();
            model.setRowCount(0);
            Object[] row = new Object[6];
            for (int i = 0; i < al.size(); i++) {
                row[0] = al.get(i).getID();
                row[1] = al.get(i).getName();
                row[2] = al.get(i).getCompany();
                row[3] = al.get(i).getQuantity();
                row[4] = al.get(i).getPrice();
                row[5] = al.get(i).getSprice();
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cannot find Item Name", "Search Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtSearchUpdKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        ArrayList<Item> al = new ArrayList<Item>();
        //al = new ArrayList<AddItems>();
        String val = txtSearch.getText().toString().trim();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xmusic", "root", "");
            String query = "Select * from Item where ID like '" + val + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            Item item;
            while (rs.next()) {
                item = new Item(rs.getString("ID"), rs.getString("Name"), rs.getString("Company"), rs.getInt("Quantity"), rs.getFloat("Price"), rs.getFloat("Sprice"));
                al.add(item);
            }

            DefaultTableModel model = (DefaultTableModel) tblAdd.getModel();
            model.setRowCount(0);
            Object[] row = new Object[6];
            for (int i = 0; i < al.size(); i++) {
                row[0] = al.get(i).getID();
                row[1] = al.get(i).getName();
                row[2] = al.get(i).getCompany();
                row[3] = al.get(i).getQuantity();
                row[4] = al.get(i).getPrice();
                row[5] = al.get(i).getSprice();
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cannot find Item Name", "Search Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchDltKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchDltKeyReleased
        // TODO add your handling code here:
        ArrayList<Item> al = new ArrayList<Item>();
        //al = new ArrayList<AddItems>();
        String val = txtSearchDlt.getText().toString().trim();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xmusic", "root", "");
            String query = "Select * from Item where ID like '" + val + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            Item item;
            while (rs.next()) {
                item = new Item(rs.getString("ID"), rs.getString("Name"), rs.getString("Company"), rs.getInt("Quantity"), rs.getFloat("Price"), rs.getFloat("Sprice"));
                al.add(item);
            }

            DefaultTableModel model = (DefaultTableModel) tblDelete.getModel();
            model.setRowCount(0);
            Object[] row = new Object[6];
            for (int i = 0; i < al.size(); i++) {
                row[0] = al.get(i).getID();
                row[1] = al.get(i).getName();
                row[2] = al.get(i).getCompany();
                row[3] = al.get(i).getQuantity();
                row[4] = al.get(i).getPrice();
                row[5] = al.get(i).getSprice();
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cannot find Item Name", "Search Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtSearchDltKeyReleased

    private void txtSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnResetDelete;
    private javax.swing.JButton btnResetUpdate;
    private javax.swing.JButton btnResetadd;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAdd;
    private javax.swing.JTable tblDelete;
    private javax.swing.JTable tblUpdate;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtCompanyDelete;
    private javax.swing.JTextField txtCompanyUpdate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdDelete;
    private javax.swing.JTextField txtIdUpdate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameDelete;
    private javax.swing.JTextField txtNameUpdate;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPriceDelete;
    private javax.swing.JTextField txtPriceUpdate;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtQuantityDelete;
    private javax.swing.JTextField txtQuantityUpdate;
    private javax.swing.JTextField txtSaleDelete;
    private javax.swing.JTextField txtSaleUpdate;
    private javax.swing.JTextField txtSales;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchDlt;
    private javax.swing.JTextField txtSearchUpd;
    // End of variables declaration//GEN-END:variables
}
