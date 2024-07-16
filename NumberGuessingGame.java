import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int rounds = 2; 
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + rounds + " rounds to play.");

        for (int round = 1; round <= rounds; round++) {
            int targetNumber = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean won = false;

            System.out.println("\nRound " + round + " starts now!");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            while (attempts < maxAttempts) {
                System.out.print("Guess a number between 1 and 100: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("You won! The number was " + targetNumber + ".");
                    totalScore += (maxAttempts - attempts + 1) * 10; 
                    won = true;
                    break;
                } else if (userGuess > targetNumber) {
                    System.out.println("Lower! Try again.");
                } else {
                    System.out.println("Higher! Try again.");
                }
            }

            if (!won) {
                System.out.println("Game over for this round! The number was " + targetNumber + ".");
            }

            System.out.println("Your score after round " + round + " is: " + totalScore);
        }

        System.out.println("\nGame over! Your final score is: " + totalScore);
        scanner.close();
    }
}

