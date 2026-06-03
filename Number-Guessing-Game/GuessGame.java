import java.util.Scanner;
import java.util.Random;

public class GuessGame{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too High! Try Again.");
            }
            else if (guess < secretNumber) {
                System.out.println("Too Low! Try Again.");
            }
            else {
                System.out.println("Congratulations!");
                System.out.println("You guessed the correct number: " + secretNumber);
                System.out.println("Attempts taken: " + attempts);
            }
        }

        sc.close();
    }
}
