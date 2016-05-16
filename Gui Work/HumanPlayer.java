
/**
 * Write a description of class HumanPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HumanPlayer extends JPanel implements Player, MouseListener, ActionListener, KeyListener
{
    private final BattleGame game;
    private final BattleGameModel gameModel;

    private final JLabel nameField;
    private final JTextField scoreField;
    private final JButton placeButton;
    
    private int state;
    
    private int score;
    public HumanPlayer(BattleGame game, BattleGameModel gameModel) {
        this.game = game;
        this.gameModel = gameModel;

        setBackground(new Color(209,252,182));
        setPreferredSize(new Dimension(200, 90));

        score = 0;

        nameField = new JLabel("You");
        nameField.setFont(new Font("SansSerif", Font.PLAIN, 16));

        scoreField = new JTextField(2);
        scoreField.setEditable(false);
        scoreField.setBackground(Color.white);
        scoreField.setHorizontalAlignment(JTextField.CENTER);
        scoreField.setText(String.valueOf(score));
        scoreField.setFont(new Font("SansSerif", Font.PLAIN, 20));

        placeButton = new JButton("Place Marker");
        placeButton.setBackground(Color.lightGray);
        placeButton.setPreferredSize(new Dimension(120, 40));
        placeButton.addActionListener(this);

        add(nameField);
        add(scoreField);
        add(placeButton);

        state = IDLE;
    }

    public void start() {
        state = LOOKING;
        placeButton.setBackground(Color.lightGray);
    }

    public void stop() {
        state = IDLE;
        placeButton.setBackground(Color.lightGray);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        scoreField.setText(String.valueOf(score));
    }

    private void declareHit() {
        state = PICKING;
        //game.setActivePlayer(this);
        placeButton.setBackground(Color.yellow);
    }

    //button mouse listeners
    public void actionPerformed(ActionEvent e)
    {
        if (state == LOOKING)
            declareHit();
    }

    //rotates the ship when the spacebar is pressed
    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        if (state == LOOKING && code == KeyEvent.VK_SPACE)
            {
                
            }
    }

    public void keyReleased (KeyEvent e) { }

    public void keyTyped (KeyEvent e) { }

    public void mousePressed(MouseEvent e)
    {

    }

    public void mouseReleased(MouseEvent e) { }

    public void mouseClicked(MouseEvent e) { }

    public void mouseEntered(MouseEvent e) { }

    public void mouseExited(MouseEvent e) { }

}
