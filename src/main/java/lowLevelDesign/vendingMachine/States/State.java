package lowLevelDesign.vendingMachine.States;

import lowLevelDesign.vendingMachine.Coin;
import lowLevelDesign.vendingMachine.Product;
import lowLevelDesign.vendingMachine.VendingMachine;

import java.util.List;

// use abstract class for state
public interface State {
    // this will have all the possible operations

    void clickOnTheInsertCoinButton(VendingMachine machine) throws Exception;

    void acceptCoin(VendingMachine machine, Coin coin) throws Exception;

    void clickOnTheSelectProductButton(VendingMachine machine) throws Exception;

    void productSelection(VendingMachine machine, int code) throws Exception;

    List<Coin> refundFullMoneyAmount(VendingMachine machine) throws Exception;

    Product dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;


}
