//Allison
//This is the class that the player sees when playing battleship
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
    public void placeShip(int row, int col, Ship ship) throws Exception
    {
        Exception ex;
        if (row>board.length || col>board[0].length)
            throw new Exception("Can't place ship there!");
        if (ship.getIsVert())
        {
            board[row][col].setContainsShip(true);
            board[row][col].setBattleShip(ship);
            board[row][col].setContainsHead(true);
            for (int i=1; i<ship.getLen(); i++)
            {
                if (row+i>=ship.getLen())
                    throw new Exception("Can't place ship there!");
                board[row+i][col].setContainsShip(true);
                board[row+i][col].setBattleShip(ship);
            }
        }
        else
        {
            board[row][col].setContainsShip(true);
            board[row][col].setBattleShip(ship);
            board[row][col].setContainsHead(true);
            for (int i=1; i<ship.getLen(); i++)
            {
                if (col+i>=ship.getLen())
                    throw new Exception("Can't place ship there!");
                board[row][col+i].setContainsShip(true);
                board[row][col+i].setBattleShip(ship);
            }
        }
    }

    public static BoardSpot getBoardSpot(int row, int col)
    {
        return board[row][col];
    }

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
}