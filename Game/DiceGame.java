
package Game;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DiceGame {
        //Function to allow the user to enter a valid whole-number guess within the given dice range.
        private static int getValidGuess(Scanner scanner, int sides){

        int guessOfThePlayer = 0;

        //Ask for a valid guess
        while (guessOfThePlayer < 1 || guessOfThePlayer > sides) {

            try{
                System.out.println("Guess a number between 1 and " + sides + ": ");
                guessOfThePlayer = scanner.nextInt();

                if (guessOfThePlayer < 1 || guessOfThePlayer > sides) {
                    System.out.println("Your guess is outside the range!");
                }
            }catch (InputMismatchException e){
                System.out.println("ERROR! Please enter a whole number.");
                scanner.nextLine();
            }
        }
        return guessOfThePlayer;

    }

    //Function to run the game rounds and updates the score based on the player's guess against the dice rolls.
    private static void playRounds(Player player, Scanner scanner, int numberOfRounds, int sides){

        for (int rounds = 1; rounds <= numberOfRounds; rounds++) {

            System.out.println("\n------ Round - " + rounds + " ------");

            int guessOfThePlayer = getValidGuess(scanner, sides);

            player.rollDice();

            int result = player.getDieValue();

            System.out.println("The die rolled: " + result);

            if (guessOfThePlayer == result){

                player.increaseScore();
                System.out.println("Correct guess!! +1 point.");
            }else {
                System.out.println("Wrong guess! No points.");
            }

            System.out.println("Current score: " + player.getScore());

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== WELCOME TO THE DICE GAME ===");

        int numberOfRounds = 0;

        int sides = 0;

        //A while loop which repeatedly asks the uer to enter a valid and correct input and handles the invalid input using try-catch
        while (numberOfRounds <= 0){

            try {
                System.out.println("How many rounds do you want to play?");
                numberOfRounds = scanner.nextInt();

                if (numberOfRounds <= 0){
                    System.out.println("Rounds must be greater than 0.");
                }
            }catch (InputMismatchException e){
                System.out.println("ERROR!! Please enter a whole number.");
                scanner.nextLine();
            }
        }

        //Ask for number of sides : //A while loop which repeatedly asks the uer to valid input and handles the invalid input using try-catch
        while (sides < 2){

            try {
                System.out.println("How many sides should the die have?");
                sides = scanner.nextInt();

                if (sides < 2){
                    System.out.println("A die must at least have 2 sides.");
                }
            }catch (InputMismatchException e){
                System.out.println("ERROR!! Please enter a whole number.");
                scanner.nextLine();
            }
            
        }

        scanner.nextLine();

        //Ask player's name
        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine();

        //Create the player
        Player player = new Player(playerName);

        //Assigns a die to the player with the specified number of sides
        player.addDie(sides);

        //Play the game by passing , playername, scanner , numberOfRounds and sides as arguments to the playRounds function
        playRounds(player, scanner, numberOfRounds, sides);


        System.out.println("\n===== GAME OVER =====");
        System.out.println("Player: " + player.getPlayerName());
        System.out.println("Final score: " + player.getScore());

        scanner.close();
    }
    
}
        
        