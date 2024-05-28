/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cafe.gui;


import com.cafe.model.Mysql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prince
 */
public class DiscountManagement extends javax.swing.JPanel {

     private Dashboard dashboard;

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }
    /**
     * Creates new form DiscountManagement
     */
    public DiscountManagement() {
        initComponents();
        loadDiscountTable();
        loadMenuItems();
    }

    private void loadDiscountTable() {
        ResultSet resultSet = Mysql.execute("SELECT `menu_item`.`name` AS 'name',`expire_date`, `rate`,`active_state`.`status` AS 'status' FROM `discount` "
                + "INNER JOIN `menu_item` ON `menu_item_id` = `menu_item`.`id`\n"
                + "INNER JOIN `active_state` ON `menu_item`.`active_state_state_id` = `active_state`.`state_id`");

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);

        try {
            while (resultSet.next()) {
                Vector<String> vector = new Vector<>();
                vector.add(resultSet.getString("name"));
                vector.add(resultSet.getString("rate") + "%");
                vector.add(resultSet.getString("status"));
                vector.add(resultSet.getString("expire_date"));

                tableModel.addRow(vector);
                jTable1.setModel(tableModel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiscountManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadMenuItems() {
        ResultSet resultSet = Mysql.execute("SELECT * FROM `menu_item`");

        Vector<String> vector = new Vector<>();
        vector.add("Select Item");

        try {
            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
                menuItemMap.put(resultSet.getString("name"), resultSet.getString("id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiscountManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
        jComboBox1.setModel(model);
    }

    private void resetValues(String act) {
        jComboBox1.setSelectedIndex(0);
        jTextField1.setText("Discount Rate(do not add the '%')");
        jDateChooser1.cleanup();
        JOptionPane.showMessageDialog(this, "Discount " + act + " Successfully", act, JOptionPane.INFORMATION_MESSAGE);
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Add Discount");

        jTextField1.setText("Discount Rate(do not add the '%')");
        jTextField1.setToolTipText("Discount Rate(do not add the '%' ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Valid Till (Date):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.CardLayout(6, 6));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu Item", "Discount Rate (in%)", "Active Status", "Expire Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, "card2");

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String item = String.valueOf(jComboBox1.getSelectedItem());
        String discountRate = jTextField1.getText();
        Date endDateObj = jDateChooser1.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        if (item.equals("Select Item")) {
            JOptionPane.showMessageDialog(this, "Please Select a Menu Item", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!discountRate.matches("^(100|[1-9]?[0-9])$")) {
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Discount Rate(0-100)", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (endDateObj == null) {
            JOptionPane.showMessageDialog(this, "Please Enter an End Date", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String endDate = dateFormat.format(endDateObj);
            ResultSet resultSet = Mysql.execute("SELECT * FROM `discount` WHERE `menu_item_id` = '" + menuItemMap.get(item) + "'");

            try {
                if (resultSet.next()) {
                    int updateConfirmation = JOptionPane.showConfirmDialog(this, "This Item Discount Already Exist, Do you wish to Update?", "Info", JOptionPane.OK_CANCEL_OPTION);
                    if (updateConfirmation == JOptionPane.OK_OPTION) {
                        Mysql.execute("UPDATE `discount` "
                                + "SET `rate`='" + discountRate + "',`expire_date`='" + endDate + "'"
                                + "WHERE `menu_item_id` = '" + menuItemMap.get(item) + "'");

                        resetValues("Updated");
                        loadDiscountTable();
                    }
                } else {
                    Mysql.execute("INSERT INTO `discount` "
                            + "(`rate`,`expire_date`,`menu_item_id`,`active_state_state_id`) "
                            + "VALUES ('" + discountRate + "','" + endDate + "','" + menuItemMap.get(item) + "','1')");
                    resetValues("Added");
                    loadDiscountTable();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiscountManagement.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private static HashMap<String, String> menuItemMap = new HashMap<>();
}
