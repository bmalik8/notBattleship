 


/**
 * Each position in the Array for game board
 * 
 * @Basit Malik 
 * v0.0.1
 */
public class BoardSpot
{
    private boolean containsShip;//Whether or not a spot contains a ship
    private Ship battleShip;//If there is a ship, whichever ship is contianed
    private boolean containsHead;//Whether or not the head of the ship(either top-most or left-most spot)
    private boolean isHit;
    public BoardSpot()//initializes all spots as fresh empty spots
    {
        containsShip=false;
        battleShip=null;
        containsHead=false;
        isHit=false;
    }
    public Ship getBattleShip()
    {
        return battleShip;
    }
    public void setBattleShip(Ship s)
    {
        battleShip=s;
    }
    public boolean getContainsShip()
    {
        return containsShip;
    }
    public void setContainsShip(boolean bool)
    {
        containsShip=bool;
    }
    public boolean getContainsHead()
    {
        return containsShip;
    }
    public void setContainsHead(boolean bool)
    {
        containsHead=bool;
    }
    public boolean getIsHit()
    {
        return isHit;
    }
    public void setIsHit(boolean bool)
    {
        isHit=bool;
    }
}
