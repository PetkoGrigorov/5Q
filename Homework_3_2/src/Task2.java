import java.util.Scanner;

public class Task2 {

    public  static void multiMultiplication (double number, int multiMultiplication, double result){
        result *= number;
        multiMultiplication --;
        if (multiMultiplication > 0) {
            multiMultiplication(number, multiMultiplication, result);
        } else {
            System.out.println("Result is " + result);
        }
    }

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter double number ");
        double number = consoleInput.nextDouble();
        System.out.println("Enter integer multiMultiplication ");
        int multiMultiplication = consoleInput.nextInt();
        multiMultiplication(number, multiMultiplication, 1);
    }
}
