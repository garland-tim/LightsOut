/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.frames;

import java.awt.Dimension;
import javax.swing.JTable;
import lightsout.controls.MainMenuControl;
import lightsout.enums.LightSwitch;
import lightsout.enums.Status;
import lightsout.models.Board;


/**
 *
 * @author Tim
 */
public class GameFrame extends javax.swing.JFrame {
    private int boardHeight = 5;
    private int boardWidth = 5;
    Board myBoard = new Board(this.jpBoard);
    MainMenuControl mainControl;
    
    public GameFrame() {
        this.initComponents();
        this.initializeFrame();
        this.mainControl = new MainMenuControl(this.myBoard, this.jpBoard);
        this.mainControl.newGame();
        this.jlLightsLeft.setText("Lights left: "+this.mainControl.getLightsLeft());
    }
    
    public void initializeFrame(){
        jpBoard.getTableHeader().setVisible(false);
        jpBoard.getTableHeader().setPreferredSize(new Dimension(0, 0));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jpGame = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpBoard = new javax.swing.JTable();
        jpColumnHeader = new javax.swing.JPanel();
        headerA = new javax.swing.JLabel();
        headerB = new javax.swing.JLabel();
        headerC = new javax.swing.JLabel();
        headerD = new javax.swing.JLabel();
        headerE = new javax.swing.JLabel();
        jpRowHeader = new javax.swing.JPanel();
        header1 = new javax.swing.JLabel();
        header2 = new javax.swing.JLabel();
        header3 = new javax.swing.JLabel();
        header4 = new javax.swing.JLabel();
        header5 = new javax.swing.JLabel();
        jbMainMenu = new javax.swing.JButton();
        jbHelpMenu = new javax.swing.JButton();
        jbQuit = new javax.swing.JButton();
        jlLightsLeft = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(508, 350));

        jpGame.setPreferredSize(new java.awt.Dimension(508, 350));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIGHTS OUT");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jpBoard.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jpBoard.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jpBoard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "A", "B", "C", "D", "E"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jpBoard.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jpBoard.setAutoscrolls(false);
        jpBoard.setFocusable(false);
        jpBoard.setGridColor(new java.awt.Color(0, 0, 0));
        jpBoard.setMaximumSize(new java.awt.Dimension(2147483647, 225));
        jpBoard.setMinimumSize(new java.awt.Dimension(50, 225));
        jpBoard.setPreferredSize(new java.awt.Dimension(250, 250));
        jpBoard.setRequestFocusEnabled(false);
        jpBoard.setRowHeight(50);
        jpBoard.setRowSelectionAllowed(false);
        jpBoard.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jpBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBoardMouseClicked(evt);
            }
        });

        jpColumnHeader.setPreferredSize(new java.awt.Dimension(250, 25));

        headerA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerA.setText("A");
        headerA.setPreferredSize(new java.awt.Dimension(50, 25));

        headerB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerB.setText("B");
        headerB.setPreferredSize(new java.awt.Dimension(50, 25));

        headerC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerC.setText("C");
        headerC.setPreferredSize(new java.awt.Dimension(50, 25));

        headerD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerD.setText("D");
        headerD.setPreferredSize(new java.awt.Dimension(50, 25));

        headerE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerE.setText("E");
        headerE.setPreferredSize(new java.awt.Dimension(50, 25));

        javax.swing.GroupLayout jpColumnHeaderLayout = new javax.swing.GroupLayout(jpColumnHeader);
        jpColumnHeader.setLayout(jpColumnHeaderLayout);
        jpColumnHeaderLayout.setHorizontalGroup(
            jpColumnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpColumnHeaderLayout.createSequentialGroup()
                .addComponent(headerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(headerE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jpColumnHeaderLayout.setVerticalGroup(
            jpColumnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpColumnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(headerE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(headerD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(headerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpRowHeader.setMaximumSize(new java.awt.Dimension(25, 250));
        jpRowHeader.setPreferredSize(new java.awt.Dimension(25, 250));

        header1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header1.setText("1");
        header1.setPreferredSize(new java.awt.Dimension(25, 25));

        header2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        header2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header2.setText("2");
        header2.setPreferredSize(new java.awt.Dimension(25, 25));

        header3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        header3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header3.setText("3");
        header3.setPreferredSize(new java.awt.Dimension(25, 25));

        header4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        header4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header4.setText("4");
        header4.setPreferredSize(new java.awt.Dimension(25, 25));

        header5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        header5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header5.setText("5");
        header5.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jpRowHeaderLayout = new javax.swing.GroupLayout(jpRowHeader);
        jpRowHeader.setLayout(jpRowHeaderLayout);
        jpRowHeaderLayout.setHorizontalGroup(
            jpRowHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRowHeaderLayout.createSequentialGroup()
                .addGroup(jpRowHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(header3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(header4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(header5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpRowHeaderLayout.setVerticalGroup(
            jpRowHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRowHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(header3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(header4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(header5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jbMainMenu.setText("Main Menu");

        jbHelpMenu.setText("Help Menu");

        jbQuit.setText("Quit");
        jbQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitActionPerformed(evt);
            }
        });

        jlLightsLeft.setText("Lights left: ");

        javax.swing.GroupLayout jpGameLayout = new javax.swing.GroupLayout(jpGame);
        jpGame.setLayout(jpGameLayout);
        jpGameLayout.setHorizontalGroup(
            jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGameLayout.createSequentialGroup()
                .addGroup(jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpGameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpGameLayout.createSequentialGroup()
                        .addGroup(jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpGameLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbHelpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jpGameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlLightsLeft)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpRowHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpColumnHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jpBoard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jpGameLayout.setVerticalGroup(
            jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpRowHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpGameLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpGameLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jbMainMenu)
                                .addGap(18, 18, 18)
                                .addComponent(jbHelpMenu)
                                .addGap(18, 18, 18)
                                .addComponent(jbQuit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlLightsLeft))
                            .addGroup(jpGameLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpColumnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpGame, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpGame, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBoardMouseClicked
        JTable myTable = (JTable) evt.getComponent();
        this.clickLight(myTable);
    }//GEN-LAST:event_jpBoardMouseClicked

    private void jbQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitActionPerformed
        // TODO add your handling code here:
        this.setVisable(true);
        this.dispose();
    }//GEN-LAST:event_jbQuitActionPerformed
    
    private void clickLight(JTable mytable){
        int selectedRow = mytable.getSelectedRow();
        int selectedColumn = mytable.getSelectedColumn();
        this.mainControl.changeLight(selectedColumn, selectedRow);
        //This is what happens when the game is over!
        if(this.mainControl.getLightsLeft() == 0)
        {
            this.jlLightsLeft.setText("You just won!");
        }
        else{
            this.jlLightsLeft.setText("Lights left: "+this.mainControl.getLightsLeft());
        }
    }
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
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel header1;
    private javax.swing.JLabel header2;
    private javax.swing.JLabel header3;
    private javax.swing.JLabel header4;
    private javax.swing.JLabel header5;
    private javax.swing.JLabel headerA;
    private javax.swing.JLabel headerB;
    private javax.swing.JLabel headerC;
    private javax.swing.JLabel headerD;
    private javax.swing.JLabel headerE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbHelpMenu;
    private javax.swing.JButton jbMainMenu;
    private javax.swing.JButton jbQuit;
    private javax.swing.JLabel jlLightsLeft;
    private javax.swing.JTable jpBoard;
    private javax.swing.JPanel jpColumnHeader;
    private javax.swing.JPanel jpGame;
    private javax.swing.JPanel jpRowHeader;
    // End of variables declaration//GEN-END:variables

    private void setVisable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
