
//Group awesome
//Battleship
//May 6
public class Player
{
    private int numShips;

    public Player()
    {
        numShips= 5;

    }

    public int getNumShips()
    {
        return numShips;
    }

    public static void takeShot(int x, int y)
    {
        if ((GameboardOpponent.getBoardSpot(y,x)).getContainsShip() == true)
        {
            ((GameboardOpponent.getBoardSpot(y,x)).getBattleShip()).hit();
            GameboardOpponent.shipSunk(((GameboardOpponent.getBoardSpot(y,x)).getBattleShip()));
        } 
        GameboardOpponent.getBoardSpot(y,x).setIsHit(true);
    }
}   