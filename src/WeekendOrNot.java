import java.util.Scanner;

public class WeekendOrNot {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sunny, weekend;

        System.out.print("Is it sunny outside? (true/false)");
        sunny = sc.nextBoolean();

        System.out.print("Is it sunny weekend? (true/false)");
        weekend = sc.nextBoolean();

        if(sunny && weekend) {
            System.out.println("Let us party together!");
        }




    }
}
