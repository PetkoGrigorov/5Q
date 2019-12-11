import java.util.Scanner;

public class Task3 {

    public static void dividedByDigits(int number, int count){
        int digit = number%10;
        System.out.print(digit+"  ");
        number /= 10;
        count++;
        if (number > 0){
            dividedByDigits(number, count);
        }else {
            System.out.println("The digits are "+count);
        }
    }

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter integer number ");
        int number = consoleInput.nextInt();
        dividedByDigits(number, 0);

    }
}
