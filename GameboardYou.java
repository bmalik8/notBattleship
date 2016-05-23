//Allison
//This is the class that the player sees when playing battleship
import javax.swing.JOptionPane;
public class GameboardYou
{
    //board is filled with boardSpots
    private static BoardSpot[][] board;
    //keeps track of number of ships sunken on YOUR board, if it equals 5, you lose
    int shipsSunken;
    public GameboardYou()
    {
        //make an empty board of empty boardSpots
        board=new BoardSpot[10][10];
        for (int row=0; row<10; row++)
        {
            for (int col=0; col<10; col++)
            {
                board[row][col]=new BoardSpot();
            }
        }
        shipsSunken=0;
    }

    //User drag and drops the ship into place, the index is the location of the head
    //fills in rest of grid based on if it's vert or horizontal. also checks to make sure 
    // that the ship is in a valid place
    //every time you check for something and it's false, pop up message appears and 
    //ship doesn't get placed
    public void placeShip(int row, int col, Ship ship)
    {
        boolean valid=true;
        if (row>board.length || col>board[0].length)
        {
            valid=false;
            JOptionPane.showMessageDialog(null,"Can't place ship here");
        }
        else if (board[row][col].getContainsShip()==true)
        {
            valid=false;
            JOptionPane.showMessageDialog(null,"Can't place ship here");
        }

        if (valid)
        {
            if (ship.getIsVert())
            {
                board[row][col].setContainsShip(true);
                board[row][col].setBattleShip(ship);
                board[row][col].setContainsHead(true);
                for (int i=1; i<ship.getLen(); i++)
                {
                    if (row+i>=board.length || col>=board[0].length)
                    {
                        valid=false;
                        JOptionPane.showMessageDialog(null,"Can't place ship here");
                    }
                    else if(board[row+i][col].getContainsShip()==true)
                    {
                        valid=false;
                        JOptionPane.showMessageDialog(null,"Can't place ship here");
                    }
                }
                if (valid)
                {
                    for (int i=1; i<ship.getLen(); i++)
                    {
                        board[row+i][col].setContainsShip(true);
                        board[row+i][col].setBattleShip(ship);
                    }
                }
            }
            else //is horizontal
            {
                board[row][col].setContainsShip(true);
                board[row][col].setBattleShip(ship);
                board[row][col].setContainsHead(true);
                for (int i=1; i<ship.getLen(); i++)
                {
                    if (col+i>=board.length || row>=board[0].length)
                    {
                        valid=false;
                        JOptionPane.showMessageDialog(null,"Can't place ship here");
                    }
                    else if(board[row][col+i].getContainsShip()==true)
                    {
                        valid=false;
                        JOptionPane.showMessageDialog(null,"Can't place ship here");
                    }
                }
                if (valid)
                {
                    for (int i=1; i<ship.getLen(); i++)
                    {
                        board[row][col+i].setContainsShip(true);
                        board[row][col+i].setBattleShip(ship);
                    }
                }
            }
        }
    }

    public int getShipsSunken()
    {
        return shipsSunken;
    }
    
    public static BoardSpot getBoardSpot(int row, int col)
    {
        return board[row][col];
    }
    //checks if they sunk you battleship and then if you lost or not
    public void loseGame(Ship ship)
    {
        if (ship.getHitCtr()==ship.getLen())
        {
            shipsSunken++;
            System.out.println("They sunk your battleship :(");
        }
        if (shipsSunken==5)
        {
            System.out.println("You lose"); 
        }
    }
    //prints out the board O's for empty spaces, X's for attempted Hits, [S] for places with your
    //ships
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
                    s+="X ";
                else if (board[i][j].getContainsShip())
                    s+="O ";
                else if (board[i][j].getIsHit())
                    s+="W ";
                else
                    s+="  ";
            }
            s+="\n";
        }
        return s;
    }
}