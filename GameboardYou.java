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
                board[row][col]=(false, null, false);
            }
        }
        shipsSunken=0;
    }

    public void placeShip(int row, int col, Ship ship)
    {
        if (ship.getIsVert)
        {
            board[row][col]=new BoardSpot(true,ship,true);
            for (int i=1; i<ship.getLen(); i++)
            {
                board[row+i][col]=new BoardSpot(true,ship,false);
            }
        }
        else
        {
            board[row][col]=new BoardSpot(true,ship,true);
            for (int i=1; i<ship.getLen(); i++)
            {
                board[row][col+i]=new BoardSpot(true,ship,false);
            }
        }
    }
    
    
}