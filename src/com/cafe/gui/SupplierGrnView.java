/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.cafe.gui;

import com.cafe.model.DueGrn;
import com.cafe.model.Mysql;
import com.cafe.model.User;
import com.cafe.style.CustomStyle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class SupplierGrnView extends javax.swing.JDialog {

    private String id;
    private String mobile;
    private AllSupplierDuePayment allSupplierDuePayment;
    private SingleSupplierDuePayment singleSupplierDuePayment;

    public void setSingleSupplierDuePayment(SingleSupplierDuePayment singleSupplierDuePayment) {
        this.singleSupplierDuePayment = singleSupplierDuePayment;
    }

    public void setAllSupplierDuePayment(AllSupplierDuePayment allSupplierDuePayment) {
        this.allSupplierDuePayment = allSupplierDuePayment;
    }

    /**
     * Creates new form AllSupplierViewItems
     */
    public SupplierGrnView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setStyle();
    }

    public void setGrn(DueGrn grn) {
        this.id = grn.getGrnid();
        this.mobile = grn.getSuppliermobile();

        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        jButton1.setText("SETTLE DUE : Rs. " + formatter.format(grn.getDue()));
        jLabel2.setText(id);
        jLabel1.setText(mobile);
        jLabel6.setText("Rs. " + formatter.format(grn.getTotal()));
        jLabel8.setText("Rs. " + formatter.format(grn.getPaidAmount()));
        AllSupplierTableload();
    }

    private void AllSupplierTableload() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        try {
            ResultSet resultSet = Mysql.execute("SELECT kitchen_grn_item.id,kitchen_item.name,brand.name AS brand,kitchen_item_category.name AS category, "
                    + "kitchen_grn_item.qty, kitchen_grn_item.purchase_price AS price, (kitchen_grn_item.qty* kitchen_grn_item.purchase_price) AS total "
                    + "FROM kitchen_grn_item "
                    + "INNER JOIN kitchen_stock ON kitchen_stock.id = kitchen_grn_item.kitchen_stock_id "
                    + "INNER JOIN kitchen_item ON kitchen_item.id = kitchen_stock.kitchen_item_id "
                    + "INNER JOIN kitchen_item_category ON kitchen_item_category.id = kitchen_item.kitchen_item_category_id "
                    + "INNER JOIN brand ON kitchen_item.brand_id = brand.id WHERE kitchen_grn_item.kitchen_grn_id ='" + jLabel2.getText() + "' ");

            DecimalFormat formater = new DecimalFormat("#,##0.00");
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String price = formater.format(resultSet.getDouble("price"));
                String Quantity = resultSet.getString("qty");
                String name = resultSet.getString("name");
                String total = formater.format(resultSet.getDouble("total"));

                Vector v = new Vector();

                v.add(id);
                v.add(name);
                v.add(Quantity);
                v.add(price);
                v.add(total);

                model.addRow(v);

            }

            resultSet = Mysql.execute("SELECT direct_selling_grn_item.id AS id,menu_item.name AS `name`,direct_selling_grn_item.purchase_price AS price, "
                    + "direct_selling_grn_item.qty AS qty, (direct_selling_grn_item.qty*direct_selling_grn_item.purchase_price) AS total "
                    + "FROM direct_selling_grn "
                    + "INNER JOIN direct_selling_grn_item ON direct_selling_grn_item.direct_selling_grn_id = direct_selling_grn.id "
                    + "INNER JOIN direct_selling_stock ON direct_selling_stock.id = direct_selling_grn_item.direct_selling_stock_id "
                    + "INNER JOIN menu_item ON menu_item.id = direct_selling_stock.menu_item_id "
                    + "WHERE direct_selling_grn_id = '" + jLabel2.getText() + "'");

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String price = formater.format(resultSet.getDouble("price"));
                String Quantity = resultSet.getString("qty");
                String name = resultSet.getString("name");
                String total = formater.format(resultSet.getDouble("total"));

                Vector v = new Vector();
                v.add(id);
                v.add(name);
                v.add(Quantity);
                v.add(price);
                v.add(total);

                model.addRow(v);

            }

        } catch (Exception ex) {
            Logger.getLogger(SupplierGrnView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void AllsupplieritemDetails() {

        try {
            Mysql.execute("SELECT `kitchen_grn`.`id`,`supplier_mobile` FROM `kitchen_grn` "
                    + "INNER JOIN `kitchen_grn_item`  ON `kitchen_grn`.`id` = `kitchen_grn_item`.`kitchen_grn_id`");

            String grnid = jLabel2.getText();
            String customermobile = jLabel1.getText();

        } catch (Exception ex) {
            Logger.getLogger(SupplierGrnView.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GRN items list");

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 20));

        jPanel2.setLayout(new java.awt.BorderLayout(10, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECTED GRN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 16)), javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(2, 3, 20, 0));

        jPanel5.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("...");
        jPanel5.add(jLabel2, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("GRN ID : ");
        jPanel5.add(jLabel4, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("...");
        jPanel6.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Supplier :  ");
        jPanel6.add(jLabel3, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(77, 120, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SETTLE DUE PAYMENTS");
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(201, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, java.awt.BorderLayout.SOUTH);

        jPanel3.add(jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("...");
        jPanel8.add(jLabel6, java.awt.BorderLayout.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("GRN Total : ");
        jPanel8.add(jLabel7, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel8);

        jPanel9.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("...");
        jPanel9.add(jLabel8, java.awt.BorderLayout.CENTER);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Paid Amount :  ");
        jPanel9.add(jLabel9, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel9);

        jPanel2.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ITEM NAME", "QUANTITY", "PRICE (RS)", "TOTAL (RS)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setSelectionBackground(new java.awt.Color(77, 120, 204));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("GRN ITEM LIST");
        jLabel5.setPreferredSize(new java.awt.Dimension(97, 30));
        jPanel4.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Do you want to settled the due payments for this GRN",
                "Confirm due payment settlement", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            settleDue();
        } else {
            JOptionPane.showMessageDialog(this, "Operation cancelled");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SupplierGrnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierGrnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierGrnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierGrnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SupplierGrnView dialog = new SupplierGrnView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void settleDue() {
        boolean updated = true;
        ResultSet kitcgenGrnResult = Mysql.execute("SELECT * FROM kitchen_grn "
                + "WHERE `id` = '" + id + "' AND `supplier_mobile` = '" + mobile + "' ");
        try {
            if (kitcgenGrnResult.next()) {
                Mysql.execute("UPDATE `kitchen_grn` SET `paid_amount`=`total` "
                        + "WHERE `id` = '" + id + "' AND `supplier_mobile` = '" + mobile + "' ");
            } else {
                ResultSet directGrnResult = Mysql.execute("SELECT * FROM direct_selling_grn "
                        + "WHERE `id` = '" + id + "' AND `supplier_mobile` = '" + mobile + "'");
                if (directGrnResult.next()) {
                    Mysql.execute("UPDATE `direct_selling_grn` SET `paid_amount`=`total` "
                            + "WHERE `id` = '" + id + "' AND `supplier_mobile` = '" + mobile + "' ");

                } else {
                    JOptionPane.showMessageDialog(this, "Could not perform the sttlement", "Error", JOptionPane.ERROR_MESSAGE);
                    updated = false;
                }
            }
            if (updated) {
                JOptionPane.showMessageDialog(this, "Payments updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                if (this.allSupplierDuePayment != null) {
                    this.allSupplierDuePayment.loadGrnTable();
                    allSupplierDuePayment.getSupplierManagement().getDashboard().getUser().updateUserActivity(User.UserActivity.SETTLE_DUE_GRN);
                } else if (this.singleSupplierDuePayment != null) {
                    this.singleSupplierDuePayment.loadSingleSupplierTable();
                    singleSupplierDuePayment.getSupplierManagement().getDashboard().getUser().updateUserActivity(User.UserActivity.SETTLE_DUE_GRN);
                }
                this.dispose();
            }
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private void setStyle() {
        jTable1.setDefaultRenderer(String.class, CustomStyle.renderCenter);
        jTable1.setDefaultRenderer(Double.class, CustomStyle.renderRight);
    }

}
