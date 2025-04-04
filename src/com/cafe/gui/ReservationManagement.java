
package com.cafe.gui;

import com.cafe.model.Mysql;
import com.cafe.model.User;
import com.cafe.style.CustomStyle;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class ReservationManagement extends javax.swing.JPanel {

    private HashMap<String, Object> statusMap = new HashMap<>();
    private Dashboard dashboard;

    public Dashboard getDashboard() {
        return dashboard;
    }
    
    public boolean setCustomer(String mobile){
        jTextField2.setText(mobile);
        jTextField2.setEnabled(false);
        loadData();
         if (jTable1.getModel().getRowCount() > 0) {
            return true;
        }
        return false;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    /**
     * Creates new form ReservationManagement
     */
    public ReservationManagement(Dashboard dashboard) {
        initComponents();
        setDashboard(dashboard);
        setStyle();
        loadData();
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
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        setLayout(new java.awt.BorderLayout(0, 20));

        jPanel1.setPreferredSize(new java.awt.Dimension(1269, 100));
        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        jPanel5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Reservations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14)), javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15))); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel5.add(jTextField2);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField3MouseReleased(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel5.add(jTextField3);

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jPanel5.add(jComboBox2);

        jPanel1.add(jPanel5);

        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Reservation Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14)), javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15))); // NOI18N
        jPanel4.setLayout(new java.awt.BorderLayout(10, 0));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        jTextField1.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel4.add(jTextField1, java.awt.BorderLayout.WEST);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setMaximumSize(new java.awt.Dimension(200, 32767));
        jComboBox1.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel4.add(jComboBox1, java.awt.BorderLayout.CENTER);

        jButton1.setBackground(new java.awt.Color(77, 120, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(120, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanel4);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout(0, 10));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RESERVATION ID", "CUSTOMER NAME", "CUSTOMER MOBILE", "DATE", "TIME", "ADVANCED PAY (RS)", "PARTY SIZE", "TABLE", "SPECIAL REQUEST", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(0);
        }

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setText("RESERVATION LIST");
        jPanel3.add(jLabel1, java.awt.BorderLayout.WEST);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/refresh.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, java.awt.BorderLayout.LINE_END);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setText("(10)");
        jPanel3.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.NORTH);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        loadReservationList();
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        loadReservationList();
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        loadReservationList();
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getButton()==MouseEvent.BUTTON1){
            setReservationId();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        loadData();
        resetUpdateInput();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        updateReservationState();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseReleased
        // TODO add your handling code here:
        loadReservationList();
    }//GEN-LAST:event_jTextField3MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
    private void setStyle() {
        CustomStyle.showClearButton(
                jTextField1, jTextField2, jTextField3
        );
        jTextField1.putClientProperty("JTextField.placeholderText", "Reservation ID");
        jTextField2.putClientProperty("JTextField.placeholderText", "Search by Customer Name or Mobile");
        jTextField3.putClientProperty("JTextField.placeholderText", "Search by Reservation date");
        
        DefaultTableCellRenderer renderCenter = new DefaultTableCellRenderer();
        renderCenter.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.setDefaultRenderer(String.class, renderCenter);
        DefaultTableCellRenderer renderRight = new DefaultTableCellRenderer();
        renderRight.setHorizontalAlignment(SwingConstants.RIGHT);
        jTable1.setDefaultRenderer(Double.class, renderRight);
    }

    private void loadData() {
        loadStatusComboBox();
        loadReservationList();
    }

    private void loadReservationList() {
        ResultSet result = Mysql.execute("SELECT reservation.id,customer.name,customer_mobile,reservation.`date`,reservation.`time`,advanced_payment_amount,"
                + "party_size,reservation_has_table.table_id,special_request,reservation_state.name FROM `reservation` "
                + "INNER JOIN reservation_has_table ON reservation.id = reservation_has_table.reservation_id "
                + "INNER JOIN reservation_state ON reservation_state.id = reservation.state_id "
                + "INNER JOIN customer ON reservation.customer_mobile=customer.mobile "
                + "WHERE (customer.mobile LIKE '%"+jTextField2.getText().trim()+"%' OR customer.name LIKE '"+jTextField2.getText().trim()+"%') "
                + "AND reservation.`date` LIKE '%"+jTextField3.getText().trim()+"%' "
                + "AND reservation.state_id LIKE '"+statusMap.get(String.valueOf(jComboBox2.getSelectedItem()))+"%' ORDER BY reservation.date DESC");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            while (result.next()) {
                Vector v = new Vector();
                v.add(result.getString("reservation.id"));
                v.add(result.getString("customer.name"));
                v.add(result.getString("customer_mobile"));
                v.add(result.getString("reservation.date"));
                v.add(result.getString("reservation.time"));
                v.add(new DecimalFormat("#,##0.00").format(result.getDouble("advanced_payment_amount")));
                v.add(result.getString("party_size"));
                v.add(result.getString("reservation_has_table.table_id"));
                v.add(result.getString("special_request"));
                v.add(result.getString("reservation_state.name"));

                model.addRow(v);
            }
            jTable1.setModel(model);
            jLabel2.setText("("+String.valueOf(model.getRowCount())+")");
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private void loadStatusComboBox() {
        ResultSet result = Mysql.execute("SELECT * FROM `reservation_state`");

        Vector v = new Vector();
        v.add("Select Status");
        statusMap.put("Select Status", "");
        try {
            while (result.next()) {
                v.add(result.getString("name"));
                statusMap.put(result.getString("name"), result.getString("id"));
            }
            jComboBox1.setModel(new DefaultComboBoxModel<>(v));
            jComboBox2.setModel(new DefaultComboBoxModel<>(v));
        } catch (SQLException ex) {
            Splash.logger.log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private void setReservationId() {
       jTextField1.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0))); 
    }
    
    private void resetUpdateInput() {
        jComboBox1.setSelectedIndex(0);
        jTextField1.setText("");
    }

    private void updateReservationState() {
         if(jTextField1.getText().isBlank()){
            this.dashboard.setWarningStatus("Enter Reservation ID to Update");            
        }else if(jComboBox1.getSelectedIndex()==0){
            this.dashboard.setWarningStatus("Please select status to update");
        }else{
            try {
                ResultSet result = Mysql.execute("SELECT * FROM `reservation` WHERE `id` = '"+jTextField1.getText().trim()+"'");
                if(result.next()){
                    Mysql.execute("UPDATE `reservation` SET `state_id`='"+statusMap.get(String.valueOf(jComboBox1.getSelectedItem()))+"' "
                            + "WHERE `id` = '"+jTextField1.getText().trim()+"'");
                    
                    this.dashboard.setSuccessStatus(jTextField1.getText().trim()+" - Reservation status updated");
                    dashboard.getUser().updateUserActivity(User.UserActivity.RESERVATION_STATUS_UPDATED);
                    loadReservationList(); 
                    resetUpdateInput();
                }else{
                    this.dashboard.setWarningStatus("Invalid Reservation ID");
                }
            } catch (SQLException ex) {
                Splash.logger.log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
    }
}
