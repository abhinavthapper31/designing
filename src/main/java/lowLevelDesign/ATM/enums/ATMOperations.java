package lowLevelDesign.ATM.enums;

public enum ATMOperations {
    CASH_WITHDRAW, CASH_DEPOSIT, VIEW_BALANCE;

    public static void showAllTransactionTypes() {

        for (ATMOperations type : ATMOperations.values()) {
            System.out.println(type.name());
        }
    }

}
