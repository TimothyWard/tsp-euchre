package euchre.gui;
import java.awt.*;
  
/**
 * Welcomes the user to the euchre program, and asks them whether they would like to play
 * a network or local game.
 *
 * @author Neil MacBay (nmmacbay)
 *
 */
public class Welcome extends javax.swing.JFrame{

	private static final long serialVersionUID = 1L;
	boolean windowComplete = false;
	char gameChoice = 'x'; // The variable storing the users gametype choice.
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLocalGame;
    private javax.swing.JButton jButtonNetworkClientGame;
    private javax.swing.JButton jButtonNetworkHostGame;
    private javax.swing.JLabel jLabelWelcomeBanner;
    // End of variables declaration//GEN-END:variables
	
	/**
	 * Construct a welcome screen.
	 */
    public Welcome(){
        initComponents();
        centerScreen();
        jButton1.setVisible(false);
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelWelcomeBanner = new javax.swing.JLabel();
        jButtonNetworkHostGame = new javax.swing.JButton();
        jButtonLocalGame = new javax.swing.JButton();
        jButtonNetworkClientGame = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Euchre");
        setName("frameWelcome"); // NOI18N
        setResizable(false);

        jLabelWelcomeBanner.setFont(new java.awt.Font("DejaVu Sans", 0, 24));
        jLabelWelcomeBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWelcomeBanner.setText("Welcome to Euchre, which type of game do you wish to play?");

        jButtonNetworkHostGame.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jButtonNetworkHostGame.setText("Network Host Game");
        jButtonNetworkHostGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choseNetwork(evt);
                networkHost(evt);
            }
        });

        jButtonLocalGame.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jButtonLocalGame.setText("Local Game");
        jButtonLocalGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choseLocal(evt);
            }
        });

        jButtonNetworkClientGame.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        jButtonNetworkClientGame.setText("Network Client Game");
        jButtonNetworkClientGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                networkClient(evt);
            }
        });

        jButton1.setText("Dont Touch");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YouTouchedIt(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelWelcomeBanner, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButtonLocalGame, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNetworkHostGame, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNetworkClientGame, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelWelcomeBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLocalGame, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNetworkHostGame, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNetworkClientGame, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YouTouchedIt(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YouTouchedIt
        new GameBoard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_YouTouchedIt

    /**
     * User chose a Network game, so launch the networkGameBrowser so that they can find or make one.
     */
    private void choseNetwork(java.awt.event.MouseEvent evt) {                              
        //new NetworkGameBrowser().setVisible(true);
        //this.setVisible(false);
        //this.dispose();
    }                             

     /**
     * User chose a Local Game, so launch the setupLocal form so that they can setup their game.
     */
    private void choseLocal(java.awt.event.MouseEvent evt) {       
    	gameChoice = 'a';
    	windowComplete = true;
    }
    
    /**
     * User chose a Host a Network Game
     */
    private void networkHost(java.awt.event.MouseEvent evt) {
    	gameChoice = 'h';
    	windowComplete = true;
    }
    
    /**
     * User chose a be a client to a Network Game.
     */
    private void networkClient(java.awt.event.MouseEvent evt) {
    	gameChoice = 'c';
    	windowComplete = true;
    }
    
    public char getGameChoice(){
		return gameChoice;
    }

    public boolean isWinodwComplete(){
		return windowComplete;
    }
}
