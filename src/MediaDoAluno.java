import java.util.Scanner;

public class MediaDoAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeDoAluno = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();

        double media = (primeiraNota + segundaNota)/2;

        System.out.println("O Aluno " + nomeDoAluno + " tem a média de " + media);

        double result = (((10+3)/2)*5)%3;
        System.out.println("The result is: " + result);
        sc.close();
    }
}
