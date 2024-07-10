package lowLevelDesign.ATM.states;

import lowLevelDesign.ATM.ATM;
import lowLevelDesign.ATM.Card;

public class DisplayAmountState extends State {

    public void displayBalance(ATM atm, Card card) {
        System.out.println("Current balance is " + card.getCurrentBalance());
        returnCard();
        exit(atm);
    }

    public void returnCard() {
        System.out.println("Card ejected");
    }

    public void exit(ATM atm) {
        atm.setState(new IdleState());
        System.out.println("Exit happened");
    }
}
