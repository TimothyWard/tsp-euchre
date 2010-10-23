package euchre.gui;

import java.awt.Point;
import java.awt.Toolkit;

/**
 *
 * @author sdwilke
 * @author Neil MacBay(nmmacbay)
 */
public class GameLobby extends javax.swing.JFrame{

    /** 
     * Creates new form GameLobby 
     */
    public GameLobby(int numberOfPlayers, String hostName){
        initComponents();
        centerScreen();
    }

    /**
     * Moves the jFrame to the center of the screen
     */
    private void centerScreen(){
        int xCenter = Toolkit.getDefaultToolkit().getScreenSize().width/2;
        int yCenter = Toolkit.getDefaultToolkit().getScreenSize().height/2;
        int xSize = this.getSize().width;
        int ySize = this.getSize().height;
        Point p = new Point();
        p.setLocation(xCenter - xSize/2, yCenter - ySize/2);
        this.setLocation(p);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Player2Status = new javax.swing.JLabel();
        Player3Status = new javax.swing.JLabel();
        Player4Status = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioBPlayer1Team1 = new javax.swing.JRadioButton();
        jRadioBPlayer2Team1 = new javax.swing.JRadioButton();
        jRadioBPlayer3Team1 = new javax.swing.JRadioButton();
        jRadioBPlayer4Team1 = new javax.swing.JRadioButton();
        jRadioBPlayer1Team2 = new javax.swing.JRadioButton();
        jRadioBPlayer2Team2 = new javax.swing.JRadioButton();
        jRadioBPlayer3Team2 = new javax.swing.JRadioButton();
        jRadioBPlayer4Team2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game Lobby");

        jButton1.setText("Start Game");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartGame(evt);
            }
        });

        jLabel3.setText("Player 1:");

        jLabel4.setText("Player 2:");

        jLabel5.setText("Player 3:");

        jLabel6.setText("Player 4:");

        Player2Status.setText("...waiting");

        Player3Status.setText("...waiting");

        Player4Status.setText("...waiting");

        jLabel1.setText("Team:");

        jLabel2.setText("Team:");

        jLabel7.setText("Team:");

        jLabel8.setText("Team:");

        buttonGroup1.add(jRadioBPlayer1Team1);
        jRadioBPlayer1Team1.setSelected(true);
        jRadioBPlayer1Team1.setText("1");

        buttonGroup2.add(jRadioBPlayer2Team1);
        jRadioBPlayer2Team1.setSelected(true);
        jRadioBPlayer2Team1.setText("1");

        buttonGroup3.add(jRadioBPlayer3Team1);
        jRadioBPlayer3Team1.setText("1");

        buttonGroup4.add(jRadioBPlayer4Team1);
        jRadioBPlayer4Team1.setText("1");

        buttonGroup1.add(jRadioBPlayer1Team2);
        jRadioBPlayer1Team2.setText("2");

        buttonGroup2.add(jRadioBPlayer2Team2);
        jRadioBPlayer2Team2.setText("2");

        buttonGroup3.add(jRadioBPlayer3Team2);
        jRadioBPlayer3Team2.setSelected(true);
        jRadioBPlayer3Team2.setText("2");

        buttonGroup4.add(jRadioBPlayer4Team2);
        jRadioBPlayer4Team2.setSelected(true);
        jRadioBPlayer4Team2.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Player2Status, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(441, 441, 441)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player3Status, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player4Status, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioBPlayer1Team1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioBPlayer1Team2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioBPlayer2Team1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioBPlayer2Team2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioBPlayer3Team1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioBPlayer3Team2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioBPlayer4Team1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioBPlayer4Team2)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jRadioBPlayer1Team1)
                    .addComponent(jRadioBPlayer1Team2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Player2Status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioBPlayer2Team1)
                    .addComponent(jRadioBPlayer2Team2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Player3Status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioBPlayer3Team1)
                    .addComponent(jRadioBPlayer3Team2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Player4Status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioBPlayer4Team1)
                    .addComponent(jRadioBPlayer4Team2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartGame(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartGame
        new GameBoard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_StartGame

//    /**
//    * @param args the command line arguments
//    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GameLobby().setVisible(true);
//            }
//        });
//      
//    }

    public void setPlayer2Status(String status){
        Player2Status.setText(status);
    }

    public void setPlayer3Status(String status){
        Player3Status.setText(status);
    }

    public void setPlayer4Status(String status){
        Player4Status.setText(status);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Player2Status;
    private javax.swing.JLabel Player3Status;
    private javax.swing.JLabel Player4Status;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioBPlayer1Team1;
    private javax.swing.JRadioButton jRadioBPlayer1Team2;
    private javax.swing.JRadioButton jRadioBPlayer2Team1;
    private javax.swing.JRadioButton jRadioBPlayer2Team2;
    private javax.swing.JRadioButton jRadioBPlayer3Team1;
    private javax.swing.JRadioButton jRadioBPlayer3Team2;
    private javax.swing.JRadioButton jRadioBPlayer4Team1;
    private javax.swing.JRadioButton jRadioBPlayer4Team2;
    // End of variables declaration//GEN-END:variables

}
