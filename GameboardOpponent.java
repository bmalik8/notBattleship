//Allison
public class GameboardOpponent
{
    private static BoardSpot [][] board;
    public GameboardOpponent()
    {
        board=new BoardSpot[10][10];
        for (int row=0; row<10; row++)
        {
            for (int col=0; col<10; col++)
            {
                board[row][col]=new ViewSpot();
            }
        }
    }

    public void placeShips()
    {
        int ctr=0;
        int[] lens={2,3,3,4,5};
        int row;
        int col;
        while (ctr<5)
        {
            Ship compShip=new Ship(lens[ctr]);
            row=(int)(Math.random()*10+1);
            col=(int)(Math.random()*10+1);
            int vert=(int)(Math.random()*2);
            if (vert==0)
            {
                compShip.setIsVert(true);
            }
            else
            {
                compShip.setIsVert(false);
            }
            if(compShip.getIsVert)
            {
                boolean valid=true;
                for (int i=0; i<len; i++)
                {
                    if ((row+i>board.length || col+i>board[0].length) ||
                    (board[row+i][col+i].containsShip==true))
                        valid=false;
                }
            }
        }
    }
}