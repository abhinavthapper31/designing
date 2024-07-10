package lowLevelDesign.ATM;

public class Card {
    String cardNumber;
    String nameOnCard;
    Integer balance;

    public Card(String cardNumber, String nameOnCard, Integer balance) {
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;

    }

    public void deductAmount(int amount) {
        this.balance = this.balance - amount;
    }

    public int getCurrentBalance() {
        return this.balance;
    }

}
