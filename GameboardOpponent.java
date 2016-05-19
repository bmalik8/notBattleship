//Allison
public class GameboardOpponent
{
    //this is the board that the player sees and takes shots at, trying to sink the computer's
    //ships
    private static BoardSpot [][] board;
    int shipsSunken;
    public GameboardOpponent()
    {
        //creates a new board and fills them with empty board spots, default positions are empty
        board=new BoardSpot[10][10];
        for (int row=0; row<10; row++)
        {
            for (int col=0; col<10; col++)
            {
                board[row][col]=new BoardSpot();
            }
        }
        //set shipsSunken to 0 and when you sink a ship, it increments by 1. when shipsSunken
        //is 5, you win
        shipsSunken=0;
    }
    //randomly places 5 ships 
    public void placeShips()
    {
        //ctr counts how many ships get placed,
        int ctr=0;
        //array of lengths of ships that are available in battleship
        int[] lens={2,3,3,4,5};
        int row;
        int col;
        while (ctr<5)
        {
            //creates new ship
            Ship compShip=new Ship(lens[ctr]);
            //randomly gets integers row and col b/w 0-9
            row=(int)(Math.random()*10);
            col=(int)(Math.random()*10);
            //randomly decides whether ship is vertical or not
            int vert=(int)(Math.random()*2);
            //set boolean isVert based on above
            if (vert==0)
                compShip.setIsVert(true);
            else
                compShip.setIsVert(false);
            // boolean valid gets changed after multiple checks, ship only placed if valid==true
            //after all the checks
            boolean valid=true;
            //check of ship is being placed in valid spaces, on board and not a ship
            //already there
            if(compShip.getIsVert())
            {
                for (int i=0; i<lens[ctr]; i++)
                {
                    if (row+i>=board.length || col>=board[0].length)
                        valid=false;
                    else if(board[row+i][col].getContainsShip()==true)
                        valid=false;
                }
            }
            else
            {
                for (int i=0; i<lens[ctr]; i++)
                {
                    if (row>=board.length || col+i>=board[0].length) 
                        valid=false;
                    else if(board[row][col+i].getContainsShip()==true)
                        valid=false;
                }
            }
            //if passes all the checks, place ships
            if(valid)
            {
                if(compShip.getIsVert())
                {
                    //place head of ship
                    board[row][col].setContainsShip(true);
                    board[row][col].setBattleShip(compShip);
                    board[row][col].setContainsHead(true);
                    //places rest of body
                    for (int i=1; i<lens[ctr]; i++)
                    {
                        board[row+i][col].setContainsShip(true);
                        board[row+i][col].setBattleShip(compShip);
                    }
                }
                else
                {
                    //places head of ship when ship is horizontal
                    board[row][col].setContainsShip(true);
                    board[row][col].setBattleShip(compShip);
                    board[row][col].setContainsHead(true);
                    //places ship body when ship is horizontal
                    for (int i=1; i<lens[ctr]; i++)
                    {
                        board[row][col+i].setContainsShip(true);
                        board[row][col+i].setBattleShip(compShip);
                    }
                }
                //ctr only increments when a ship is placed 
                ctr++;
            }
        }
    }

    public static BoardSpot getBoardSpot(int row, int col)
    {
        return board[row][col];
    }

    public void shipSunk(Ship ship)
    {
        //checks if you sink the opponents battleship
        if (ship.getHitCtr()==ship.getLen())
        {
            shipsSunken++;
            System.out.println("You sunk their battleship!");
        }   
        //check if you win
        if (shipsSunken==5)
            System.out.println("You win!");
    }
    // print board, 0 for empty, X for attempts [X] for hit ships
    public String toString()
    {
        String s="";
        s+="  0 1 2 3 4 5 6 7 8 9\n";
        for (int i=0; i<10; i++)
        {
            s+=i+" ";
            for (int j=0; j<10; j++)
            {
                if (board[i][j].getContainsShip() && board[i][j].getIsHit())
                    s+="[X] ";
                else if (board[i][j].getIsHit())
                    s+="X ";
                else
                    s+="O ";
            }
            s+="\n";
        }
        return s;
    }
}