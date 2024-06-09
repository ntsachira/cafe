
package com.cafe.gui;

import com.cafe.model.Mysql;
import com.cafe.model.User;
import com.cafe.style.CustomStyle;
import com.cafe.style.Pallet;
import com.cafe.style.Pallet.Mode;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Dell
 */
public class ThemeSelection extends javax.swing.JFrame {

    private User user;
    /**
     * Creates new form ThemeSelection
     */
    public ThemeSelection(User user) {
        initComponents();
        CustomStyle.setIcon(this);
        setSampleThemes();
        this.user = user;
    }

    private void setSampleThemes() {
        SampleTheme sample1 = new SampleTheme();
        sample1.setThemeSelection(this);
        sample1.setParentPanel(jPanel1);
        sample1.setDarkTheme();

        SampleTheme sample2 = new SampleTheme();
        sample2.setParentPanel(jPanel2);
        sample2.setThemeSelection(this);

        jPanel1.add(sample1.getRootPane());
        jPanel2.add(sample2.getRootPane());
    }

  

    private void setDashboard() {
        this.dispose();   
        updateTheme();
        Dashboard d = new Dashboard(this.user);
        Pallet.setDashboard(d);        
        d.setComponentTheme();
        SwingUtilities.updateComponentTreeUI(d);
        d.setVisible(true);
    }
    
    private void updateTheme(){
        Mode mode = Mode.DARK;
        if (lightButton.isSelected()) {
            Pallet.setLightMode();
            FlatLightLaf.setup();
            mode = Mode.LIGHT;
        } else {
            FlatOneDarkIJTheme.setup();
            Pallet.setDarkMode();
        }
        
            Mysql.execute("UPDATE `system` SET `theme`= '"+mode.name()+"' ");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel11 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lightButton = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        darkButton = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1284, 704));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1284, 704));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(77, 120, 204)));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 20, 20));
        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204))));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel6.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
        jPanel9.setPreferredSize(new java.awt.Dimension(612, 60));
        jPanel9.setLayout(new java.awt.BorderLayout());

        buttonGroup1.add(lightButton);
        lightButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lightButton.setSelected(true);
        lightButton.setText("Default light");
        lightButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lightButton.setIconTextGap(50);
        jPanel9.add(lightButton, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        jPanel3.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204))));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel7.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
        jPanel8.setPreferredSize(new java.awt.Dimension(612, 60));
        jPanel8.setLayout(new java.awt.BorderLayout());

        buttonGroup1.add(darkButton);
        darkButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        darkButton.setText("Dark Dimmed");
        darkButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        darkButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        darkButton.setIconTextGap(50);
        darkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkButtonActionPerformed(evt);
            }
        });
        jPanel8.add(darkButton, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jPanel3.add(jPanel7);

        jPanel11.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose Your Theme");
        jLabel1.setPreferredSize(new java.awt.Dimension(337, 80));
        jPanel4.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(1284, 20));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1282, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jPanel11.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 20, 30, 20));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(77, 120, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Continue");
        jButton1.setMaximumSize(new java.awt.Dimension(96, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(96, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(180, 48));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, java.awt.BorderLayout.EAST);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("* You can change this setting later");
        jLabel2.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel5.add(jLabel2, java.awt.BorderLayout.WEST);

        jPanel11.add(jPanel5, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel11, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void darkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_darkButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setDashboard();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemeSelection(new User()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton darkButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton lightButton;
    // End of variables declaration//GEN-END:variables
}
