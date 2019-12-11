import java.util.Scanner;

public class Task4_nFaktoriel {

    public static void nFactorial(int resultFactorial, int n, int numberForFactorial){
        resultFactorial *= n;
        n--;
        if (n > 0){
            nFactorial(resultFactorial, n, numberForFactorial);
        }else {
            System.out.println("The factorial of " + numberForFactorial + " is " + resultFactorial);
        }
    }

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Enter int number ");
        int numberForFactorial = consoleInput.nextInt();
        nFactorial(1, numberForFactorial, numberForFactorial);
    }
}
