package Frames;

import Logic.Memory;
import Logic.Tasks;

public class About extends javax.swing.JFrame {

    public About() {
        initComponents();
        settings();
    }

    private void settings() {
        setLocationRelativeTo(null);
        setTitle(Memory.programName + ". Version: " + Memory.version);
        this.setResizable(false);
        jLabel_footer.setText(Memory.programName + " - MIT LICENSE");
        setIconImage(Memory.getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_back_home = new javax.swing.JButton();
        jLabel_vice_logo = new javax.swing.JLabel();
        jButton_vice_webpage = new javax.swing.JButton();
        jButton_vaesecrypt_page = new javax.swing.JButton();
        jButton_vice_twitter = new javax.swing.JButton();
        jButton_vaesecrypt2_github = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_footer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_back_home.setText("Back to home");
        jButton_back_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_back_homeActionPerformed(evt);
            }
        });

        jLabel_vice_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vice_logo.png"))); // NOI18N
        jLabel_vice_logo.setAlignmentX(10.0F);
        jLabel_vice_logo.setAlignmentY(10.0F);

        jButton_vice_webpage.setText("VICE's web page");
        jButton_vice_webpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_vice_webpageActionPerformed(evt);
            }
        });

        jButton_vaesecrypt_page.setText("V-AESEcrypt-2 page");
        jButton_vaesecrypt_page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_vaesecrypt_pageActionPerformed(evt);
            }
        });

        jButton_vice_twitter.setText("VICE's Twitter");
        jButton_vice_twitter.setToolTipText("");
        jButton_vice_twitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_vice_twitterActionPerformed(evt);
            }
        });

        jButton_vaesecrypt2_github.setText("V-AESEcrypt-2 source code");
        jButton_vaesecrypt2_github.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_vaesecrypt2_githubActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Program's developer:");

        jLabel_footer.setText("footer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_vice_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_vice_webpage)
                            .addComponent(jButton_vaesecrypt_page)
                            .addComponent(jButton_vice_twitter)
                            .addComponent(jButton_vaesecrypt2_github))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_back_home)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_footer)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_footer))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_vice_logo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton_vice_webpage)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_vice_twitter)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_vaesecrypt_page)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_vaesecrypt2_github)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jButton_back_home)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_back_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_back_homeActionPerformed
        Tasks.showHomeFrame();
        this.dispose();
    }//GEN-LAST:event_jButton_back_homeActionPerformed

    private void jButton_vice_webpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_vice_webpageActionPerformed
        Tasks.openLink("https://justvice.github.io");
    }//GEN-LAST:event_jButton_vice_webpageActionPerformed

    private void jButton_vice_twitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_vice_twitterActionPerformed
        Tasks.openLink("https://justvice.github.io/s/twitter");
    }//GEN-LAST:event_jButton_vice_twitterActionPerformed

    private void jButton_vaesecrypt_pageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_vaesecrypt_pageActionPerformed
        Tasks.openLink("https://justvice.github.io/technology/java/v-aesecrypt-2/");
    }//GEN-LAST:event_jButton_vaesecrypt_pageActionPerformed

    private void jButton_vaesecrypt2_githubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_vaesecrypt2_githubActionPerformed
        Tasks.openLink("https://github.com/JustVice/v-aesecrypt-2");
    }//GEN-LAST:event_jButton_vaesecrypt2_githubActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back_home;
    private javax.swing.JButton jButton_vaesecrypt2_github;
    private javax.swing.JButton jButton_vaesecrypt_page;
    private javax.swing.JButton jButton_vice_twitter;
    private javax.swing.JButton jButton_vice_webpage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JLabel jLabel_vice_logo;
    // End of variables declaration//GEN-END:variables
}
