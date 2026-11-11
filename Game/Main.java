package Game;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String choice = "";// Makes menu error handling simple. Dont need try/catch

        while (!choice.equals("3")){

            System.out.println("\n===== WELCOME TO DICE GAME =====");
            System.out.println("1. Single player");
            System.out.println("2. Multiplayer");
            System.out.println("3. Exit");

            System.out.println("Choose a game mode: ");
            choice = scanner.nextLine();

            switch (choice){

                case "1":
                    DiceGame.startGame(scanner);
                    break;

                case "2":
                    MultiPlayerGame.startGame(scanner);
                    break;

                case "3":
                    System.out.println("Thank you for playing! See you next time!!");
                    break;

                default:
                    System.out.printf("Invalid Choice! Choose a number between 1, 2 or 3.");
            }
        }
        scanner.close();
    }
}
