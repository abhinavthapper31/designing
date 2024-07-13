package lowLevelDesign.ATM.Processor;

import lowLevelDesign.ATM.ATM;

public class FiveHundredNotesProcessor extends WithdrawlProcessor {

    public FiveHundredNotesProcessor(WithdrawlProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        // logic for withdrawing 500

        int consumedNotes = remainingAmount / 500;
        int remainingBalance = remainingAmount % 500;

        if (consumedNotes <= atm.getTwoThousandNotes()) {
            atm.deductTwoThousandNotes(consumedNotes);
        } else if (consumedNotes > atm.getTwoThousandNotes()) {
            // deduct all
            atm.deductTwoThousandNotes(atm.getTwoThousandNotes());
            remainingBalance = remainingBalance + (consumedNotes - atm.getFiveHundredNotes()) * 500;
        }

        System.out.println("Withdrew : " + + consumedNotes);
        System.out.println("Remaining : " + + remainingBalance);

        if (remainingBalance != 0) {
            System.out.println("Error !");
        }
    }
}
