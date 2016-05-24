import java.util.Scanner;
public class runGame
{
    static GameboardYou youBoard=new GameboardYou();
    static GameboardOpponent oppBoard=new GameboardOpponent();
    static Scanner sc=new Scanner(System.in);
    static int[] lengths={2,3,3,4,5};
    static String[] boats={"patrol boat","destroyer","submarine","battleship","carrier"};
    static ComputerPlayer cpu = new ComputerPlayer();
    public static void main (String [] args)
    {
        oppBoard.placeShips();
        printBoards();
        System.out.println("Welcome to Battleship!");
        for (int i=0; i<lengths.length; i++)
        {
            System.out.println("Enter row of head of "+boats[i]+" (length of " +lengths[i]+")");
            int row=sc.nextInt();
            System.out.println("Enter column of head of "+boats[i]+" (length of " +lengths[i]+")");
            int col=sc.nextInt();
            System.out.println("Do you want the ship to be vertical? (y or n)");
            String phrase=sc.next();
            Ship ship=new Ship(lengths[i]);
            if ((phrase.equals("y")) || (phrase.equals("Y")))
                ship.setIsVert(true);
            else if ((phrase.equals("n")) || (phrase.equals("N")))
                ship.setIsVert(false);
            youBoard.placeShip(row,col,ship);
        }
        oppBoard.placeShips();
        printBoards();
        int x;
        int y;
        while (oppBoard.getShipsSunken()!=5 || youBoard.getShipsSunken()!=5)
        {
            System.out.println("Enter x coordinate of your shot: ");
            x=sc.nextInt();
            System.out.println("Enter y coordinate of your shot: ");
            y=sc.nextInt();
            Player.takeShot(x,y);
            cpu.takeShot();
            printBoards();

        }
    }

    public static void printBoards()
    {
        System.out.print(oppBoard);
        System.out.println("Opponent's board\n");
        System.out.print(youBoard);
        System.out.println("Your board\n");
    }
}
