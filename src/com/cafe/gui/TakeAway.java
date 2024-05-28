
package com.cafe.gui;

import com.cafe.style.Pallet;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.SwingUtilities;

public class TakeAway extends javax.swing.JDialog {

    
    public TakeAway(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        FlatLightLaf.setup();
        SwingUtilities.updateComponentTreeUI(this);
        Pallet.ResetTheme();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Take away payment process");
        setMinimumSize(new java.awt.Dimension(578, 360));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(578, 360));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 110));
        jPanel2.setLayout(new java.awt.BorderLayout(40, 0));

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 123));
        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("Cash");
        jToggleButton1.setPreferredSize(new java.awt.Dimension(0, 90));
        jPanel3.add(jToggleButton1);

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jToggleButton2.setText("Card");
        jToggleButton2.setPreferredSize(new java.awt.Dimension(0, 90));
        jPanel3.add(jToggleButton2);

        jPanel2.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(3, 0));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("PAID AMOUNT");
        jPanel5.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("0");
        jPanel5.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("TOTAL DISCOUNT");
        jPanel6.add(jLabel3, java.awt.BorderLayout.LINE_START);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("0");
        jPanel6.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("BALANCE");
        jPanel7.add(jLabel5, java.awt.BorderLayout.LINE_START);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("0");
        jPanel7.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setMinimumSize(new java.awt.Dimension(200, 39));
        jPanel9.setPreferredSize(new java.awt.Dimension(50, 70));
        jPanel9.setLayout(new java.awt.BorderLayout(10, 0));

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField1.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel9.add(jFormattedTextField1, java.awt.BorderLayout.CENTER);

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton2.setText("Add Payment");
        jButton2.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel9.add(jButton2, java.awt.BorderLayout.EAST);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Payment");
        jLabel7.setPreferredSize(new java.awt.Dimension(37, 30));
        jPanel9.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.add(jPanel9, java.awt.BorderLayout.NORTH);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print Invoice");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 48));
        jPanel10.add(jButton1, java.awt.BorderLayout.EAST);

        jPanel8.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TakeAway dialog = new TakeAway(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
