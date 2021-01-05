package Frames;

import Logic.Memory;
import Logic.Tasks;
import Objects.Aes;
import java.awt.Color;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        settings();
    }

    private void settings() {
        setLocationRelativeTo(null);
        setTitle(Memory.programName + ". Version: " + Memory.version);
        this.setResizable(false);
        changeLabelMessageText("", "black");

        jTextArea_encode.setLineWrap(true);
        jTextArea_encode.setCaretPosition(0);
        jTextArea_encode.setWrapStyleWord(true);

        jTextArea_decode.setLineWrap(true);
        jTextArea_decode.setCaretPosition(0);
        jTextArea_decode.setWrapStyleWord(true);
        setIconImage(Memory.getIconImage());
    }

    private Boolean checkRequiredParametersGiven_toEncrypt() {
        return (!jTextField_passwordKey.getText().equals("") && !jTextArea_encode.getText().equals(""));
    }

    private Boolean checkRequiredParametersGiven_toDecrypt() {
        return (!jTextField_passwordKey.getText().equals("") && !jTextArea_decode.getText().equals(""));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_btn_about = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_passwordKey = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_decode = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_encode = new javax.swing.JTextArea();
        jLabel_text_encrypt = new javax.swing.JLabel();
        jLabel_copytoclipboard_encode_panel = new javax.swing.JLabel();
        jLabel_text_decrypt = new javax.swing.JLabel();
        jLabel_copytoclipboard_decode = new javax.swing.JLabel();
        jLabel_message = new javax.swing.JLabel();
        jLabel_button_clear = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("V-AESEcrypt 2");

        jLabel_btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_about.png"))); // NOI18N
        jLabel_btn_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_btn_aboutMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Password key");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Paste text to encode");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Paste text to decode");

        jTextArea_decode.setColumns(20);
        jTextArea_decode.setRows(5);
        jScrollPane4.setViewportView(jTextArea_decode);

        jTextArea_encode.setColumns(20);
        jTextArea_encode.setRows(5);
        jScrollPane5.setViewportView(jTextArea_encode);

        jLabel_text_encrypt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_textecrypt.png"))); // NOI18N
        jLabel_text_encrypt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_text_encryptMouseClicked(evt);
            }
        });

        jLabel_copytoclipboard_encode_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_copytoclipboard.png"))); // NOI18N
        jLabel_copytoclipboard_encode_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_copytoclipboard_encode_panelMouseClicked(evt);
            }
        });

        jLabel_text_decrypt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_textdecrypt.png"))); // NOI18N
        jLabel_text_decrypt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_text_decryptMouseClicked(evt);
            }
        });

        jLabel_copytoclipboard_decode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_copytoclipboard.png"))); // NOI18N
        jLabel_copytoclipboard_decode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_copytoclipboard_decodeMouseClicked(evt);
            }
        });

        jLabel_message.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_message.setText("Label Message");

        jLabel_button_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_clear.png"))); // NOI18N
        jLabel_button_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_button_clearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(109, 109, 109)
                                .addComponent(jLabel_message)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_btn_about))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField_passwordKey, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_text_encrypt)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_copytoclipboard_encode_panel)
                                .addGap(197, 197, 197)
                                .addComponent(jLabel_button_clear)
                                .addGap(203, 203, 203)
                                .addComponent(jLabel_text_decrypt)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_copytoclipboard_decode))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(186, 186, 186))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_btn_about)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel_message)))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_passwordKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_copytoclipboard_encode_panel)
                            .addComponent(jLabel_text_encrypt)
                            .addComponent(jLabel_button_clear, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_text_decrypt)
                        .addComponent(jLabel_copytoclipboard_decode)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_btn_aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_btn_aboutMouseClicked
        Tasks.showAboutFrame();
        this.dispose();
    }//GEN-LAST:event_jLabel_btn_aboutMouseClicked

    private void jLabel_text_encryptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_text_encryptMouseClicked
        if (checkRequiredParametersGiven_toEncrypt()) {
            encrypt();
        } else {
            changeLabelMessageText("Missing required parameters.", "red");
        }
    }//GEN-LAST:event_jLabel_text_encryptMouseClicked

    private void encrypt() {
        String plaintext = jTextArea_encode.getText();
        String passwordKey = jTextField_passwordKey.getText();
        jTextArea_decode.setText(Aes.encrypt(plaintext, passwordKey));
    }

    private void jLabel_copytoclipboard_encode_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_copytoclipboard_encode_panelMouseClicked
        if (!jTextArea_encode.getText().equals("")) {
            Tasks.copyToClipBoard(jTextArea_encode.getText());
            changeLabelMessageText("Text copied to clipboard - encode panel", "green");
        }
    }//GEN-LAST:event_jLabel_copytoclipboard_encode_panelMouseClicked

    private void jLabel_text_decryptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_text_decryptMouseClicked
        if (checkRequiredParametersGiven_toDecrypt()) {
            decrypt();
        } else {
            changeLabelMessageText("Missing required parameters.", "red");
        }
    }//GEN-LAST:event_jLabel_text_decryptMouseClicked

    private void decrypt() {
        String aes = jTextArea_decode.getText();
        String passwordKey = jTextField_passwordKey.getText();

        String decryptionResult = Aes.decrypt(aes, passwordKey);

        if (!Aes.decryptionSuccess(decryptionResult)) {
            System.out.println(aes);
            changeLabelMessageText("Password key wrong or not AES text given", "gray");
            return;
        }

        jTextArea_encode.setText(decryptionResult);
        changeLabelMessageText("", "");
    }

    private void jLabel_copytoclipboard_decodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_copytoclipboard_decodeMouseClicked
        if (!jTextArea_decode.getText().equals("")) {
            Tasks.copyToClipBoard(jTextArea_decode.getText());
            changeLabelMessageText("Text copied to clipboard - decode panel", "green");
        }
    }//GEN-LAST:event_jLabel_copytoclipboard_decodeMouseClicked

    private void jLabel_button_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_button_clearMouseClicked
        if (jTextField_passwordKey.getText().toLowerCase().equals("inki")) {
            changeLabelMessageText("He has never been around here go away.", "gray");
        } else {
            jTextField_passwordKey.setText("");
            jTextArea_encode.setText("");
            jTextArea_decode.setText("");
            changeLabelMessageText("", "");
        }
    }//GEN-LAST:event_jLabel_button_clearMouseClicked

    private void changeLabelMessageText(String message, String color) {
        jLabel_message.setText(message);
        switch (color) {
            case "red":
                jLabel_message.setForeground(Color.RED);
                break;
            case "green":
                jLabel_message.setForeground(new Color(0, 153, 51));
                break;
            case "black":
                jLabel_message.setForeground(Color.BLACK);
                break;
            case "gray":
                jLabel_message.setForeground(Color.GRAY);
                break;
            default:
                jLabel_message.setForeground(Color.GRAY);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_btn_about;
    private javax.swing.JLabel jLabel_button_clear;
    private javax.swing.JLabel jLabel_copytoclipboard_decode;
    private javax.swing.JLabel jLabel_copytoclipboard_encode_panel;
    private javax.swing.JLabel jLabel_message;
    private javax.swing.JLabel jLabel_text_decrypt;
    private javax.swing.JLabel jLabel_text_encrypt;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea_decode;
    private javax.swing.JTextArea jTextArea_encode;
    private javax.swing.JTextField jTextField_passwordKey;
    // End of variables declaration//GEN-END:variables
}
