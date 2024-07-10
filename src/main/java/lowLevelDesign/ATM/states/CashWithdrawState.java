package lowLevelDesign.ATM.states;

import lowLevelDesign.ATM.ATM;
import lowLevelDesign.ATM.Card;
import lowLevelDesign.ATM.Processor.WithdrawlProcessor;

public class CashWithdrawState extends State {

    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount) {

        if (withdrawAmount > atm.getAtmBalance()) {
            System.out.println("Atm can not serve request ! Insufficient amount in atm");
        } else if (withdrawAmount > card.getCurrentBalance()) {
            System.out.println("Atm can not serve request ! Insufficient amount in card");
        } else {
            // created processor

            WithdrawlProcessor processor;

        }
    }
}
