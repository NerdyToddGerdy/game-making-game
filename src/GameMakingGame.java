import javax.swing.*;

public class GameMakingGame {
    private JPanel MainScreen;
    private JLabel Title;
    private JButton mainButton;
    private JLabel result;
    private JButton upgradeButton;
    private JLabel nextUpgradeNumber;
    private int onHand = 0;
    private int nextUpgrade = 10;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GameMakingGame");
        frame.setContentPane(new GameMakingGame().MainScreen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}