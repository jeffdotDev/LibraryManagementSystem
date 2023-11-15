/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarycrud;

/**
 *
 * @author JOEBELL ARABIT
 */
public class StudentMenu extends javax.swing.JFrame {

    
    
    public StudentMenu() {
        initComponents();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        hmBooksBtn = new javax.swing.JButton();
        edBooksBtn = new javax.swing.JButton();
        bitBooksBtn = new javax.swing.JButton();
        cictBooksBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("Welcome Dear Student");

        hmBooksBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hmBooksBtn.setText("HM BOOKS");

        edBooksBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edBooksBtn.setText("ED BOOKS");
        edBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBooksBtnActionPerformed(evt);
            }
        });

        bitBooksBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bitBooksBtn.setText("BIT BOOKS");
        bitBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitBooksBtnActionPerformed(evt);
            }
        });

        cictBooksBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cictBooksBtn.setText("CICT BOOKS");
        cictBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cictBooksBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(cictBooksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(hmBooksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(edBooksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(bitBooksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hmBooksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edBooksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bitBooksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cictBooksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bitBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitBooksBtnActionPerformed
        
    }//GEN-LAST:event_bitBooksBtnActionPerformed

    private void edBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBooksBtnActionPerformed
        
    }//GEN-LAST:event_edBooksBtnActionPerformed

    private void cictBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cictBooksBtnActionPerformed
       this.dispose();
       
       CICT cict = new CICT();
       
       cict.setVisible(true);
           
    }//GEN-LAST:event_cictBooksBtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bitBooksBtn;
    private javax.swing.JButton cictBooksBtn;
    private javax.swing.JButton edBooksBtn;
    private javax.swing.JButton hmBooksBtn;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
