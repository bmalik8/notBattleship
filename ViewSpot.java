/**
 * Write a description of interface Spot here.
 * 
 * @Basit Malik 
 * @version (a version number or a date)
 */
public class ViewSpot
{
    private boolean hit;
    public ViewSpot()
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
