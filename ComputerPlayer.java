
/**
 * Write a description of class ComputerPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComputerPlayer extends Player
{
    private int compShips;
    private boolean foundShip = false;
    private int x;
    private int y;
    private int counter;
    public ComputerPlayer()
    {
        compShips= 5;
    }

    public int getCompShips()
    {
        return compShips;
    }

    public void takeShot()
    {
        x= (int)(Math.random()*10);
        y= (int)(Math.random()*10);
        while((GameboardYou.getBoardSpot(y,x)).getIsHit() == true) {
            x= (int)(Math.random()*10);
            y= (int)(Math.random()*10);
        }
        ((GameboardYou.getBoardSpot(y,x)).getBattleShip()).hit();
        (GameboardYou.getBoardSpot(y,x)).setIsHit(true); 

        /*
        if (foundShip = false) {
        x= (int)(Math.random()*10);
        y= (int)(Math.random()*10);
        while((GameboardYou.getBoardSpot(y,x)).getIsHit() == true) {
        x= (int)(Math.random()*10);
        y= (int)(Math.random()*10);
        }
        if ((GameboardYou.getBoardSpot(y,x)).getContainsShip() == true)
        {
        ((GameboardYou.getBoardSpot(y,x)).getBattleShip()).hit();
        GameboardYou.getBoardSpot(y,x).setIsHit(true);
        foundShip = true;
        counter = 0;
        } 
        }
        else {            
        if (counter == 1) {
        if(x>0) {
        if ((GameboardYou.getBoardSpot(y,x-1)).getContainsShip() == true && 
        (GameboardYou.getBoardSpot(y,x-1)).getIsHit() == false)
        {
        ((GameboardYou.getBoardSpot(y,x-1)).getBattleShip()).hit();
        GameboardYou.getBoardSpot(y,x-1).setIsHit(true);
        foundShip = true;
        counter = 0;
        } 
        }
        else
        counter++;
        }
        if (counter == 2) {
        if(x<9) {
        if ((GameboardYou.getBoardSpot(y,x+1)).getContainsShip() == true && 
        (GameboardYou.getBoardSpot(y,x+1)).getIsHit() == false)
        {
        ((GameboardYou.getBoardSpot(y,x+1)).getBattleShip()).hit();
        GameboardYou.getBoardSpot(y,x+1).setIsHit(true);
        foundShip = true;
        counter = 0;
        } 
        }
        else
        counter++;
        }
        if (counter == 3) {
        if(y>0) {
        if ((GameboardYou.getBoardSpot(y-1,x)).getContainsShip() == true && 
        (GameboardYou.getBoardSpot(y-1,x)).getIsHit() == false)
        {
        ((GameboardYou.getBoardSpot(y-1,x)).getBattleShip()).hit();
        GameboardYou.getBoardSpot(y-1,x).setIsHit(true);
        foundShip = true;
        counter = 0;
        } 
        }
        else
        counter++;
        }
        if (counter == 4) {
        if(y<9) {
        if ((GameboardYou.getBoardSpot(y+1,x)).getContainsShip() == true && 
        (GameboardYou.getBoardSpot(y+1,x)).getIsHit() == false)
        {
        ((GameboardYou.getBoardSpot(y+1,x)).getBattleShip()).hit();
        GameboardYou.getBoardSpot(y+1,x).setIsHit(true);
        foundShip = true;
        counter = 0;
        } 
        }
        else
        counter++;
        }
        else {
        counter = 0;
        foundShip = false;
        }
        }*/
    }

}
