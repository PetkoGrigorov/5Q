public class Bank {
    public static void main(String[] args) {
        int numberAllCredits;
        int numberDepositsMade;
        String[] nameCreditProduct = {
          "Credit 1", "Credit 2", "Credit 3", "Credit 4", "Credit 5", "Credit 6", "Credit 7"
        };
        String[] nameDepositProduct = {
                "Deposit A", "Deposit B", "Deposit C", "Deposit D", "Deposit E"
        };
        int lastIndexCreditProduct = nameCreditProduct.length - 1;
        int lastIndexDepositProduct = nameDepositProduct.length - 1;
        System.out.print("The first credit product is ");
        System.out.println(nameCreditProduct[0]);
        System.out.print("The last credit product is ");
        System.out.println(nameCreditProduct[lastIndexCreditProduct]);
        System.out.print("The first deposit product is ");
        System.out.println(nameDepositProduct[0]);
        System.out.print("The last deposit product is ");
        System.out.println(nameDepositProduct[lastIndexDepositProduct]);
        boolean isCreditTime;
        boolean isDepositTime;
        boolean isBankOpen;
        double allBankMoney;
        allBankMoney = 3124365.26;
        System.out.print("All bank money ");
        System.out.print(allBankMoney);
        System.out.println( " lv.");
    }
}
