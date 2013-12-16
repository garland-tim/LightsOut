/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.frames;

import lightsout.controls.HelpMenuControl;

/**
 *
 * @author Tim
 */
public class HelpMenu extends javax.swing.JFrame {
    HelpMenuControl helpMenuControl = new HelpMenuControl();
    /**
     * Creates new form HelpMenu
     */
    public HelpMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jpHelpBody = new javax.swing.JPanel();
        jpHelpTitle = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jpButtons = new javax.swing.JPanel();
        jbTheLight = new javax.swing.JButton();
        jbTheBoard = new javax.swing.JButton();
        jbTheRules = new javax.swing.JButton();
        jbThePlayer = new javax.swing.JButton();
        jbQuitHelp = new javax.swing.JButton();
        jpText = new javax.swing.JPanel();
        jtMessage = new javax.swing.JTextArea();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlTitle.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 24)); // NOI18N
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("HELP MENU");
        jlTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jpHelpTitleLayout = new javax.swing.GroupLayout(jpHelpTitle);
        jpHelpTitle.setLayout(jpHelpTitleLayout);
        jpHelpTitleLayout.setHorizontalGroup(
            jpHelpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        jpHelpTitleLayout.setVerticalGroup(
            jpHelpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jbTheLight.setText("The Light");
        jbTheLight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbTheLightMouseClicked(evt);
            }
        });

        jbTheBoard.setText("The Board");
        jbTheBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbTheBoardMouseClicked(evt);
            }
        });

        jbTheRules.setText("The Rules");
        jbTheRules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbTheRulesMouseClicked(evt);
            }
        });

        jbThePlayer.setText("The Player");
        jbThePlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbThePlayerMouseClicked(evt);
            }
        });

        jbQuitHelp.setText("Quit Help");
        jbQuitHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbQuitHelpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpButtonsLayout = new javax.swing.GroupLayout(jpButtons);
        jpButtons.setLayout(jpButtonsLayout);
        jpButtonsLayout.setHorizontalGroup(
            jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbQuitHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpButtonsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbTheLight, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbThePlayer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbTheRules, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbTheBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpButtonsLayout.setVerticalGroup(
            jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbTheLight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbTheBoard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbTheRules)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbThePlayer)
                .addGap(11, 11, 11)
                .addComponent(jbQuitHelp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtMessage.setColumns(20);
        jtMessage.setRows(5);

        javax.swing.GroupLayout jpTextLayout = new javax.swing.GroupLayout(jpText);
        jpText.setLayout(jpTextLayout);
        jpTextLayout.setHorizontalGroup(
            jpTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTextLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jpTextLayout.setVerticalGroup(
            jpTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTextLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpHelpBodyLayout = new javax.swing.GroupLayout(jpHelpBody);
        jpHelpBody.setLayout(jpHelpBodyLayout);
        jpHelpBodyLayout.setHorizontalGroup(
            jpHelpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHelpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpHelpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpHelpBodyLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jpButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpHelpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpHelpBodyLayout.setVerticalGroup(
            jpHelpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHelpBodyLayout.createSequentialGroup()
                .addComponent(jpHelpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpHelpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpHelpBodyLayout.createSequentialGroup()
                        .addComponent(jpButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpHelpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpHelpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbQuitHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbQuitHelpMouseClicked
        this.dispose();
    }//GEN-LAST:event_jbQuitHelpMouseClicked

    private void jbTheLightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTheLightMouseClicked
        this.jtMessage.setText(this.helpMenuControl.displayLightHelp());
    }//GEN-LAST:event_jbTheLightMouseClicked

    private void jbTheBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTheBoardMouseClicked
        this.jtMessage.setText(this.helpMenuControl.displayBoardHelp());
    }//GEN-LAST:event_jbTheBoardMouseClicked

    private void jbTheRulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTheRulesMouseClicked
        this.jtMessage.setText(this.helpMenuControl.displayRulesHelp());
    }//GEN-LAST:event_jbTheRulesMouseClicked

    private void jbThePlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbThePlayerMouseClicked
        this.jtMessage.setText(this.helpMenuControl.displayPlayerHelp());
    }//GEN-LAST:event_jbThePlayerMouseClicked

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
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JButton jbQuitHelp;
    private javax.swing.JButton jbTheBoard;
    private javax.swing.JButton jbTheLight;
    private javax.swing.JButton jbThePlayer;
    private javax.swing.JButton jbTheRules;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpButtons;
    private javax.swing.JPanel jpHelpBody;
    private javax.swing.JPanel jpHelpTitle;
    private javax.swing.JPanel jpText;
    private javax.swing.JTextArea jtMessage;
    // End of variables declaration//GEN-END:variables
}
