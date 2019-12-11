import java.util.Scanner;

public class Task5_oneNumberOfFibonacci {

    public static void numberFibonacci(int n, int numberBefor, int numberN){

        if (n>0){
            numberN += numberBefor;
            numberBefor = numberN - numberBefor;
            numberN = Math.abs(numberN);
            numberBefor = Math.abs(numberBefor);
            n--;
 //           System.out.print(numberN);
 //           System.out.print(" ");
            numberFibonacci(n,numberBefor, numberN);
        } else {
            System.out.println("Your Fibonacci number is " + numberN);
        }
    }

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Enter int number ");
        int numberNofFibonacci = consoleInput.nextInt();
        numberFibonacci(numberNofFibonacci, -1, 0);
    }
}
