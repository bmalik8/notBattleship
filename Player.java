package notBattleship;

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

    public void takeShot(int x, int y)
    {
        if ((getBoardSpot(y,x)).getContainsShip== true)
        {
            ((getBoardSport(y,x)).getBattleShip()).hit();
        }
    }
}