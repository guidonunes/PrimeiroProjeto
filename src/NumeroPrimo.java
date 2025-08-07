import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo maior que 1: ");
        int input = sc.nextInt();

        if(input <= 1) {
            System.out.println("Número invalido. Digite um número válido");
        } else {
            boolean prime = true;

            for(int i = 2; i <= input; i++) {
                if (input % i == 0) {
                    prime = false;
                    break;
                }
            }

            if(prime) {
                System.out.println("The number " + input + " is prime.");
            } else {
                System.out.println("The number " + input + " is not prime.");
            }
        }
        sc.close();
    }
}
