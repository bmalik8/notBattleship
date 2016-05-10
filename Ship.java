
/**
 * Ships for battle
 * 
 * @Basit Malik
 * v0.0.1
 */
public class Ship
{
    private int len;
    private int hitCtr;
    private boolean isSunken;
    private boolean isVert;
    public Ship(int length)
    {
        len=length;
        hitCtr=0;
        isSunken=false;
        isVert=true;
    }
    
    public void changeVert()
    {
        isVert=!isVert;
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
