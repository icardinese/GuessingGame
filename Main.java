import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(101);
        int guess;
        int guessAmount = 1;
        System.out.println("Enter your first guess:");
        guess = scan.nextInt();

        while (guess != x) {
            if (guess > x) {
                System.out.println("Your guess of " + guess + " was over the target value!");
            }
            if (guess < x) {
                System.out.println("Your guess of " + guess + " was under the target value!");
            }
            if (guess != x) {
                guess = scan.nextInt();
            }
            guessAmount++;
        }
        if (guessAmount <= 7) {
            System.out.println("Guess Amount: " + guessAmount);
            System.out.println("You got an impossibly good score!");
        }
        else if (guessAmount <= 10) {
            System.out.println("Guess Amount: " + guessAmount);
            System.out.println("You did a good job!");
        }
        else {
            System.out.println("Guess Amount: " + guessAmount);
            System.out.println("Try the divide and conquer strategy next time!");
        }
    }
}