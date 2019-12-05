import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner fromConsole = new Scanner(System.in);
        System.out.print("Enter first side: ");
        double side_A = fromConsole.nextDouble();
        System.out.print("Enter second side: ");
        double side_B = fromConsole.nextDouble();
        System.out.print("Enter third side: ");
        double side_C = fromConsole.nextDouble();

        boolean isTriangle = ((side_A + side_B)>side_C && (side_A + side_C)>side_B && (side_B + side_C)>side_A) ? true : false;

        System.out.println(isTriangle);
    }
}
