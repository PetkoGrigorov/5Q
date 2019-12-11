import java.util.Scanner;

public class Task8 {

    public static void backwardsPrint(int number){
        if (number > 0){
            multiPrint(number, number);
            number --;
            System.out.println();
            backwardsPrint(number);
        }
    }

    public static void multiPrint(int number, int value){
        if (number > 0){
            System.out.print(value);
            number --;
            multiPrint(number, value);
        }
    }

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Enter int number ");
        int number = consoleInput.nextInt();
        backwardsPrint(number);


    }
}
