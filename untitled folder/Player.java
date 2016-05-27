/**
 * Represents a Battleship game player.
 */
//Group awesome
//Battleship
//May 6
public class Player
{
    private int numShips;

    /**
     * Initializes the player instance with 5 ships.
     */
    public Player()
    {
        numShips= 5;
    }

    /**
     * Returns the number of ships. Should always be 5.
     * @return number of ships.
     */
    public int getNumShips()
    {
        return numShips;
    }

    /**
     * Takes a shot at a spot on the opposing players board.
     * @param x and y coordinates
     */
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