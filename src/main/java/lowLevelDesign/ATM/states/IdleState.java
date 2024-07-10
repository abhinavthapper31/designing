package lowLevelDesign.ATM.states;

import lowLevelDesign.ATM.ATM;
import lowLevelDesign.ATM.Card;

public class IdleState extends State {

    public void insertCard(ATM atm, Card card) {
        atm.setState(new CardInsertedState());
        System.out.println("Card inserted !");
    }
}
