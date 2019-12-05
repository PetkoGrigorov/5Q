import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 digit number: ");

        int number = input.nextInt();

        int digit4 = number % 10;
        number = number / 10;
        int digit3 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;
        int digit1 = number % 10;

        System.out.print(digit4 + "" + digit3 + "" + digit2 + "" + digit1);
 //       System.out.print(digit3);
 //       System.out.print(digit2);
 //       System.out.println(digit1);

    }
}
