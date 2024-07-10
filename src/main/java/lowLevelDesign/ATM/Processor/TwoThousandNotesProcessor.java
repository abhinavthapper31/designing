package lowLevelDesign.ATM.Processor;

import lowLevelDesign.ATM.ATM;

public class TwoThousandNotesProcessor extends WithdrawlProcessor {

    TwoThousandNotesProcessor(WithdrawlProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        // logic for withdrawing 2000

        int consumedNotes = remainingAmount / 2000;
        int remainingBalance = remainingAmount % 2000;

        if (consumedNotes <= atm.getTwoThousandNotes()) {
            atm.deductTwoThousandNotes(consumedNotes);
        } else if (consumedNotes > atm.getTwoThousandNotes()) {
            // deduct all
            atm.deductTwoThousandNotes(atm.getTwoThousandNotes());
            remainingBalance = remainingBalance + (consumedNotes - atm.getTwoThousandNotes()) * 2000;
        }

        if (remainingBalance != 0) {
            super.withdraw(atm, remainingBalance);
        }


    }
}
