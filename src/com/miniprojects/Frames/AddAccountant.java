/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miniprojects.Frames;

import com.miniprojects.connectivity.*;
import com.miniprojects.Frames.*;
import com.miniprojects.beans.AccountBean;
import com.miniprojects.dao.AccountantDao;
import com.miniprojects.daoImple.AccountDaoImple;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Usama Sajid
 */
public class AddAccountant extends javax.swing.JFrame {

    /**
     * Creates new form ViewAccountant1
     */
    public AddAccountant() {
        initComponents();
    }
    
    public void addAccountant() {
        
        String name = txtName.getText();
        String pass = txtPass.getText();
        String email = txtEmail.getText();
        String contact = txtContact.getText();
        
        AccountBean ab = new AccountBean();
        ab.setName(name);
        ab.setPassword(pass);
        ab.setEmail(email);
        ab.setContact(contact);
        
        if (validateEmptyTextFields() == 0) {
            
            AccountantDao ad = new AccountDaoImple();
            int result = ad.addAccountant(ab);
            
            if (result != 0) {
                
                JOptionPane.showMessageDialog(null, "Accountant Added Succesfully");
                resetTextFields();
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Error ", "Alert", JOptionPane.WARNING_MESSAGE);
                
            }
        }
    }
    
    public void resetTextFields() {
        
        txtName.setText("");
        txtPass.setText("");
        txtEmail.setText("");
        txtContact.setText("");
        
    }
    
    public int validateEmptyTextFields() {
        
        int empty = 0;
        
        if (txtName.getText().equals("")) {
            
            lblInputName.setText("*Please Enter Name First");
            empty++;
            
        }
        if (txtPass.getText().equals("")) {
            
            lblInputPass.setText("*Please Enter Password First");
            empty++;
            
        }
        if (txtEmail.getText().equals("")) {
            
            lblInpEmail.setText("*Pleasse Enter Email First");
            empty++;
        } else {
            
            boolean b = Pattern.matches("^(.+)@(.+)$", txtEmail.getText());
            if (b == false) {
                lblInpEmail.setText("*Enter Valid Email");
                empty++;
            }
        }
        if (txtContact.getText().equals("")) {
            
            lblInputContact.setText("*Please Enter Contact  First");
            
            empty++;
            
        } else {
            
            boolean b = Pattern.matches("[0-9]{11}", txtContact.getText());
            if (b == false) {
                
                lblInputContact.setText("*Format 03103181253");
                empty++;
                
            }
            
        }
        
        return empty;
        
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
        txtContact = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        lblInputName = new javax.swing.JLabel();
        lblInputPass = new javax.swing.JLabel();
        lblInpEmail = new javax.swing.JLabel();
        lblInputContact = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactFocusGained(evt);
            }
        });
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
        });
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 190, 40));

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 190, 40));

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 190, 40));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/submit.png"))); // NOI18N
        btnAdd.setText("Submit");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 603, 120, 40));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/import.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 603, 90, 40));

        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 190, 40));

        lblInputName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblInputName.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblInputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 180, -1));

        lblInputPass.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblInputPass.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblInputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 190, 20));

        lblInpEmail.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblInpEmail.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblInpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 190, 20));

        lblInputContact.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblInputContact.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblInputContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 190, 20));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/Add Accountant.png"))); // NOI18N
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        addAccountant();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        AdminSection as = new AdminSection();
        as.setVisible(true);
        this.setVisible(false);
        

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            addAccountant();
            
        }
        

    }//GEN-LAST:event_txtContactKeyPressed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:

        lblInputName.setText("");
    }//GEN-LAST:event_txtNameFocusGained

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        // TODO add your handling code here:
        lblInputPass.setText("");

    }//GEN-LAST:event_txtPassFocusGained

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusGained
        // TODO add your handling code here:
        lblInputContact.setText("");

    }//GEN-LAST:event_txtContactFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:

        lblInpEmail.setText("");
    }//GEN-LAST:event_txtEmailFocusGained

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
            java.util.logging.Logger.getLogger(AddAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAccountant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblInpEmail;
    private javax.swing.JLabel lblInputContact;
    private javax.swing.JLabel lblInputName;
    private javax.swing.JLabel lblInputPass;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}