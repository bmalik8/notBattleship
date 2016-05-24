

/**
 * Write a description of class ComputerPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComputerPlayer extends Player
{
    private int compShips;
    boolean foundShip = false;

    public ComputerPlayer()
    {
        compShips= 5;
    }

    public int getCompShips()
    {
        return compShips;
    }

    public static void takeShot()
    {
        if (foundShip = false) {
            int x= (int)(Math.random()*10);
            int y= (int)(Math.random()*10);
        }
        else {
            
        }
        if ((GameboardOpponent.getBoardSpot(y,x)).getContainsShip() == true)
        {
            ((GameboardOpponent.getBoardSpot(y,x)).getBattleShip()).hit();
            GameboardOpponent.getBoardSpot(y,x).setIsHit(true);
            foundShip = true;
        } 
    }

}
