import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(20) +1;
        System.out.println("Welcome to Secret Number Challenge!");
        System.out.println("Guess a number between 1 and 20.");

        int attempts = 0;
        boolean correctNumber = false;

        while(!correctNumber) {
            System.out.println("Type a number: ");
            int attempt = sc.nextInt();
            attempts++;

            if (attempt == secretNumber) {
                System.out.println("Spot on! You needed " + attempts + " attempts to guess the correct number.");
                correctNumber = true;
            } else if (attempt < secretNumber) {
                System.out.println("Choose a higher number...");
            } else {
                System.out.println("Choose a smaller number");
            }
        }

        sc.close();
    }
}
