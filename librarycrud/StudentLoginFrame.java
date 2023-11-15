/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarycrud;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.sql.*;


public class StudentLoginFrame extends javax.swing.JFrame {
    public String user,pass;
    AdminMenu admin = new AdminMenu();
    public showProfile show = new showProfile();
    public StudentLoginFrame() {
        initComponents();
        admin.connect();
        showInfo();
    }

    public void showInfo(){
        try{
            admin.ps = admin.con.prepareStatement("SELECT Id,firstName,middleName,lastName,extensionName,course,yearAndsection FROM librarycrud WHERE username = ?");
           
            admin.ps.setString(1, user);
            
            
            admin.rs = admin.ps.executeQuery();
            
            if(admin.rs.next()){
                show.idFld.setText(admin.rs.getString(1));
                show.firstNameFld.setText(admin.rs.getString(2));
                show.middleName.setText(admin.rs.getString(3));
                show.lastNameFld.setText(admin.rs.getString(4));
                show.extensionFld.setText(admin.rs.getString(5));
                show.courseFld.setText(admin.rs.getString(6));
                show.yearFld.setText(admin.rs.getString(7));
            }
        }
        catch(Exception e){
            System.out.println("ERROR occure!!" + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        checkBox = new javax.swing.JCheckBox();
        cancelBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Please Login ");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Password :");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Username :");

        checkBox.setText("Show password");

        cancelBtn.setBackground(new java.awt.Color(204, 0, 0));
        cancelBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cancelBtn.setText("Cancel");

        loginBtn.setBackground(new java.awt.Color(51, 102, 255));
        loginBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(252, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(checkBox)
                .addGap(28, 28, 28)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(277, Short.MAX_VALUE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        user = userField.getText();
        pass = passField.getText();
        try
        {
            Statement s = (Statement) admin.con.createStatement();
            String sql = "SELECT * FROM librarycrud WHERE username='"+user+"' and password='"+pass+"'";
            admin.rs = s.executeQuery(sql);
            
            if(admin.rs.next()){
                JOptionPane.showMessageDialog(null,"Successfully login!!");
                
                this.dispose();
                
                show.setVisible(true);
                
                showInfo();
            }
 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(StudentLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passField;
    public javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
