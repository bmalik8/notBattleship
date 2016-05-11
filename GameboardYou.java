
package notBattleship;


//Allison

public class GameboardYou
{
    private BoardSpot[][] board;
    int shipsSunken;
    public GameboardYou()
    {
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

    public void placeShip(int row, int col, Ship ship)
    {
        if (ship.getIsVert())
        {
            board[row][col].setContainsShip(true);
            board[row][col].setBattleShip(ship);
            board[row][col].setContainsHead(true);
            for (int i=1; i<ship.getLen(); i++)
            {
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
                board[row][col+i].setContainsShip(true);
                board[row][col+i].setBattleShip(ship);
            }
        }
    }
    
    public BoardSpot getBoardSpot(int row, int col)
    {
        return board[row][col];
    }
}