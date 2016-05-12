//Allison
public class GameboardOpponent
{
    private static BoardSpot [][] board;
    int shipsSunken;
    public GameboardOpponent()
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

    public void placeShips()
    {
        int ctr=0;
        int[] lens={2,3,3,4,5};
        int row;
        int col;
        while (ctr<5)
        {
            Ship compShip=new Ship(lens[ctr]);
            row=(int)(Math.random()*10);
            col=(int)(Math.random()*10);
            int vert=(int)(Math.random()*2);
            if (vert==0)
            {
                compShip.setIsVert(true);
            }
            else
            {
                compShip.setIsVert(false);
            }
            boolean valid=true;
            if(compShip.getIsVert())
            {
                for (int i=0; i<lens[ctr]; i++)
                {
                    if ((row+i>board.length || col>board[0].length) ||
                    (board[row+i][col].getContainsShip()==true))
                        valid=false;
                }
            }
            else
            {
                for (int i=0; i<lens[ctr]; i++)
                {
                    if ((row>board.length || col+i>board[0].length) ||
                    (board[row][col+i].getContainsShip()==true))
                        valid=false;
                }
            }
            if(valid)
            {
                if(compShip.getIsVert())
                {
                    board[row][col].setContainsShip(true);
                    board[row][col].setBattleShip(compShip);
                    board[row][col].setContainsHead(true);
                    for (int i=1; i<lens[ctr]; i++)
                    {
                        board[row+i][col].setContainsShip(true);
                        board[row+i][col].setBattleShip(compShip);
                    }
                }
                else
                {
                    board[row][col].setContainsShip(true);
                    board[row][col].setBattleShip(compShip);
                    board[row][col].setContainsHead(true);
                    for (int i=1; i<lens[ctr]; i++)
                    {
                        board[row][col+i].setContainsShip(true);
                        board[row][col+i].setBattleShip(compShip);
                    }
                }
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
        if (ship.getHitCtr()==ship.getLen())
        {
            shipsSunken++;
            System.out.println("You sunk their battleship!");
        }   
        if (shipsSunken==5)
            System.out.println("You win!");
    }
}