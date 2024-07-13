package lowLevelDesign.ATM.states;

import lowLevelDesign.ATM.ATM;
import lowLevelDesign.ATM.Card;
import lowLevelDesign.ATM.enums.ATMOperations;

public class SelectOperationState extends State {

    public void showSupportedOperations() {
        System.out.println("Please select the Operation");
        ATMOperations.showAllTransactionTypes();
    }

    public void selectATMOpertaion(ATM atm, Card card, ATMOperations operation) {
        switch (operation) {
            case CASH_WITHDRAW:
                atm.setState(new CashWithdrawState());
                break;
            case VIEW_BALANCE:
                atm.setState(new DisplayAmountState());
                break;
            default:
                System.out.println("Invalid operation");
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
