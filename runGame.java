import java.util.Scanner;
public class runGame
{
    static GameboardYou youBoard=new GameboardYou();
    static GameboardOpponent oppBoard=new GameboardOpponent();
    Scanner sc=new Scanner(System.in);
    public static void main (String [] args)
    {
        oppBoard.placeShips();
        printBoards();
        System.out.println("Welcome to Battleship!");
        System.out.println("Enter coordinates of head of ");
    }
    
    public static void printBoards()
    {
        System.out.print(oppBoard);
        System.out.println("Opponent's board\n");
        System.out.print(youBoard);
        System.out.println("Your board\n");
    }
}