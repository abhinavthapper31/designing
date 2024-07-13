package lowLevelDesign.ATM;

public class Card {
    String cardNumber;
    String nameOnCard;
    String cvv;
    UserBankAccount bankAccount;
    int pin;

    public Card(String cardNumber, String nameOnCard, String cvv, int pin,UserBankAccount bankAccount) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
        this.pin = pin;
        this.bankAccount = bankAccount;
    }

    public boolean authenticatepin(int pin) {
        if (this.pin == pin) {
            return true;
        }

        return false;
    }


    public void deductAmount(int amount) {
        this.bankAccount.setCurrentBalance(this.getCurrentBalance() - amount);
    }

    public int getCurrentBalance() {
        return this.bankAccount.getCurrentBalance();
    }

    public void deductBankBalance(){

    }

}
