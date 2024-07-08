package lowLevelDesign.vendingMachine.States.impl;

import lowLevelDesign.vendingMachine.Coin;
import lowLevelDesign.vendingMachine.Product;
import lowLevelDesign.vendingMachine.States.State;
import lowLevelDesign.vendingMachine.VendingMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserHasMoneyState implements State {

    public UserHasMoneyState() {
        System.out.println("Machine in user has money state");
    }

    @Override
    public void clickOnTheInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void acceptCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted coint " + coin.getCoinType().value);
        machine.getCurrentCoinsList().add(coin);
    }

    @Override
    public void clickOnTheSelectProductButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new ProductSelectionState());

    }

    @Override
    public void productSelection(VendingMachine machine, int code) throws Exception {
        throw new Exception("Can not select product as not in product selection state");
    }

    @Override
    public List<Coin> refundFullMoneyAmount(VendingMachine machine) throws Exception {
        List<Coin> coins = machine.getCurrentCoinsList();
        machine.setCurrentCoinsList(new ArrayList<>());
        return machine.getCurrentCoinsList();
    }

    @Override
    public Product dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Can not dispense product as not product selection has happened");
    }
}
