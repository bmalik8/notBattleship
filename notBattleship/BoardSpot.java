
/**
 * Each position in the Array for game board
 * 
 * @Basit Malik 
 * v0.0.1
 */
public class BoardSpot
{
    private boolean containsShip;
    private Ship battleShip;
    private boolean containsHead;
    public BoardSpot()
    {
        containsShip=false;
        battleShip=null;
        containsHead=false;
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
}
