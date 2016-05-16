
/**
 * Write a description of class ComputerPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ComputerPlayer extends JPanel implements Player, ActionListener
{
    private final BattleGame game;
    private final BattleGameModel gameModel;

    private final JLabel nameField;
    private final JTextField scoreField;
    private final JButton placeButton;

    private int state;

    private int score;

    public ComputerPlayer(BattleGame game, BattleGameModel gameModel)
    {
        this.game = game;
        this.gameModel = gameModel;

        setBackground(new Color(189, 172, 189));
        setPreferredSize(new Dimension(200, 90));

        score = 0;

        nameField = new JLabel("Computer    ");
        nameField.setFont(new Font("SansSerif", Font.PLAIN, 16));

        scoreField = new JTextField(2);
        scoreField.setEditable(false);
        scoreField.setBackground(Color.white);
        scoreField.setHorizontalAlignment(JTextField.CENTER);
        scoreField.setText(String.valueOf(score));
        scoreField.setFont(new Font("SansSerif", Font.PLAIN, 20));

        placeButton = new JButton("Place Marker");
        placeButton.setBackground(Color.white);
        placeButton.setEnabled(false);
        placeButton.setPreferredSize(new Dimension(120, 40));

        state = IDLE;

        JPanel p = new JPanel();
        p.add(nameField);
        p.add(scoreField);
        p.add(placeButton);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
    }

    public void start()
    {
        state = LOOKING;
        placeButton.setBackground(Color.white);
    }

    public void stop()
    {
        state = IDLE;
        placeButton.setBackground(Color.white);
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
        scoreField.setText(String.valueOf(score));
    }

    /**
     *  Called when this player has found a set.
     */
    private void declareHit()
    {
        //game.setActivePlayer(this);
        state = PICKING;
        placeButton.setBackground(Color.yellow);
    }


    /**
     *  Handles clock1 and clock2 events
     */
    public void actionPerformed(ActionEvent e)
    {
        if (state == LOOKING)
            declareHit();
        else if (state == PICKING){}
            //game.playerDone(this);
    }
}
