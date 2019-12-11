import java.util.Scanner;

public class Task6_Converter {

    public static void dayConvert(int n){
        n = n%7;
        System.out.print("The day is ");
        switch (n){
            case 1:
                System.out.println("Mondey"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            default:
                System.out.println("Sunday"); break;
        }
    }

    public static void hourConvert(){

    }

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Enter int number ");
        int day = consoleInput.nextInt();
        dayConvert(day);




    }
}
