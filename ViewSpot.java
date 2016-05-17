/**
 * Write a description of interface Spot here.
 * 
 * @Basit Malik 
 * @version (a version number or a date)
 */
public class ViewSpot
{
    private boolean hit;//Boolean for the gameboard to know if a spot has been hit or not
    public ViewSpot()//initializes all spots as not hit (fresh game)
    {
        hit=false;
    }
    public boolean changeHit()//The else with a return of false is so that we can prompt the player to
                              //choose again if the method returns false so they cannot choose the
                              //same spot twice
    {
        if (hit==false)
        {
            hit=true;
            return true;
        }
        else
        {
            return false;
        }
    }
}
