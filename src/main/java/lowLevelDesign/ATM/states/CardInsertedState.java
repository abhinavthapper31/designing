package lowLevelDesign.ATM.states;

import lowLevelDesign.ATM.ATM;
import lowLevelDesign.ATM.Card;

public class CardInsertedState extends State {

    public void enterPin(ATM atm, Card card, int pin) {
        boolean valid = atm.authenticateCardPin(card, pin);
        if (valid) {
            System.out.println("Valid pin !");
            atm.setState(new SelectOperationState());
        } else {
            System.out.println("Invalid pin !");
            returnCard();
            exit(atm);
        }
    }

    public void returnCard() {
        System.out.println("Card ejected");
    }

    public void exit(ATM atm) {
        atm.setState(new IdleState());
        System.out.println("Exit happened");
    }
}
