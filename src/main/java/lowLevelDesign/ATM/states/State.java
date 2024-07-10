package lowLevelDesign.ATM.states;

import lowLevelDesign.ATM.ATM;
import lowLevelDesign.ATM.Card;

public abstract class State {

    public void insertCard(ATM atm,Card card) {
        System.out.println("Invalid operation ! Can not insert card in this state.");
    }

    public void enterPin(ATM atm, Card card, int pin) {
        System.out.println("Invalid operation ! Can not enter pin in this state.");
    }

    public void selectATMOpertaion(ATM atm, Card card) {
        System.out.println("Invalid operation ! ");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard() {
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(ATM atm) {
        System.out.println("OOPS!! Something went wrong");
    }


}
