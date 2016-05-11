//Allison
public class GameboardOpponent
{
    private ViewSpot [][] board;
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
        //shipsSunken=0;
    }
}