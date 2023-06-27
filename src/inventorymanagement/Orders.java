/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author greci
 */
public class Orders extends javax.swing.JFrame {
Connection con = null;
   PreparedStatement pst = null;
   ResultSet rs = null;
    /**
     * Creates new form Orders
     */
    public Orders() {
        initComponents();
        //SelectProd();
       // SelectCust();
       showTableData();
       showData();
        GetToday();
        showBill();
    }
   
   
   

private void GetToday()
{
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
LocalDateTime now = LocalDateTime.now();
//System.out.println(dtf.format(now));
Datelbl.setText(dtf.format(now));
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Addtoorderbtn = new javax.swing.JButton();
        Vieworderbtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customertable = new javax.swing.JTable();
        stock = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        Addorderbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BillTbl = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        product = new javax.swing.JTextField();
        Datelbl = new javax.swing.JLabel();
        Amountlabel = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(23, 31, 37));

        jPanel2.setBackground(new java.awt.Color(67, 85, 99));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 184, 84));
        jLabel3.setText("INVENTORY MANAGEMENT SYSTEM");

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 184, 84));
        jLabel4.setText("MANAGE ORDERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(505, 505, 505))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(620, 620, 620))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(243, 184, 84));
        jLabel5.setText("Quantity");

        Addtoorderbtn.setBackground(new java.awt.Color(243, 184, 84));
        Addtoorderbtn.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 16)); // NOI18N
        Addtoorderbtn.setText("Add To Order");
        Addtoorderbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddtoorderbtnMouseClicked(evt);
            }
        });
        Addtoorderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoorderbtnActionPerformed(evt);
            }
        });

        Vieworderbtn.setBackground(new java.awt.Color(243, 184, 84));
        Vieworderbtn.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 16)); // NOI18N
        Vieworderbtn.setText("VIEW ORDERS");
        Vieworderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VieworderbtnActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(243, 184, 84));
        jButton4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 16)); // NOI18N
        jButton4.setText("HOME");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(243, 184, 84));
        jLabel9.setText("PRODUCTS LIST");

        jLabel10.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(243, 184, 84));
        jLabel10.setText("CustomerName");

        Customertable.setBackground(new java.awt.Color(67, 85, 99));
        Customertable.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        Customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustID", "Name", "Phone"
            }
        ));
        Customertable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Customertable.setRowHeight(25);
        Customertable.setSelectionBackground(new java.awt.Color(14, 79, 158));
        Customertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Customertable);

        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });

        Addorderbtn.setBackground(new java.awt.Color(243, 184, 84));
        Addorderbtn.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 16)); // NOI18N
        Addorderbtn.setText("ADD ORDER");
        Addorderbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddorderbtnMouseClicked(evt);
            }
        });
        Addorderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddorderbtnActionPerformed(evt);
            }
        });

        ProductTable.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProdID", "Name", "Quantity", "Description", "Category", "Price"
            }
        ));
        ProductTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProductTable.setRowHeight(25);
        ProductTable.setSelectionBackground(new java.awt.Color(14, 79, 158));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProductTable);

        jLabel11.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(243, 184, 84));
        jLabel11.setText("CUSTOMERS LIST");

        jLabel12.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(243, 184, 84));
        jLabel12.setText("Date");

        BillTbl.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        BillTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Quantity", "UPrice", "Total"
            }
        ));
        BillTbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BillTbl.setRowHeight(25);
        BillTbl.setSelectionBackground(new java.awt.Color(14, 79, 158));
        jScrollPane3.setViewportView(BillTbl);

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(243, 184, 84));
        jLabel6.setText("Product Name");

        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });

        Datelbl.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        Datelbl.setForeground(new java.awt.Color(243, 184, 84));
        Datelbl.setText("Date");

        Amountlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Amountlabel.setForeground(new java.awt.Color(243, 184, 84));
        Amountlabel.setText("Amount");

        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(243, 184, 84));
        jLabel7.setText("Price");

        name.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N

        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });

        amount.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(263, 263, 263))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Addorderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Vieworderbtn))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Addtoorderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Amountlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(408, 408, 408))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addtoorderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Amountlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel10))
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Addorderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Vieworderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockActionPerformed

    private void AddorderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddorderbtnActionPerformed
        // TODO add your handling code here:
     
        try {
            String sql = "DELETE FROM orderprod;";
            con = DriverManager.getConnection("jdbc:mysql://localhost/Inventorydb","root","");
            pst = con.prepareStatement(sql);
            //pst.setString(1,name.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Add successfully");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        showBill();
        amount.setText("0.00");
    }//GEN-LAST:event_AddorderbtnActionPerformed

    private void VieworderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VieworderbtnActionPerformed
        // TODO add your handling code here:
        orderlist j = new orderlist();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VieworderbtnActionPerformed

    private void AddtoorderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoorderbtnActionPerformed
        // TODO add your handling code here:
        
        if(Quantity.getText().isEmpty()||name.getText().isEmpty()||product.getText().isEmpty()||Price.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
        String amountt = name.getText();
        int avqe = (Integer.parseInt(Quantity.getText()));
        int stockk = (Integer.parseInt(stock.getText()));
        if (stockk < avqe){
            JOptionPane.showMessageDialog(null, "The desired quantity of the customer is currently unavailable in our inventory. Please check the quantity stock for reference.");
        }
        else{  
        try {
            String sql = "INSERT INTO orderprod"
                    +"(orderid, name, product, quantity, price, total)"
                    + "VALUES (?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/Inventorydb","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,id.getText());
            pst.setString(2,name.getText());
            pst.setInt(4,avqe);
            pst.setString(3,product.getText());
            double price = (Double.parseDouble(Price.getText()));
            pst.setDouble(5,price);
            double total = (Double.parseDouble(Price.getText()) * Double.parseDouble(Quantity.getText()));
            pst.setDouble(6,total);
            pst.executeUpdate();
            String sqql = "INSERT INTO record"
                    +"(name, product, quantity, price, total)"
                    + "VALUES (?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/Inventorydb","root","");
            pst = con.prepareStatement(sqql);
            pst.setString(1,name.getText());
            int avqqe = (Integer.parseInt(stock.getText()));
            pst.setInt(3,avqqe);
            pst.setString(2,product.getText());
            double priqce = (Double.parseDouble(Price.getText()));
            pst.setDouble(4,priqce);
            double totqal = (Double.parseDouble(Price.getText()) * Double.parseDouble(stock.getText()));
            pst.setDouble(5,totqal);
            pst.executeUpdate();
            
            String sqqql = "SELECT SUM(total) FROM orderprod where name=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/Inventorydb","root","");
            pst = con.prepareStatement(sqqql);
            pst.setString(1,amountt);
            rs = pst.executeQuery();
            if(rs.next())
            {
                amount.setText(rs.getString(1));
            }
            
            
            
            String sEql = "UPDATE product SET Quantity=? WHERE Name=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/Inventorydb","root","");
            pst = con.prepareStatement(sEql);
             pst.setString(2, product.getText());
            int quant = ((Integer.parseInt(stock.getText())) - Integer.parseInt(Quantity.getText()));
            pst.setInt(1,quant);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Added!");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        }
        showBill();
        Quantity.setText("");
        Price.setText("");
        product.setText("");
        stock.setText("");
        showData();
    }//GEN-LAST:event_AddtoorderbtnActionPerformed
    }
    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productActionPerformed

    private void CustomertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomertableMouseClicked
        DefaultTableModel model = (DefaultTableModel)Customertable.getModel();
        int Myindex = Customertable.getSelectedRow();
        //Custid.setText(model.getValueAt(Myindex, 0).toString());
        name.setText(model.getValueAt(Myindex, 1).toString());//paramaset ang name ng customer
        //Custphone.setText(model.getValueAt(Myindex, 2).toString());
    }//GEN-LAST:event_CustomertableMouseClicked
int flag = 0,productid,oldqty;

    int i = 1,Uprice,tot=0,total;
String Prodname;
    private void AddtoorderbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddtoorderbtnMouseClicked
     

    }//GEN-LAST:event_AddtoorderbtnMouseClicked

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
          DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow();
        product.setText(model.getValueAt(Myindex, 1).toString());//paramaset ang name ng customer
        Price.setText(model.getValueAt(Myindex, 5).toString());//paramaset ang name ng customer
        stock.setText(model.getValueAt(Myindex, 2).toString());//paramaset ang name ng customer
       /*productid = Integer.valueOf((model.getValueAt(Myindex, 0).toString()));
        Prodname = model.getValueAt(Myindex, 1).toString();
    oldqty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
       // ProdDesc.setText(model.getValueAt(Myindex, 3).toString());
       flag = 1;*/
    }//GEN-LAST:event_ProductTableMouseClicked

    private void AddorderbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddorderbtnMouseClicked
                // TODO add your handling code here:
    }//GEN-LAST:event_AddorderbtnMouseClicked

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Menu g= new Menu();
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    public void showTableData()
        {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Inventorydb","root","");
            String sql = "SELECT * FROM customer";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            Customertable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        } 
    public void showData()
    {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Inventorydb","root","");
            String sql = "SELECT * FROM product where quantity!=0";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            ProductTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     public void showBill()
    {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Inventorydb","root","");
            String sql = "SELECT name, product, quantity, price, total FROM orderprod";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            BillTbl.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
      
      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addorderbtn;
    private javax.swing.JButton Addtoorderbtn;
    private javax.swing.JLabel Amountlabel;
    private javax.swing.JTable BillTbl;
    private javax.swing.JTable Customertable;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JTextField Price;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton Vieworderbtn;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField product;
    private javax.swing.JTextField stock;
    // End of variables declaration//GEN-END:variables
}
