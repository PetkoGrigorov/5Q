import java.util.Scanner;

public class Task7_NumberFibonacciFactorial {

    public static void numberFibonacci(int n, int numberBefore, int number) {
        if (n > 0) {
            number += numberBefore;
            numberBefore = number - numberBefore;
            number = Math.abs(number);
            numberBefore = Math.abs(numberBefore);
            n--;
            numberFibonacci(n, numberBefore, number);
        } else {
        nFactorial(number, 1);
    }
    }

    public static void nFactorial(int n, double result){
        result *= n;
        n--;
        if (n > 0){
            nFactorial(n, result);
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Enter int number ");
        int number = consoleInput.nextInt();
        numberFibonacci(number, -1, 0);
    }
}
