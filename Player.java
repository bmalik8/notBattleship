
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
        //if theres a ship in the spot, hit it
        if ((GameboardOpponent.getBoardSpot(y,x)).getContainsShip() == true)
        {
            ((GameboardOpponent.getBoardSpot(y,x)).getBattleShip()).hit();
            //check to see if you sunk a ship or if you won
            GameboardOpponent.shipSunk(((GameboardOpponent.getBoardSpot(y,x)).getBattleShip()));
        } 
        //always sets the spot to hit
        GameboardOpponent.getBoardSpot(y,x).setIsHit(true);
    }
}   