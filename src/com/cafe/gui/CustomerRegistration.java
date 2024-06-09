package com.cafe.gui;

import com.cafe.model.Mysql;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author User
 */
public class CustomerRegistration extends javax.swing.JPanel {

    private Dashboard dashboard;

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }
    /**
     * Creates new form CustomerRegistration
     */
    public CustomerRegistration() {
        initComponents();
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
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 20));
        setLayout(new java.awt.BorderLayout(20, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 536));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(300, 68));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Name");
        jPanel5.add(jLabel2, java.awt.BorderLayout.CENTER);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(71, 40));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField2, java.awt.BorderLayout.PAGE_END);

        jPanel4.add(jPanel5);

        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 68));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Mobile");
        jPanel6.add(jLabel3, java.awt.BorderLayout.CENTER);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(71, 40));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel6.add(jTextField3, java.awt.BorderLayout.PAGE_END);

        jPanel4.add(jPanel6);

        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("Update");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(75, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, java.awt.BorderLayout.NORTH);

        jPanel4.add(jPanel7);

        jPanel1.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel10.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel10.setLayout(new java.awt.BorderLayout(0, 20));

        jPanel11.setPreferredSize(new java.awt.Dimension(0, 90));
        jPanel11.setLayout(new java.awt.GridLayout(2, 1, 0, 10));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setText("Check Per Order");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(144, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton2);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton3.setText("Check reservations");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(161, 40));
        jPanel11.add(jButton3);

        jPanel10.add(jPanel11, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel10, java.awt.BorderLayout.CENTER);
        jPanel10.getAccessibleContext().setAccessibleName("");

        add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel3.setPreferredSize(new java.awt.Dimension(513, 48));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField1.setText("Search Customer");
        jTextField1.setPreferredSize(new java.awt.Dimension(200, 22));
        jPanel3.add(jTextField1, java.awt.BorderLayout.EAST);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("10 customer count");
        jPanel3.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.NORTH);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        }

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = jTextField2.getText();
        String mobile = jTextField3.getText();
        
        if(name.isEmpty()){
        JOptionPane.showMessageDialog(this, "Please Enter Your Name", "Warning", JOptionPane.WARNING_MESSAGE);
        
        }else if(mobile.isEmpty()){
        JOptionPane.showMessageDialog(this, "Please Enter Your Mobile", "Warning", JOptionPane.WARNING_MESSAGE);
        
        }else if(!mobile.matches("^07[01245678]{1}[0-9]{7}$")){
        JOptionPane.showMessageDialog(this, "Your Mobile Number is Invalid", "Warning", JOptionPane.WARNING_MESSAGE);
        
        }else{
            try {
                Mysql.execute("UPDATE `customer` SET `name``= '"+name+"' `mobile` = '"+mobile+"' WHERE ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        
        
        
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        
        
        jTextField2.setText(String.valueOf(jTable1.getValueAt(row, 1)));
        jTextField3.setText(String.valueOf(jTable1.getValueAt(row, 2))); 
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        String moblie = jTextField3.getText();
            try {
             ResultSet rs=   Mysql.execute("SELECT * FROM `customer` WHERE `mobile` = '"+moblie+"'");
                if(rs.next()){
                    
                
                
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
