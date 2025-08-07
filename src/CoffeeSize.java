import java.sql.SQLOutput;
import java.util.Scanner;


public class CoffeeSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java Coffee Shop");
        System.out.println("Choose a coffee size: Small(S), Regular(R), Large(L)");
        String size = scanner.nextLine().toUpperCase();

        System.out.println("Choose a coffee option: Espresso (E), Cappucino(C), Latte(L)");
        String coffeeOption = scanner.nextLine().toUpperCase();

        double price = 0;

        switch(size) {
            case "S":
                price += 2.50;
                break;
            case "R":
                price += 3.00;
                break;
            case "L":
                price += 3.50;
            default:
                System.out.println("Invalid option! Please, try again.");
                return;
        }

        switch(coffeeOption) {
            case "E":
                price += 1.50;
                break;
            case "C":
                price += 2.00;
                break;
            case "L":
                price += 2.50;
                break;
            default:
                System.out.println("Please, choose a valid option.");
                return;
        }

        System.out.println("Your order has been successfuly placed.");
        System.out.println("Total price: $ " + price);

    }
}
