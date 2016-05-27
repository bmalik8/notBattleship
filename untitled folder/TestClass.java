
/**
 * A tester class for the Battleship game.
 */
public class TestClass
{
    public static void main (String[] args) 
    {
        // created a player and a computer opponent w/ boards
        Player p1= new Player();
        ComputerPlayer compPlayer= new ComputerPlayer();
        GameboardYou yourBoard = new GameboardYou();
        GameboardOpponent compBoard= new GameboardOpponent();
        
        // ships are instantiated
        Ship carrier = new Ship(5);
        Ship battleship = new Ship(4);
        battleship.setIsVert(false); //horizontal
        Ship submarine = new Ship(3);
        Ship destroyer = new Ship(3);
        destroyer.setIsVert(false); //horizontal
        Ship patrolBoat = new Ship(2);
        patrolBoat.setIsVert(false); //horizontal
        
        // all ships placed on board
        compBoard.placeShips();
        yourBoard.placeShip(1,2, carrier);
        yourBoard.placeShip(5,3, battleship);
        yourBoard.placeShip(7,7, submarine);
        yourBoard.placeShip(1,2, destroyer); //should not work bc already ship there
        yourBoard.placeShip(9,9, patrolBoat);// should not work bc goes off board
        
        // one sequence 
        p1.takeShot(4,5);
        compPlayer.takeShot();
        
    }
}
