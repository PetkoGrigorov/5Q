import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner fromConsole = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = fromConsole.nextInt();

        int isLeapYear = (year%4 == 0) ? year : -1;

        System.out.println("result: " + isLeapYear);
    }
}
