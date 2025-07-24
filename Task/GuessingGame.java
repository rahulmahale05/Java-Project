import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        playGame();
    }
    
    public static void playGame() {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // generate a random number between 1 and 100

        int attempts = 0;
        int maxAttempts = 6;
        int score = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n***************************Welcome to the number guessing game!***************************");
        System.out.println("\nI'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("\nEnter your guess: ");
            int userGuess = sc.nextInt();

            attempts++;

            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed it!");
                score++;
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        if (score ==  1) {
            System.out.println("You won! You guessed it in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you didn't guess it. The number was " + secretNumber);
        }

        System.out.print("\nDo you want to play again? (y/n): ");
        String response = sc.next();

        if (response.equalsIgnoreCase("y")) {
            playGame();
        } else {
            System.out.println("\n***************************Thanks for playing!***************************");
        }
    }
}
