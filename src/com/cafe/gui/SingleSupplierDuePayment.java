/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.cafe.gui;

import com.cafe.model.DueGrn;
import com.cafe.model.Mysql;
import com.cafe.style.CustomStyle;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class SingleSupplierDuePayment extends javax.swing.JDialog {

    private HashMap<String, DueGrn> dueGrnMap = new HashMap<>();

    /**
     * Creates new form OpenSingleSupplierDuePayment
     */
    public SingleSupplierDuePayment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setStyle();
        jButton1.grabFocus();
    }

    public void setSupplier(String name, String mobile) {
        jTextField1.setText(name);
        jTextField2.setText(mobile);
        loadSingleSupplierTable();
    }

    public void loadSingleSupplierTable() {
        dueGrnMap.clear();
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            ResultSet resultSet = Mysql.execute("SELECT  `kitchen_grn`.`id` ,`kitchen_grn`.`supplier_mobile`, `kitchen_grn`.`date`,COUNT(`kitchen_grn`.`id`) AS `count`,"
                    + "(`kitchen_grn`.`total` - `kitchen_grn`.`paid_amount`) AS `due`,total,paid_amount "
                    + "FROM `kitchen_grn` INNER JOIN `kitchen_grn_item` ON `kitchen_grn`.`id` = `kitchen_grn_item`.`kitchen_grn_id`"
                    + " WHERE `supplier_mobile` = '" + jTextField2.getText() + "' "
                    + " AND (`kitchen_grn`.`total` - `kitchen_grn`.`paid_amount`) > 0 "
                    + " GROUP BY  `kitchen_grn`.`id` ");

            
            while (resultSet.next()) {
                DueGrn dueGrn = new DueGrn();
                dueGrn.setGrnid(resultSet.getString("id"));
                dueGrn.setSuppliermobile(resultSet.getString("supplier_mobile"));
                dueGrn.setOrderDate(resultSet.getString("date"));
                dueGrn.setItemCount(resultSet.getInt("count"));
                dueGrn.setTotal(resultSet.getDouble("total"));
                dueGrn.setPaidAmount(resultSet.getDouble("paid_amount"));
                dueGrn.setDue(resultSet.getDouble("due"));

                dueGrnMap.put(resultSet.getString("id"), dueGrn);
            }

            resultSet = Mysql.execute("SELECT `direct_selling_grn`.`id` ,`direct_selling_grn`.`supplier_mobile`, `direct_selling_grn`.`date`, "
                    + "COUNT(`direct_selling_grn`.`id`) AS `count`, (`direct_selling_grn`.`total` - `direct_selling_grn`.`paid_amount`) AS `due` "
                    + ",total,paid_amount "
                    + "FROM `direct_selling_grn` INNER JOIN `direct_selling_grn_item` "
                    + "ON `direct_selling_grn`.`id` = `direct_selling_grn_item`.direct_selling_grn_id "
                    + "WHERE `supplier_mobile` = '" + jTextField2.getText() + "'  "
                    + "AND (`direct_selling_grn`.`total` - `direct_selling_grn`.`paid_amount`) > 0 "
                    + "GROUP BY `direct_selling_grn`.`id`");

            while (resultSet.next()) {
                DueGrn dueGrn = new DueGrn();
                dueGrn.setGrnid(resultSet.getString("id"));
                dueGrn.setSuppliermobile(resultSet.getString("supplier_mobile"));
                dueGrn.setOrderDate(resultSet.getString("date"));
                dueGrn.setItemCount(resultSet.getInt("count"));
                dueGrn.setTotal(resultSet.getDouble("total"));
                dueGrn.setPaidAmount(resultSet.getDouble("paid_amount"));
                dueGrn.setDue(resultSet.getDouble("due"));

                dueGrnMap.put(resultSet.getString("id"), dueGrn);
            }

            double totaldue = 0;
            DecimalFormat formatter = new DecimalFormat("#,##0.00");
            for (DueGrn grn : dueGrnMap.values()) {
                Vector v = new Vector();
                v.add(grn.getGrnid());
                v.add(grn.getOrderDate());
                v.add(grn.getItemCount());
                v.add(formatter.format(grn.getTotal()));
                v.add(formatter.format(grn.getPaidAmount()));
                v.add(formatter.format(grn.getDue()));
                totaldue += grn.getDue();
                model.addRow(v);
            }
            if (model.getRowCount() == 0) {
                this.dispose();
            }
            jTextField3.setText("Rs. " + formatter.format(totaldue));

        } catch (Exception ex) {
            Logger.getLogger(SingleSupplierDuePayment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadSupplierDetails(String mobile) {
        try {
            Mysql.execute("SELECT `mobile` FROM `supplier`");
        } catch (Exception ex) {
            Logger.getLogger(SingleSupplierDuePayment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier Due Payments");
        setMinimumSize(new java.awt.Dimension(962, 555));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECTED SUPPLIER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 14)), javax.swing.BorderFactory.createEmptyBorder(10, 10, 15, 10))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 120));
        jPanel3.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        jPanel9.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel9.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Supplier Name");
        jLabel1.setPreferredSize(new java.awt.Dimension(71, 40));
        jPanel9.add(jLabel1, java.awt.BorderLayout.CENTER);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setFocusable(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(71, 40));
        jPanel9.add(jTextField1, java.awt.BorderLayout.PAGE_END);

        jPanel3.add(jPanel9);

        jPanel4.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel4.setLayout(new java.awt.BorderLayout(5, 5));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Mobile");
        jLabel2.setPreferredSize(new java.awt.Dimension(71, 40));
        jPanel4.add(jLabel2, java.awt.BorderLayout.CENTER);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setFocusable(false);
        jTextField2.setPreferredSize(new java.awt.Dimension(71, 40));
        jPanel4.add(jTextField2, java.awt.BorderLayout.PAGE_END);

        jPanel3.add(jPanel4);

        jPanel2.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Total Due Payments");
        jLabel3.setPreferredSize(new java.awt.Dimension(71, 40));
        jPanel2.add(jLabel3, java.awt.BorderLayout.CENTER);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setFocusable(false);
        jTextField3.setPreferredSize(new java.awt.Dimension(71, 40));
        jPanel2.add(jTextField3, java.awt.BorderLayout.PAGE_END);

        jPanel3.add(jPanel2);

        jPanel5.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(77, 120, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VIEW GRN");
        jButton1.setAutoscrolls(true);
        jButton1.setPreferredSize(new java.awt.Dimension(90, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, java.awt.BorderLayout.PAGE_END);

        jPanel3.add(jPanel5);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel8.setLayout(new java.awt.BorderLayout(0, 5));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN ID", "ORDER DATE", "ITEM COUNT", "TOTAL (RS)", "PAID (RS)", "DUE (RS)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel8.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        viewGrn();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(SingleSupplierDuePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingleSupplierDuePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingleSupplierDuePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingleSupplierDuePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SingleSupplierDuePayment dialog = new SingleSupplierDuePayment(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void setStyle() {
        jTable1.setDefaultRenderer(String.class, CustomStyle.renderCenter);
        jTable1.setDefaultRenderer(Double.class, CustomStyle.renderRight);
    }
    
     private void viewGrn() {
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select grn to view", "Warning!", JOptionPane.WARNING_MESSAGE);
            jButton1.setEnabled(false);
        } else {
            jButton1.setEnabled(true);

            String grnid = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));

            SupplierGrnView allSupplierViewItems = new SupplierGrnView(new JFrame(), true);
            allSupplierViewItems.setGrn(dueGrnMap.get(grnid));
            allSupplierViewItems.setSingleSupplierDuePayment(this);
            allSupplierViewItems.setVisible(true);
        }
    }
}
