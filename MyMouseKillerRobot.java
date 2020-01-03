import java.util.Scanner;

public class MyMouseKillerRobot {

    public static void getDirection(){
        Scanner consoleImput = new Scanner(System.in);
        System.out.print("Enter object (1: wall, 2: chair, 3: nothing): ");
        int object = consoleImput.nextInt();
        switch (object){
            case 1: System.out.println("Go Sideway"); break;
            case 2: System.out.println("Jump"); break;
            case 3: System.out.println("Forward"); break;
            default: getDirection();
        }
    }

    public static int randomNumber(int min, int max){
        int randomNumber = (int)(Math.random()*(max - min) + min);
        return (randomNumber);
    }

    public static boolean isMouseDetected(){
        Scanner consoleImput = new Scanner(System.in);
        System.out.print("Enter number of pixels: ");
        int pixels = consoleImput.nextInt();
        return (pixels%2 == 0);
    }

    public static boolean isBatteryCharged(int availableHits){
        System.out.println("Hits left " + availableHits);
        return (availableHits > 0);
    }

    public static boolean isАppropriateToHit(){
        int randomNumber = randomNumber(1, 10);
//        System.out.println("random " + randomNumber);
        return (randomNumber !=5);
    }

    public static boolean canChargeBattery(int firstNumber, int secondNumber){
//        System.out.println("RANDOM " + firstNumber + " / " + secondNumber);
        if (firstNumber == secondNumber){
            reCheckPowerSupply();
        }
        return (firstNumber > secondNumber);
    }

    public static void reCheckPowerSupply(){
        int firstNumber = randomNumber(1, 1000);
        int secondNumber = randomNumber(1, 1000);
        canChargeBattery(firstNumber, secondNumber);
    }

    public static void isHitSuccesful(int availableHits, int count){
        getDirection();
        if (isMouseDetected()){
            System.out.println("Look a mouse!");
            if (isBatteryCharged(availableHits)){
                System.out.println("Battery is O.K.");
                if (isАppropriateToHit()){
                    availableHits --;
                    System.out.println("A mouse is killed!!! I killed " + count + " mouses.");
                    count++;
                    System.out.println();
                    isHitSuccesful(availableHits, count);
                } else {
                    System.out.println("Oooops Furniture!!!");
                    System.out.println();
                    isHitSuccesful(availableHits, count);
                }

            } else {
                System.out.println("Low battery!");
                int firstNumber = randomNumber(1, 1000);
                int secondNumber = randomNumber(1, 1000);
                if (canChargeBattery(firstNumber, secondNumber)){
                    availableHits = 4;
                    System.out.println("Battery is fully charged");
                    System.out.println();
                    isHitSuccesful(availableHits, count);
                }else {
                    System.out.println("No power supply");
                }
            }
        }else {
            System.out.println();
            isHitSuccesful(availableHits, count);
        }
    }

    public static void main(String[] args) {
        final int maxHit = 2;
        int availableHits = maxHit;
        isHitSuccesful(availableHits, 1);

    }
}
