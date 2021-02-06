/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miniprojects.Frames;

import com.miniprojects.beans.AccountBean;
import com.miniprojects.dao.AccountantDao;
import com.miniprojects.daoImple.AccountDaoImple;
import com.sun.glass.events.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Usama Sajid
 */
public class AccountantLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminSection1
     */
    public AccountantLogin() {
        initComponents();
    }

    public void login() {

        String uname = txtUsername1.getText();
        String pass = txtPass.getText();

        AccountBean ab = new AccountBean();
        ab.setName(uname);
        ab.setPassword(pass);

        
        
        AccountantDao ad = new AccountDaoImple();
        int login = ad.loginAccountant(ab);

        if (!(uname.equals("")) && !(pass.equals(""))) {

            if (login > 0) {

                AccountantSection as = new AccountantSection();
                as.setVisible(true);
                this.setVisible(false);

            } else {

                JOptionPane.showMessageDialog(null, "Login Error");

            }

        } else {

            if (uname.equals("") && pass.equals("")) {

                lblUserPopup.setText("*Please Enter Username");
                lblPassPop.setText("*Please Enter Password");

            } else if (uname.equals("") && (!pass.equals(""))) {

                lblUserPopup.setText("*Please Enter Username ");

            } else {

                lblPassPop.setText("*Please Enter Password");

            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsername1 = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        view = new javax.swing.JCheckBox();
        lblCloseEye = new javax.swing.JLabel();
        lblOpenEye = new javax.swing.JLabel();
        lblPassPop = new javax.swing.JLabel();
        lblUserPopup = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername1.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        txtUsername1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsername1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsername1FocusLost(evt);
            }
        });
        txtUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername1ActionPerformed(evt);
            }
        });
        txtUsername1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsername1KeyPressed(evt);
            }
        });
        jPanel1.add(txtUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 180, 40));

        btnLogin.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/check.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, 90, 30));

        btnBack.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/import.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, 90, 30));

        txtPass.setFont(new java.awt.Font("Urdu Typesetting", 1, 21)); // NOI18N
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 180, 40));

        view.setSelected(true);
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, 20, 20));

        lblCloseEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/Close Eye.png"))); // NOI18N
        lblCloseEye.setEnabled(false);
        jPanel1.add(lblCloseEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 30, 20));

        lblOpenEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/open eye.png"))); // NOI18N
        jPanel1.add(lblOpenEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 20, 20));

        lblPassPop.setFont(new java.awt.Font("Gungsuh", 1, 13)); // NOI18N
        jPanel1.add(lblPassPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 170, 20));

        lblUserPopup.setFont(new java.awt.Font("Gungsuh", 1, 13)); // NOI18N
        jPanel1.add(lblUserPopup, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 180, 20));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/Accountant Login.png"))); // NOI18N
        jPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

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
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername1ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        login();


    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        Dashboard db = new Dashboard();
        db.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_btnBackActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:

        if (view.isSelected()) {
            txtPass.setEchoChar('*');
            lblCloseEye.setVisible(true);
            lblOpenEye.setVisible(false);

        } else {

            txtPass.setEchoChar((char) 0);
            lblCloseEye.setVisible(false);
            lblOpenEye.setVisible(true);
        }


    }//GEN-LAST:event_viewActionPerformed

    private void txtUsername1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsername1FocusGained
        // TODO add your handling code here:

        lblUserPopup.setText("");

    }//GEN-LAST:event_txtUsername1FocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        // TODO add your handling code here:


    }//GEN-LAST:event_txtPassFocusLost

    private void txtUsername1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsername1FocusLost
        // TODO add your handling code here:


    }//GEN-LAST:event_txtUsername1FocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        // TODO add your handling code here:

        lblPassPop.setText("");

    }//GEN-LAST:event_txtPassFocusGained

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            login();
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            login();
        }

    }//GEN-LAST:event_txtPassKeyPressed

    private void txtUsername1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsername1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            login();

        }


    }//GEN-LAST:event_txtUsername1KeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCloseEye;
    private javax.swing.JLabel lblOpenEye;
    private javax.swing.JLabel lblPassPop;
    private javax.swing.JLabel lblUserPopup;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername1;
    private javax.swing.JCheckBox view;
    // End of variables declaration//GEN-END:variables
}
