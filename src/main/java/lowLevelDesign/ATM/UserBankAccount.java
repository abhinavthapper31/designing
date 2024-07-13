package lowLevelDesign.ATM;

public class UserBankAccount {
    private int currentBalance;

    public UserBankAccount(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }
}
