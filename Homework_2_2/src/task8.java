import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int number_A = input.nextInt();
        System.out.print("Enter number B: ");
        int number_B = input.nextInt();

        number_A = number_A + number_B;
        number_B = number_A - number_B;
        number_A = number_A - number_B;

        System.out.println("number A = "+number_A);
        System.out.println("number B = "+number_B);

    }
}
