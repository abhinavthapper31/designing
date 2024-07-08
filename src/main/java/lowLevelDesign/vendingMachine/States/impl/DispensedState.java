package lowLevelDesign.vendingMachine.States.impl;

import lowLevelDesign.vendingMachine.Coin;
import lowLevelDesign.vendingMachine.Product;
import lowLevelDesign.vendingMachine.States.State;
import lowLevelDesign.vendingMachine.VendingMachine;

import java.util.Collections;
import java.util.List;

public class DispensedState implements State {

    public DispensedState(VendingMachine machine, int code) throws Exception {
        System.out.println("Machine in dispensed state");
        dispenseProduct(machine, code);
    }

    @Override
    public void clickOnTheInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");


    }

    @Override
    public void acceptCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("coin can not be inserted in Dispense state");


    }

    @Override
    public void clickOnTheSelectProductButton(VendingMachine machine) throws Exception {
        throw new Exception("product select button can not be choosen in Dispense state");


    }

    @Override
    public void productSelection(VendingMachine machine, int code) throws Exception {
        throw new Exception("product selection buttion can not be clicked in Dispense state");


    }

    @Override
    public List<Coin> refundFullMoneyAmount(VendingMachine machine) throws Exception {
        throw new Exception("refund can not be happen in Dispense state");
    }

    @Override
    public Product dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Product item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState());
        return item;
    }
}
