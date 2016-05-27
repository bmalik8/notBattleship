 /**
 * Represents a ship object with variables for length, orientation, parts hit, and state of sunkeness.
 * 
 * @Basit Malik
 * v0.0.1
 */
public class Ship
{
    private int len;//length of ship
    private int hitCtr;//How many times the ship has been hit
    private boolean isSunken;//Whether or not the ship is sunken or not
    private boolean isVert;//Orientation of the ship
    public Ship(int length)
    {
        len=length;
        hitCtr=0;
        isSunken=false;
        isVert=true;
    }
    
    public void setIsVert(boolean bool)
    {
        isVert=bool;
    }
    
    public void hit()
    {
        hitCtr++;
        if (hitCtr==len)
            isSunken=true;
    }
    
    public int getHitCtr()
    {
        return hitCtr;
    }
    
    public int getLen()
    {
        return len;
    }
    
    public boolean getIsSunken()
    {
        return isSunken;
    }
    
    public boolean getIsVert()
    {
        return isVert;
    }
    
    public String toString()
    {
        return("Length: "+len+"\nIs Sunk: "+isSunken);
    }
    
}
