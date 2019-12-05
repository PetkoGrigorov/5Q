import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");

        double number = input.nextDouble();
        double rezult = 0;

        if (number > 0) {
            rezult = number*10;
        } else if (number == 0) {
            rezult = number - 10;
        } else {
            rezult = number/10;
        }

        System.out.println(rezult);
    }
}
