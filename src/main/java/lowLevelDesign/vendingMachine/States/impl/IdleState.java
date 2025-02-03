package lowLevelDesign.vendingMachine.States.impl;

import lowLevelDesign.vendingMachine.models.Coin;
import lowLevelDesign.vendingMachine.models.Product;
import lowLevelDesign.vendingMachine.States.State;
import lowLevelDesign.vendingMachine.VendingMachine;

import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Machine in idle state");
    }

    @Override
    public void clickOnTheInsertCoinButton(VendingMachine machine) {
        machine.setVendingMachineState(new UserHasMoneyState());
    }

    @Override
    public void acceptCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Can not accept money as product selection is not done");
    }

    @Override
    public void clickOnTheSelectProductButton(VendingMachine machine) throws Exception {
        throw new Exception("Can not click on product button as money is not inserted");
    }

    @Override
    public void productSelection(VendingMachine machine, int code) throws Exception {
        throw new Exception("Can not product selection money is not inserted");

    }

    @Override
    public List<Coin> refundFullMoneyAmount(VendingMachine machine) throws Exception {
        throw new Exception("No refund as money has not been taken");
    }

    @Override
    public Product dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("invalid state. Product cannot be dispensed");
    }
}
