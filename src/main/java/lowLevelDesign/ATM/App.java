package lowLevelDesign.ATM;

import lowLevelDesign.ATM.enums.ATMOperations;

public class App {

    public  static  void main(String []args){

        ATM atmMachine = new ATM() ;
        atmMachine.printCurrentATMStatus();
        UserBankAccount account = new UserBankAccount(5000);
        Card card = new Card("1234", "Abhinav", "123", 5678,account) ;

        atmMachine.getState().insertCard(atmMachine, card);
        atmMachine.getState().enterPin(atmMachine,card,5678);
        atmMachine.getState().showSupportedOperations();

//        atmMachine.getState().selectATMOpertaion(atmMachine,card, ATMOperations.VIEW_BALANCE);
//        atmMachine.getState().displayBalance(atmMachine, card);
        atmMachine.getState().selectATMOpertaion(atmMachine,card, ATMOperations.CASH_WITHDRAW);
        atmMachine.getState().cashWithdrawal(atmMachine,card,2000);


        System.out.println(atmMachine.getState());
    }
}
