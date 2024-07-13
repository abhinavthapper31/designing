package lowLevelDesign.ATM.states;

import lowLevelDesign.ATM.ATM;
import lowLevelDesign.ATM.Card;
import lowLevelDesign.ATM.Processor.FiveHundredNotesProcessor;
import lowLevelDesign.ATM.Processor.TwoThousandNotesProcessor;
import lowLevelDesign.ATM.Processor.WithdrawlProcessor;

public class CashWithdrawState extends State {

    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount) {

        if (withdrawAmount > atm.getAtmBalance()) {
            System.out.println("Atm can not serve request ! Insufficient amount in atm");
        } else if (withdrawAmount > card.getCurrentBalance()) {
            System.out.println("Atm can not serve request ! Insufficient amount in card");
        } else {
            // created processor

            WithdrawlProcessor processor = new TwoThousandNotesProcessor(new FiveHundredNotesProcessor(null));
            processor.withdraw(atm, withdrawAmount);

            card.deductAmount(withdrawAmount);
            atm.updateBalance();

            System.out.println("Post withdrawl balance" + atm.getAtmBalance());
            System.out.println("Post withdrawl balance" + card.getCurrentBalance());

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
