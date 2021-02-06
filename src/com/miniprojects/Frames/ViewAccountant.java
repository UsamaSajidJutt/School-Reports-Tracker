/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miniprojects.Frames;

import com.miniprojects.dao.AccountantDao;
import com.miniprojects.daoImple.AccountDaoImple;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usama Sajid
 */
public class ViewAccountant extends javax.swing.JFrame {

    /**
     * Creates new form ViewAccountant1
     */
    public ViewAccountant() {
        initComponents();
        setTable();
    }

    public void setTable() {

        try {
            AccountantDao ad = new AccountDaoImple();
            tableView.setModel(buildTableModel(ad.viewAccountants()));
        } catch (Exception exe) {
            exe.printStackTrace();
        }
    }

    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableView = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAllRecords = new javax.swing.JButton();
        btn10Records = new javax.swing.JButton();
        btn50Records = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableView.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        tableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableViewKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableView);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 790, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/import.png"))); // NOI18N
        btnBack.setText("B a c k");
        btnBack.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnBackFocusGained(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 400, 130, 30));

        btnAllRecords.setBackground(new java.awt.Color(255, 255, 255));
        btnAllRecords.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        btnAllRecords.setText("ALL RECORDS");
        btnAllRecords.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnAllRecordsFocusGained(evt);
            }
        });
        btnAllRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllRecordsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 340, 130, -1));

        btn10Records.setBackground(new java.awt.Color(255, 255, 255));
        btn10Records.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        btn10Records.setText("TEN RECORDS");
        btn10Records.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn10RecordsFocusGained(evt);
            }
        });
        btn10Records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10RecordsActionPerformed(evt);
            }
        });
        jPanel1.add(btn10Records, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 240, 130, -1));

        btn50Records.setBackground(new java.awt.Color(255, 255, 255));
        btn50Records.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        btn50Records.setText("FIFTY RECORDS");
        btn50Records.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn50RecordsFocusGained(evt);
            }
        });
        btn50Records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50RecordsActionPerformed(evt);
            }
        });
        jPanel1.add(btn50Records, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 290, 130, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/miniprojects/design/View Accountants.png"))); // NOI18N
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

    AdminSection as = new AdminSection();


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        as.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:


    }//GEN-LAST:event_btnBackActionPerformed

    private void tableViewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableViewKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

            as.setVisible(true);
            this.setVisible(false);
        }


    }//GEN-LAST:event_tableViewKeyPressed

    private void btn10RecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10RecordsActionPerformed
        // TODO add your handling code here:

        try {
            AccountantDao ad = new AccountDaoImple();
            tableView.setModel(buildTableModel(ad.viewTenAccountants()));
        } catch (Exception exe) {
            exe.printStackTrace();
        }


    }//GEN-LAST:event_btn10RecordsActionPerformed

    private void btnAllRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllRecordsActionPerformed
        // TODO add your handling code here:

        setTable();


    }//GEN-LAST:event_btnAllRecordsActionPerformed

    private void btn50RecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50RecordsActionPerformed
        // TODO add your handling code here:
        
          try {
            AccountantDao ad = new AccountDaoImple();
            tableView.setModel(buildTableModel(ad.viewFiftyAccountants()));
        } catch (Exception exe) {
            exe.printStackTrace();
        }
    }//GEN-LAST:event_btn50RecordsActionPerformed

    private void btn10RecordsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn10RecordsFocusGained
        // TODO add your handling code here:
        
        btn10Records.setBackground(Color.pink);
        btn50Records.setBackground(Color.white);
        btnAllRecords.setBackground(Color.white);
        btnBack.setBackground(Color.white);
        
    }//GEN-LAST:event_btn10RecordsFocusGained

    private void btn50RecordsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn50RecordsFocusGained
        // TODO add your handling code here:
        
         btn10Records.setBackground(Color.white);
        btn50Records.setBackground(Color.pink);
        btnAllRecords.setBackground(Color.white);
        btnBack.setBackground(Color.white);
        
        
    }//GEN-LAST:event_btn50RecordsFocusGained

    private void btnAllRecordsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAllRecordsFocusGained
        // TODO add your handling code here:
        
         btn10Records.setBackground(Color.white);
        btn50Records.setBackground(Color.white);
        btnAllRecords.setBackground(Color.pink);
        btnBack.setBackground(Color.white);
        
        
    }//GEN-LAST:event_btnAllRecordsFocusGained

    private void btnBackFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBackFocusGained
        // TODO add your handling code here:
        
         btn10Records.setBackground(Color.white);
        btn50Records.setBackground(Color.white);
        btnAllRecords.setBackground(Color.white);
        btnBack.setBackground(Color.pink);
        
        
    }//GEN-LAST:event_btnBackFocusGained

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
            java.util.logging.Logger.getLogger(ViewAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAccountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAccountant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10Records;
    private javax.swing.JButton btn50Records;
    private javax.swing.JButton btnAllRecords;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTable tableView;
    // End of variables declaration//GEN-END:variables
}
