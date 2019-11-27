public class Bank {
    public static void main(String[] args) {
        int numberAllCredits;
        int numberDepositsMade;
        String[] nameCreditProduct = {
          "credit 1", "credit 2", "credit 3", "credit 4", "credit 5", "credit 6", "credit 7"
        };
        String[] nameDepositProduct = {
                "deposit A", "deposit B", "deposit C", "deposit D", "deposit E"
        };
        int lastIndexCreditProduct = nameCreditProduct.length - 1;
        int lastIndexDepositProduct = nameDepositProduct.length - 1;
        System.out.println(nameCreditProduct[0]);
        System.out.println(nameCreditProduct[lastIndexCreditProduct]);
        System.out.println(nameDepositProduct[0]);
        System.out.println(nameDepositProduct[lastIndexDepositProduct]);
        boolean isCreditTime;
        boolean isDepositTime;
        boolean isBankOpen;
        double allBankMoney;
        allBankMoney = 3124365.26;
        System.out.println(allBankMoney);

    }
}
