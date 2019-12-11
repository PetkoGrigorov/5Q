import java.util.Scanner;

public class Task1 {


    public static void middleNumber (double numA, double numB, double numC){
        if (numA > numB){
            if (numA > numC){
                if (numB > numC){
                    System.out.println("Middle number is "+numB);
                } else {
                    System.out.println("Middle number is "+numC);
                }
            } else {
                System.out.println("Middle number is "+numA);
            }
        } else {
            if (numB > numC){
                if (numA > numC){
                    System.out.println("Middle number is "+numA);
                } else {
                    System.out.println("Middle number is "+numC);
                }
            } else {
                System.out.println("Middle number is "+numB);
            }
        }
    }

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter 3 different numbers");
        double firstNumber = consoleInput.nextDouble();
        double secondNumber = consoleInput.nextDouble();
        double thirdNumber = consoleInput.nextDouble();
        middleNumber(firstNumber, secondNumber, thirdNumber);
    }

}
