package lowLevelDesign.ATM.Processor;

import lowLevelDesign.ATM.ATM;

public abstract class WithdrawlProcessor {

    WithdrawlProcessor nextProcessor;

    WithdrawlProcessor(WithdrawlProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount) {

        if (nextProcessor != null) {
            nextProcessor.withdraw(atm, remainingAmount);
        }
    }

}
