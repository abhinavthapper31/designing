package lowLevelDesign.vendingMachine.States.impl;

import lowLevelDesign.vendingMachine.Coin;
import lowLevelDesign.vendingMachine.Product;
import lowLevelDesign.vendingMachine.States.State;
import lowLevelDesign.vendingMachine.VendingMachine;

import java.util.Collections;
import java.util.List;

public class ProductSelectionState implements State {

    public ProductSelectionState() {
        System.out.println("Machine in product selection state");
    }

    @Override
    public void clickOnTheInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");


    }

    @Override
    public void acceptCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not click on accept coin button in Selection state");


    }

    @Override
    public void clickOnTheSelectProductButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void productSelection(VendingMachine machine, int code) throws Exception {
        Product item = machine.getInventory().getItem(code);

        int paidByUser = 0;
        for (Coin coin : machine.getCurrentCoinsList()) {
            paidByUser = paidByUser + coin.getCoinType().value;
        }
        if (paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            refundFullMoneyAmount(machine);
            throw new Exception("insufficient amount");
        } else if (paidByUser >= item.getPrice()) {

            if (paidByUser > item.getPrice()) {
                getChange(paidByUser - item.getPrice());
            }
            machine.setVendingMachineState(new DispensedState(machine, code));
        }

    }

    private void getChange(int i) {
    }

    @Override
    public List<Coin> refundFullMoneyAmount(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getCurrentCoinsList();
    }

    @Override
    public Product dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed Selection state");

    }
}
