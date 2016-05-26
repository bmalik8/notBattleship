import java.util.Scanner;
public class runGame
{
    //creating boards, scanners, arrays for placing ships, and a cpu player
    static GameboardYou youBoard=new GameboardYou();
    static GameboardOpponent oppBoard=new GameboardOpponent();
    static Scanner sc=new Scanner(System.in);
    static int[] lengths={2,3,3,4,5};
    static String[] boats={"patrol boat","destroyer","submarine","battleship","carrier"};
    static ComputerPlayer cpu = new ComputerPlayer();
    public static void main (String [] args)
    {
        System.out.println("Welcome to Battleship!");
        //i tells you which ship is going to be placed
        int i=0;
        oppBoard.placeShips();
        printBoards();
        //takes in coordinates from user and places their battleships
        while (i<lengths.length)
        {
            //getting coordinates
            System.out.println("Enter x coordinate of head of "+boats[i]+" (length of " +lengths[i]+")");
            int x=sc.nextInt();
            System.out.println("Enter y coordinate  of head of "+boats[i]+" (length of " +lengths[i]+")");
            int y=sc.nextInt();

            //asking if ship should be going up and down or left and right
            System.out.println("Do you want the ship to be vertical? (y or n)");
            String phrase=sc.next();
            //create a new ship
            Ship ship=new Ship(lengths[i]);
            //setting boolean isVert and placing ship
            boolean shipPlaced;
            if ((phrase.equals("y")) || (phrase.equals("Y")))
            {
                ship.setIsVert(true);
                shipPlaced=youBoard.placeShip(y,x,ship);
            }
            else if ((phrase.equals("n")) || (phrase.equals("N")))
            {
                ship.setIsVert(false);
                shipPlaced=youBoard.placeShip(y,x,ship);
            }
            else
            {
                System.out.println("Invalid input.");
                shipPlaced=false;
            }
            //if ship doesn't get placed, keeps asking again until the ship is placed correctly
            while(shipPlaced==false)
            {
                System.out.println("Try placing that ship in a valid spot");
                System.out.println("Enter x coordinate of head of "+boats[i]+" (length of " +lengths[i]+")");
                x=sc.nextInt();
                System.out.println("Enter y coordinate of head of "+boats[i]+" (length of " +lengths[i]+")");
                y=sc.nextInt();
                System.out.println("Do you want the ship to be vertical? (y or n)");
                phrase=sc.next();
                ship=new Ship(lengths[i]);
                if ((phrase.equals("y")) || (phrase.equals("Y")))
                {
                    ship.setIsVert(true);
                    shipPlaced=youBoard.placeShip(y,x,ship);
                }
                else if ((phrase.equals("n")) || (phrase.equals("N")))
                {
                    ship.setIsVert(false);
                    shipPlaced=youBoard.placeShip(y,x,ship);
                }
                else
                {
                    System.out.println("Invalid input.");
                    shipPlaced=false;
                }
            }
            //every time ship is placed correctly, prints the boards and increments i to move onto next ship
            printBoards();
            i++;
        }
        //getting coordinates of taking a shot
        int x;
        int y;
        //just printing out some notes to the player
        System.out.println("Let's play! \n0 means a ship is hit \n* means this spot was attempted to be hit, but they missed\nO means that's where your ship is");
        System.out.println("Reminder: X coordinates or labeled along the top and Y are on the left");
        //keep taking shots until the player wins or loses
        while (oppBoard.getShipsSunken()<5 || youBoard.getShipsSunken()<5)
        {
            //getting coordinates
            System.out.println("Enter x coordinate of your shot: ");
            x=sc.nextInt();
            System.out.println("Enter y coordinate of your shot: ");
            y=sc.nextInt();
            //while loop makes sure it's a valid spot, if not, you ask again
            while (x<0||x>9||y<0||y>9)
            {
                System.out.println("Invalid coordinate. Please try again");
                System.out.println("Enter x coordinate of your shot: ");
                x=sc.nextInt();
                System.out.println("Enter y coordinate of your shot: ");
                y=sc.nextInt();
            }
            //you take a shot then the computer player takes a shot
            Player.takeShot(x,y);
            cpu.takeShot();
            //display boards for player to see
            printBoards();
        }
        
    }
    //prints boards and labels them as yours or cpu's
    public static void printBoards()
    {
        System.out.print(oppBoard);
        System.out.println("Opponent's board\n");
        System.out.print(youBoard);
        System.out.println("Your board\n");
    }
}
