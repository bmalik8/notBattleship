//Allison
public class GameboardOpponent
{
    private static ViewSpot [][] board;
    public GameboardOpponent()
    {
        board=new ViewSpot[10][10];
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
        int row=(int)(Math.random()*10+1);
        int col=(int)(Math.random()*10+1);
        while (ctr<5)
        {
            Ship compShip=new Ship(lens[ctr]);
            row=(int)(Math.random()*10+1);
            col=(int)(Math.random()*10+1);
            int vert=(int)(Math.random()*2);
            //if vert

        }
    }
}