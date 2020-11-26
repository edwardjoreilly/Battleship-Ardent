import javax.swing.*; //GUI
import java.awt.*; //Font,Dimensions
import java.awt.event.*; //Listeners

public class Settings {
    private final int WIDTH = 650, LENGTH = 600;
    private Style style = new Style();
    private JFrame settingsScreen = style.frame("Settings", WIDTH, LENGTH);
    private ImageIcon settingsBackground;
    private JLabel back;
    private ImageIcon shipSil;
    private JLabel silhouette;
    private ImageIcon decor;
    private JLabel coin;

    //Images Instantiation
    Icon saveImage = new ImageIcon(getClass().getResource("SAVE1.png"));
    Icon volToggleImage = new ImageIcon(getClass().getResource("VOLONOFF1.png"));
    Icon volUpImage = new ImageIcon(getClass().getResource("VOLUP1.png"));
    Icon volDownImage = new ImageIcon(getClass().getResource("VOLDOWN1.png"));
    Icon rtmImage = new ImageIcon(getClass().getResource("MainMenuButton1.png"));

    //Rollover images
    Icon saveRollover = new ImageIcon(getClass().getResource("SAVE2.png"));
    Icon volToggleRollover = new ImageIcon(getClass().getResource("VOLONOFF2.png"));
    Icon volUpRollover = new ImageIcon(getClass().getResource("VOLUP2.png"));
    Icon volDownRollover = new ImageIcon(getClass().getResource("VOLDOWN2.png"));
    Icon rtmImageRollover = new ImageIcon(getClass().getResource("MainMenuButton2.png"));

    //Buttons
    private JButton save = new JButton(saveImage);
    private JButton volToggle = new JButton(volToggleImage);
    private JButton volUp = new JButton(volUpImage);
    private JButton volDown = new JButton(volDownImage);
    private JButton returnToMenu = new JButton(rtmImage);

    public Settings(){
        setScreen();
        settingsScreen.setVisible(true);
    }

    public void setScreen(){
        settingsScreen.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        //Background set
        settingsBackground = new ImageIcon(getClass().getResource("SettingsBG.gif"));
        back = new JLabel(settingsBackground);
        back.setSize(649,600);

        shipSil = new ImageIcon(getClass().getResource("menuBoard.png"));
        silhouette = new JLabel(shipSil);
        silhouette.setBounds(025, -10, 600,600);

        decor = new ImageIcon(getClass().getResource("Coin.gif"));
        coin = new JLabel(decor);
        coin.setBounds(545, 54, 58,58);

        settingsScreen.add(back);
        settingsScreen.setLocationRelativeTo(null);
        settingsScreen.getContentPane().setBackground(Color.black);
        settingsScreen.setLayout(new FlowLayout(FlowLayout.CENTER));

        save.setBounds(125,375,200,50);
        volToggle.setBounds(330, 300, 200,50);
        volUp.setBounds(485,195,50,50);
        volDown.setBounds(325,195,50,50);
        returnToMenu.setBounds(330,375,200,50);

        //Rollovers for Buttons
        save.setRolloverIcon(saveRollover);
        volToggle.setRolloverIcon(volToggleRollover);
        volUp.setRolloverIcon(volUpRollover);
        volDown.setRolloverIcon(volDownRollover);
        returnToMenu.setRolloverIcon(rtmImageRollover);

        back.add(returnToMenu);
        back.add(save);
        back.add(volToggle);
        back.add(volUp);
        back.add(volDown);
        back.add(coin);
        back.add(silhouette);

        //Action Listener
        returnToMenu.addActionListener( //Main Menu button
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        settingsScreen.dispose();
                    }
                }
        );
    }
}
