/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miniprojects.Frames;

import com.miniprojects.connectivity.*;
import com.miniprojects.Frames.*;
import com.miniprojects.beans.StudentBean;
import com.miniprojects.dao.StudentDao;
import com.miniprojects.daoImple.StudentDaoImple;
import javax.swing.JOptionPane;

/**
 *
 * @author Usama Sajid
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form ViewAccountant1
     */
    public AddStudent() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public void addStudent() {

        StudentBean sb = new StudentBean();

        if (validateEmptyAddStudentsTf() == 0) {

            String name = txtName.getText();
            String email = txtEmail.getText();
            String course = txtEmail.getText();

            try {
                int fees = Integer.parseInt(txtFees.getText());
                int paid = Integer.parseInt(txtPaid.getText());
                int due = Integer.parseInt(txtDue.getText());

                String address = txtAddress.getText();
                String contact = txtContact.getText();

                sb.setName(name);
                sb.setEmail(email);
                sb.setCourse(course);
                sb.setFee(fees);
                sb.setPaid(paid);
                sb.setDue(due);
                sb.setAddress(address);
                sb.setContact(contact);

            } catch (NumberFormatException exe) {

                //   exe.printStackTrace();
            }
            StudentDao sd = new StudentDaoImple();
            int result = sd.addStudent(sb);

            if (result != 0) {

                JOptionPane.showMessageDialog(null, "Student Added Successfully");
                resetAllTextFields();

            } else {

                JOptionPane.showMessageDialog(null, "Error");

            }
        } else {

            validateEmptyAddStudentsTf();
        }
    }

    public int validateEmptyAddStudentsTf() {

        int empty = 0;

        if (txtName.getText().equals("")) {

            lblInputName.setText("*Enter Name First");
            empty++;

        }
        if (txtEmail.getText().equals("")) {

            lblInputEmail.setText("*Enter Email First");
            empty++;
        }

        if (txtCourse.getText().equals("")) {

            lblInputCourse.setText("*Enter Course First");
            empty++;
        }

        if (txtFees.getText().equals("")) {

            lblInputFees.setText("*Enter Fees First");
            txtFees.setText("0");

            empty++;

        }

        if (txtPaid.getText().equals("")) {

            lblInputPaid.setText("*Enter Paid Fees");
            txtPaid.setText("0");
            empty++;

        }
        if (txtDue.getText().equals("")) {

            txtDue.setText("0");
            empty++;

        }

        if (txtContact.getText().equals("")) {

            lblInputContact.setText("*Enter Contact Info ");
            empty++;
        }
        if (txtAddress.getText().equals("")) {

            lblInputAddress.setText("*Enter Address First");
            empty++;
        }

        return empty;

    }

    public void resetAllTextFields() {

        txtName.setText("");
        txtEmail.setText("");
        txtCourse.setText("");
        txtFees.setText("");
        txtPaid.setText("");
        txtDue.setText("");
        txtContact.setText("");
        txtAddress.setText("");

        lblInputName.setText("");
        lblInputEmail.setText("");
        lblInputCourse.setText("");
        lblInputFees.setText("");
        lblInputPaid.setText("");
        lblInputDue.setText("");
        lblInputContact.setText("");
        lblInputAddress.setText("");

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
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCourse = new javax.swing.JTextField();
        txtFees = new javax.swing.JTextField();
        txtPaid = new javax.swing.JTextField();
        txtDue = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblInputName = new javax.swing.JLabel();
        lblInputEmail = new javax.swing.JLabel();
        lblInputCourse = new javax.swing.JLabel();
        lblInputFees = new javax.swing.JLabel();
        lblInputPaid = new javax.swing.JLabel();
        lblInputDue = new javax.swing.JLabel();
        lblInputContact = new javax.swing.JLabel();
        lblInputAddress = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 60, 160, 30));

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
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 160, 30));

        txtCourse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCourseFocusGained(evt);
            }
        });
        txtCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseActionPerformed(evt);
            }
        });
        jPanel1.add(txtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, 160, 30));

        txtFees.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFeesFocusGained(evt);
            }
        });
        txtFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeesActionPerformed(evt);
            }
        });
        jPanel1.add(txtFees, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, 160, 30));

        txtPaid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPaidFocusLost(evt);
            }
        });
        txtPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaidActionPerformed(evt);
            }
        });
        jPanel1.add(txtPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 160, 30));

        txtDue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDueFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDueFocusLost(evt);
            }
        });
        txtDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDueActionPerformed(evt);
            }
        });
        jPanel1.add(txtDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 450, 160, 30));

        txtContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactFocusGained(evt);
            }
        });
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 530, 160, 30));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 600, 200, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/check.png"))); // NOI18N
        btnAdd.setText("Submit");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 660, 100, 30));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/import.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 90, -1));

        lblInputName.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        lblInputName.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblInputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 130, 20));

        lblInputEmail.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        lblInputEmail.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblInputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 160, 130, 20));

        lblInputCourse.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        lblInputCourse.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblInputCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, 140, 20));

        lblInputFees.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        lblInputFees.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblInputFees, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 120, 20));

        lblInputPaid.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        lblInputPaid.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblInputPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, 120, 20));

        lblInputDue.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        lblInputDue.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblInputDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 120, 20));

        lblInputContact.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        lblInputContact.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblInputContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 560, 170, 20));

        lblInputAddress.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        lblInputAddress.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblInputAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 700, 170, 20));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/Add Student.png"))); // NOI18N
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

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeesActionPerformed

    private void txtPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaidActionPerformed

    private void txtDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDueActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        addStudent();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtPaidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaidFocusLost
        // TODO add your handling code here:

        int fees = Integer.parseInt(txtFees.getText());
        int paid = Integer.parseInt(txtPaid.getText());
        int due = fees - paid;
        txtDue.setText(String.valueOf(due));

    }//GEN-LAST:event_txtPaidFocusLost

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        AccountantSection as = new AccountantSection();
        as.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:

        lblInputName.setText("");

    }//GEN-LAST:event_txtNameFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        lblInputEmail.setText("");
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtCourseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCourseFocusGained
        // TODO add your handling code here:

        lblInputCourse.setText("");

    }//GEN-LAST:event_txtCourseFocusGained

    private void txtFeesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFeesFocusGained
        // TODO add your handling code here:

        lblInputFees.setText("");

    }//GEN-LAST:event_txtFeesFocusGained

    private void txtPaidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaidFocusGained
        // TODO add your handling code here:

        lblInputPaid.setText("");
    }//GEN-LAST:event_txtPaidFocusGained

    private void txtDueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDueFocusGained
        // TODO add your handling code here:

        lblInputDue.setText("");

    }//GEN-LAST:event_txtDueFocusGained

    private void txtContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusGained
        // TODO add your handling code here:

        lblInputContact.setText("");
    }//GEN-LAST:event_txtContactFocusGained

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        // TODO add your handling code here:

        lblInputAddress.setText("");
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtDueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDueFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDueFocusLost

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblInputAddress;
    private javax.swing.JLabel lblInputContact;
    private javax.swing.JLabel lblInputCourse;
    private javax.swing.JLabel lblInputDue;
    private javax.swing.JLabel lblInputEmail;
    private javax.swing.JLabel lblInputFees;
    private javax.swing.JLabel lblInputName;
    private javax.swing.JLabel lblInputPaid;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtDue;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFees;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPaid;
    // End of variables declaration//GEN-END:variables
}
