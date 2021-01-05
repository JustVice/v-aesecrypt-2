package Frames;

import Logic.Memory;
import Logic.Tasks;
import Objects.Aes;

public class TestRoom extends javax.swing.JFrame {

    public TestRoom() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Test Room");
        this.setResizable(false);
        setIconImage(Memory.getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton_exitTestRoom = new javax.swing.JButton();
        jButton_aes_testing = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Unit testing - test room");

        jButton_exitTestRoom.setText("Exit Test Room");
        jButton_exitTestRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exitTestRoomActionPerformed(evt);
            }
        });

        jButton_aes_testing.setText("AES testing");
        jButton_aes_testing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aes_testingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton_aes_testing)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_exitTestRoom)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_aes_testing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jButton_exitTestRoom)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_aes_testingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aes_testingActionPerformed
        aesTesting();
        aesWrongPassword_testing();
        if (!Memory.openTestRoom)
            Tasks.joptionPaneMessage("Process completed. Look at the console to review results.", "Completed", "Message");
    }//GEN-LAST:event_jButton_aes_testingActionPerformed

    private void aesTesting() {
        System.out.println(" ===== Decryption test =====");
        String passwordKey = "VICE";
        String plaintext = "This is my plaintext string";

        String encryptResult = Aes.encrypt(plaintext, passwordKey);
        String decryptResult = Aes.decrypt(encryptResult, passwordKey);

        System.out.println("encryptResult: " + encryptResult);
        if (plaintext.equals(decryptResult)) {
            System.out.println("Decryption OK.");
            System.out.println("Result. decryptResult: " + decryptResult + ". plaintext: " + plaintext);
        } else {
            System.out.println("Decryption test ERROR");
            System.out.println(decryptResult);
            Tasks.joptionPaneMessage("Decryption test error", "ERROR", "Error");
        }
    }

    private void aesWrongPassword_testing() {
        System.out.println(" ===== Decryption test checking password incorrect =====");
        String passwordKey = "VICE";
        String wrongPasswordKey = "VICE0";
        String plaintext = "This is my plaintext string";

        String encryptResult = Aes.encrypt(plaintext, passwordKey);
        String decryptResult = Aes.decrypt(encryptResult, wrongPasswordKey);

        if (Aes.decryptionSuccess(decryptResult)) {
            System.out.println("Password somehow showed as correct.");
            System.out.println(decryptResult);
            Tasks.joptionPaneMessage("Decryption test checking password incorrect error", "ERROR", "Error");
        } else {
            System.out.println("Password is wrong. OK");
        }
    }

    private void jButton_exitTestRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exitTestRoomActionPerformed
        Tasks.showHomeFrame();
        this.dispose();
    }//GEN-LAST:event_jButton_exitTestRoomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_aes_testing;
    private javax.swing.JButton jButton_exitTestRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
