import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter double number: ");
        double number = input.nextDouble();
        number = Math.abs(number);

        int n = (int) ((number*1000)%10);
        System.out.println(n);
    }
}
