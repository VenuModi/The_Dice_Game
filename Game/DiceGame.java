
package Game;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DiceGame {

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

    //Play rounds
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

        //Ask for number of rounds
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

        //Ask for number of sides
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
        player.addDie(sides);

        System.out.println("\nWelcome " + player.getPlayerName() + "!");

        //Play the game
        playRounds(player, scanner, numberOfRounds, sides);


        System.out.println("\n===== GAME OVER =====");
        System.out.println("Player: " + player.getPlayerName());
        System.out.println("Final score: " + player.getScore());

        scanner.close();
    }
    
}
        
        