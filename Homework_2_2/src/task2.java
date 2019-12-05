import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 digit number: ");

        int number = input.nextInt();
        int result = number;

        int digit4 = number % 10;
        number = number / 10;
        int digit3 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;
        int digit1 = number % 10;

        int newNumber = digit1 + digit2*10 + digit3*100 + digit4*1000;

//
        result = (result < newNumber) ? newNumber : result;

//        if (result < newNumber) {
//            result = newNumber;
//        }

        System.out.println(result);
    }
}
