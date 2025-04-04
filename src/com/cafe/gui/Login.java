package com.cafe.gui;

import com.cafe.model.Mysql;
import com.cafe.model.Theme;
import com.cafe.model.User;
import com.cafe.model.UserRole;
import com.cafe.style.CustomStyle;
import com.cafe.style.NewTheme;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Login extends javax.swing.JPanel implements UserRole {

    private Splash splash;

    public Login() {
        initComponents();
        setLoginStyle();
    }

    private void setLoginStyle() {
        jPanel5.putClientProperty(FlatClientProperties.STYLE, "arc: 50");
        CustomStyle.setButtonsRoundedMax(jButton1);
        CustomStyle.setPasswordFieldsRoundedMax(jPasswordField1);
        CustomStyle.setTextFieldsRoundedMax(jTextField1);
        CustomStyle.showClearButton(jTextField1);
        jTextField1.putClientProperty("JTextField.placeholderText", "Username");
        jPasswordField1.putClientProperty("JTextField.placeholderText", "Password");
    }

    public void setSplash(Splash splash) {
        this.splash = splash;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(992, 637));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(992, 200));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CAFE-POS");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(77, 120, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Restaurant Management System");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(77, 120, 204));
        jButton2.setText("X");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 992, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(520, 437));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cafe/img/cafe1.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(80, 437));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(43, 46, 56));

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 30, 1, 30));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(0, 1, 0, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(77, 120, 204));
        jLabel1.setText("Login");
        jPanel6.add(jLabel1);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setText("admin");
        jTextField1.setMargin(new java.awt.Insets(2, 15, 2, 15));
        jTextField1.setPreferredSize(new java.awt.Dimension(0, 50));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel6.add(jTextField1);

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField1.setText("123");
        jPasswordField1.setMargin(new java.awt.Insets(2, 15, 2, 15));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(0, 50));
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel6.add(jPasswordField1);

        jButton1.setBackground(new java.awt.Color(77, 120, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log In");
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(0, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }


    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private void login() {
        User user = validateUser();
        if (splash != null && user != null) {
            user.updateUserActivity(User.UserActivity.LOGGED_IN);
            this.splash.setDashboard(user);
        }
    }

    private User validateUser() {
        String username = jTextField1.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        if (username.isBlank()) {
            JOptionPane.showMessageDialog(this.splash, "Please enter username");
            jTextField1.grabFocus();
        } else if (password.isBlank()) {
            JOptionPane.showMessageDialog(this.splash, "Please enter password");
            jPasswordField1.grabFocus();
        } else {
            try {

                ResultSet resultSet = Mysql.execute("SELECT mobile,display_name,username,`password`,role_name,active_state.status as `status`"
                        + " FROM `user` INNER JOIN user_role ON user.user_role_id = user_role.id "
                        + " INNER JOIN active_state ON active_state.state_id = user.active_state_state_id"
                        + " WHERE `username`='" + username + "' AND `password`='" + password + "' ");
                if (resultSet != null) {
                    if (resultSet.next() && resultSet.getString("status").equals("Active")) {
                        User user = new User();
                        user.setMobile(resultSet.getString("mobile"));
                        user.setDisplay_name(resultSet.getString("display_name"));
                        user.setUsername(resultSet.getString("username"));
                        if (resultSet.getString("role_name").equals(Role.Admin.name())) {
                            user.setRole(Role.Admin);
                        } else {
                            user.setRole(Role.Cashier);
                        }
                        return user;
                    } else {
                        JOptionPane.showMessageDialog(this.splash, "Invalid username or password");
                    }
                } else {
                    if (JOptionPane.showConfirmDialog(
                            this.splash,
                            "No Database found on you Device. Please click 'YES' to proceed restore an existing database.",
                            "Database not found",
                            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {

                        if (!proceedDatabaseRestore()) {
                            if (JOptionPane.showConfirmDialog(
                                    this.splash,
                                    "Could not restore the backup. Please click 'YES' to try again",
                                    "Database Restore Failure", JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
                                proceedDatabaseRestore();
                            } else {
                                closseApplication("Sorry! Your application cannot proceed without a database. Please try again later");
                            }
                        }

                    } else {
                        closseApplication("Sorry! Your application cannot proceed without a database. Please contact support");
                    }
                }
            } catch (SQLException ex) {
                Splash.logger.log(Level.SEVERE, ex.getMessage());
                ex.printStackTrace();
            }

        }
        return null;
    }

    private void closseApplication(String message) {
        JOptionPane.showMessageDialog(
                this.splash,
                message,
                "Application Termination",
                JOptionPane.ERROR_MESSAGE);
        Splash.logger.log(Level.SEVERE, "Application closed due to no database found");
        System.exit(0);
    }

    private boolean proceedDatabaseRestore() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("SQL Files (*.sql)", "sql"));
        fileChooser.setMultiSelectionEnabled(false);
        fileChooser.showOpenDialog(this.splash);
        if (fileChooser.getSelectedFile() != null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection connection;
                try {
                    connection = java.sql.DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306",
                            Mysql.getUsername(),
                            Mysql.getPASSWORD());
                    connection.createStatement().execute("CREATE DATABASE IF NOT EXISTS cafe_db");
                    connection.close();
                } catch (SQLException ex) {
                    Splash.logger.log(Level.SEVERE, ex.getMessage());
                }
                String command = String.format(
                        "\"\"C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysql.exe\" -u%s -p%s cafe_db < \"%s\"",
                        Mysql.getUsername(),
                        Mysql.getPASSWORD(),
                        fileChooser.getSelectedFile().getPath());

                String[] commandBundle = new String[]{
                    "cmd.exe",
                    "/c",
                    command
                };
                
                jButton1.setText("Restoring in progress...");
                jButton1.setEnabled(false);
                Process process = Runtime.getRuntime().exec(commandBundle);
                new Thread(() -> {
                    int status;
                    try {
                        status = process.waitFor();
                        jButton1.setText("Log In");
                        jButton1.setEnabled(true);
                        if (status == 0) {
                            Mysql.createNewConnection();
                            JOptionPane.showMessageDialog(
                                    this.splash,
                                    "Backup restored successfully. Please Try Login again now.",
                                    "Success",
                                    JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                            String error;
                            while ((error = errorReader.readLine()) != null) {
                                Splash.logger.log(Level.SEVERE, error);
                            }
                            if (JOptionPane.showConfirmDialog(
                                    this.splash,
                                    "Could not restore the backup. Please click 'YES' to try again",
                                    "Database Restore Failure", JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
                                proceedDatabaseRestore();
                            } else {
                                closseApplication("Sorry! Your application cannot proceed without a database. Please try again later");
                            }
                        }
                    } catch (InterruptedException ex) {
                        Splash.logger.log(Level.SEVERE, ex.getMessage());
                    } catch (IOException ex) {
                        Splash.logger.log(Level.SEVERE, ex.getMessage());
                    }

                }).start();
                Thread.sleep(100);
                return true;
            } catch (IOException ex) {
                Splash.logger.log(Level.SEVERE, ex.getMessage());
            } catch (ClassNotFoundException ex) {
                Splash.logger.log(Level.SEVERE, ex.getMessage());
            } catch (IllegalArgumentException ex) {
                Splash.logger.log(Level.SEVERE, ex.getMessage());
            } catch (InterruptedException ex) {
                Splash.logger.log(Level.SEVERE, ex.getMessage());
            }
        }
        return false;
    }
}
