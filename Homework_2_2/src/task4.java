import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter type: ");
        int type = input.nextInt();
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();
        double result;

        if (type == 1) {
            result = temperature*1.8 +32;
        } else {
            result = (temperature-32)/1.8;
        }

        System.out.println(result);
    }
}
