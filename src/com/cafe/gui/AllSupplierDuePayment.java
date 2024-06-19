/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.cafe.gui;

import com.cafe.model.DueGrn;
import com.cafe.model.Mysql;
import com.cafe.style.CustomStyle;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class AllSupplierDuePayment extends javax.swing.JDialog {

    private String mobile;
    private HashMap<String,DueGrn> dueGrnMap = new HashMap<>();

    /**
     * Creates new form AllSupplierDuePayment
     */
    public AllSupplierDuePayment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadGrnTable();
        setStyle();
    }

    public void loadGrnTable() {
        dueGrnMap.clear();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        try {
            ResultSet resultSet = Mysql.execute("SELECT `kitchen_grn`.`id` ,`kitchen_grn`.`supplier_mobile`, `kitchen_grn`.`date`,COUNT(`kitchen_grn`.`id`) AS `count`,"
                    + "(`kitchen_grn`.`total` - `kitchen_grn`.`paid_amount`) AS `due`,total,paid_amount "
                    + "FROM `kitchen_grn` INNER JOIN `kitchen_grn_item` ON `kitchen_grn`.`id` = `kitchen_grn_item`.`kitchen_grn_id` "
                    + "WHERE (`kitchen_grn`.`total` - `kitchen_grn`.`paid_amount`) > 0 "
                    + "GROUP BY `kitchen_grn`.`id` ");

            while (resultSet.next()) {
                DueGrn dueGrn = new DueGrn();
                dueGrn.setGrnid( resultSet.getString("id"));
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
                    + "WHERE (`direct_selling_grn`.`total` - `direct_selling_grn`.`paid_amount`) > 0 "
                    + "GROUP BY `direct_selling_grn`.`id`");
            
            while (resultSet.next()) {
                DueGrn dueGrn = new DueGrn();
                dueGrn.setGrnid( resultSet.getString("id"));
                dueGrn.setSuppliermobile(resultSet.getString("supplier_mobile"));
                dueGrn.setOrderDate(resultSet.getString("date"));
                dueGrn.setItemCount(resultSet.getInt("count"));
                dueGrn.setTotal(resultSet.getDouble("total"));
                dueGrn.setPaidAmount(resultSet.getDouble("paid_amount"));
                dueGrn.setDue(resultSet.getDouble("due"));
                
                dueGrnMap.put(resultSet.getString("id"), dueGrn);
            }
            
            DecimalFormat formatter = new DecimalFormat("#,##0.00");
            for(DueGrn grn : dueGrnMap.values()){
                Vector v = new Vector();
                v.add(grn.getGrnid());
                v.add(grn.getSuppliermobile());
                v.add(grn.getOrderDate());
                v.add(grn.getItemCount());
                v.add(formatter.format(grn.getTotal()));
                v.add(formatter.format(grn.getPaidAmount()));
                v.add(formatter.format(grn.getDue()));

                model.addRow(v);
            }
            
            if (model.getRowCount() == 0) {
                this.dispose();
            }
            jLabel3.setText("DUE GRN LIST (" + model.getRowCount() + ")");
        } catch (Exception ex) {
            Logger.getLogger(AllSupplierDuePayment.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel2.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel2.setLayout(new java.awt.BorderLayout(5, 5));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier Due Paymnets");
        setMinimumSize(new java.awt.Dimension(963, 547));
        setResizable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout(0, 20));

        jPanel3.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel3.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel9.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel9.setLayout(new java.awt.BorderLayout(5, 0));

        jButton1.setBackground(new java.awt.Color(77, 120, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VIEW GRN");
        jButton1.setPreferredSize(new java.awt.Dimension(106, 40));
        jButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButton1ItemStateChanged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jButton1VetoableChange(evt);
            }
        });
        jPanel9.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9, java.awt.BorderLayout.EAST);

        jPanel1.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setText("DUE GRN COUNT");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel1.add(jLabel3, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel6.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel8.setLayout(new java.awt.BorderLayout(0, 5));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN ID", "SUPPLIER MOBILE", "ORDER DATE", "ITEMS", "TOTAL (RS)", "PAID (RS)", "DUE (RS)  "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(0);
        }

        jPanel8.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        viewGrn();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButton1ItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ItemStateChanged

    private void jButton1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jButton1VetoableChange
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1VetoableChange

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarkLaf.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AllSupplierDuePayment dialog = new AllSupplierDuePayment(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void viewGrn() {
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select grn to view", "Warning!", JOptionPane.WARNING_MESSAGE);
            jButton1.setEnabled(false);
        } else {
            jButton1.setEnabled(true);

            String grnid = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));

            SupplierGrnView allSupplierViewItems = new SupplierGrnView(new JFrame(), true);
            allSupplierViewItems.setGrn(dueGrnMap.get(grnid));
            allSupplierViewItems.setAllSupplierDuePayment(this);
            allSupplierViewItems.setVisible(true);
        }
    }

    private void setStyle() {
        jTable1.setDefaultRenderer(String.class, CustomStyle.renderCenter);
        jTable1.setDefaultRenderer(Double.class, CustomStyle.renderRight);
    }
}
