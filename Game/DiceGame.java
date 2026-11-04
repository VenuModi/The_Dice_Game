
package Game;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        System.out.println("===WELCOME TO THE DICE GAME===");
        
        Scanner scanner = new Scanner(System.in);

        //Ask how many rounds the user wants to play
        System.out.print("How many rounds do you want to play?: ");
        int numberOfRounds = scanner.nextInt();

        //Ask how many sides of the die the user have
        System.out.print("How many sides does your die have?: ");
        int sides = scanner.nextInt();

        //Ask players name
        System.out.print("Enter the name of the player: ");
        String playerName = scanner.nextLine();

        //Create a player
        Player player = new Player(playerName);

        //Give player a die
        player.addDie(sides);

        System.out.println("Welcome " + player.getPlayerName() + " ! The player has choosen " + sides + " sided die.");

        //Play game

        
    }
    
}
