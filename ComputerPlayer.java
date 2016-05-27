
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
    private int hitX;
    private int y;
    private int hitY;
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
        int ctr= 0;
        // creates initial x and y coords
        x= (int)(Math.random()*10);
        y= (int)(Math.random()*10);
        while((GameboardYou.getBoardSpot(y,x)).getIsHit() == true) {
            x= (int)(Math.random()*10);
            y= (int)(Math.random()*10);
        }

        
        if (foundShip== true ) {            
            if (counter == 1) {
                if(hitX>0) {
                    if ((GameboardYou.getBoardSpot(hitY,hitX-1)).getContainsShip() == true && 
                    (GameboardYou.getBoardSpot(hitY,hitX-1)).getIsHit() == false)
                    {
                        ((GameboardYou.getBoardSpot(hitY,hitX-1)).getBattleShip()).hit();

                        foundShip = true;
                        counter = 1;
                    } 
                    GameboardYou.getBoardSpot(hitY,hitX-1).setIsHit(true);
                }
                else
                    counter++;
            }
            if (counter == 2) {
                if(hitX<9) {
                    if ((GameboardYou.getBoardSpot(hitY,hitX+1)).getContainsShip() == true && 
                    (GameboardYou.getBoardSpot(hitY,hitX+1)).getIsHit() == false)
                    {
                        ((GameboardYou.getBoardSpot(hitY,hitX+1)).getBattleShip()).hit();

                        foundShip = true;
                        counter = 1;
                    } 
                    GameboardYou.getBoardSpot(hitY,hitX+1).setIsHit(true);
                }
                else
                    counter++;
            }
            if (counter == 3) {
                if(hitY>0) {
                    if ((GameboardYou.getBoardSpot(y-1,x)).getContainsShip() == true && 
                    (GameboardYou.getBoardSpot(y-1,x)).getIsHit() == false)
                    {
                        ((GameboardYou.getBoardSpot(y-1,x)).getBattleShip()).hit();

                        foundShip = true;
                        counter = 1;
                    } 
                    GameboardYou.getBoardSpot(y-1,x).setIsHit(true);
                }
                else
                    counter++;
            }
            if (counter == 4) {
                if(hitY<9) {
                    if ((GameboardYou.getBoardSpot(hitY+1,hitX)).getContainsShip() == true && 
                    (GameboardYou.getBoardSpot(hitY+1,hitX)).getIsHit() == false)
                    {
                        ((GameboardYou.getBoardSpot(hitY+1,hitX)).getBattleShip()).hit();

                        foundShip = true;
                        counter = 1;
                    } 
                    GameboardYou.getBoardSpot(hitY+1,hitX).setIsHit(true);
                }
                else
                    counter++;
            }
            else {
                counter = 0;
                foundShip = false;
            }
        } 

        if (foundShip== false)
        {
            if ((GameboardYou.getBoardSpot(y,x)).getContainsShip())
            {
                ((GameboardYou.getBoardSpot(y,x)).getBattleShip()).hit();
                foundShip= true;
                counter= 1;
                hitX= x;
                hitY= y;
                
            }
            (GameboardYou.getBoardSpot(y,x)).setIsHit(true);
        }
        
        
        
        
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

        foundShip = true;
        counter = 0;
        } 
        GameboardYou.getBoardSpot(y,x).setIsHit(true);
        }
        else {            
        if (counter == 1) {
        if(x>0) {
        if ((GameboardYou.getBoardSpot(y,x-1)).getContainsShip() == true && 
        (GameboardYou.getBoardSpot(y,x-1)).getIsHit() == false)
        {
        ((GameboardYou.getBoardSpot(y,x-1)).getBattleShip()).hit();

        foundShip = true;
        counter = 0;
        } 
        GameboardYou.getBoardSpot(y,x-1).setIsHit(true);
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

        foundShip = true;
        counter = 0;
        } 
        GameboardYou.getBoardSpot(y,x+1).setIsHit(true);
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

        foundShip = true;
        counter = 0;
        } 
        GameboardYou.getBoardSpot(y-1,x).setIsHit(true);
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

        foundShip = true;
        counter = 0;
        } 
        GameboardYou.getBoardSpot(y+1,x).setIsHit(true);
        }
        else
        counter++;
        }
        else {
        counter = 0;
        foundShip = false;
        }
        } */
    }

}
