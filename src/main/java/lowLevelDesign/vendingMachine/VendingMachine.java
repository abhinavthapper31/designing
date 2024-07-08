package lowLevelDesign.vendingMachine;

import lowLevelDesign.vendingMachine.States.State;
import lowLevelDesign.vendingMachine.States.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State vendingMachineState;
    List<Coin> coinsList;
    Inventory inventory;
    List<Coin> currentCoinsList;

    VendingMachine(Inventory inventory) {
        // add here
        this.inventory = inventory;
        List<Coin> coins = new ArrayList<>();
        coins.add(new Coin(CoinType.ONE));
        coins.add(new Coin(CoinType.ONE));
        coins.add(new Coin(CoinType.ONE));
        coins.add(new Coin(CoinType.TWO));
        coins.add(new Coin(CoinType.TWO));
        coins.add(new Coin(CoinType.TWO));
        coins.add(new Coin(CoinType.FIVE));
        coins.add(new Coin(CoinType.FIVE));
        coins.add(new Coin(CoinType.TEN));
        this.coinsList = coins;
        vendingMachineState = new IdleState();
        currentCoinsList = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Coin> getCoinsList() {
        return coinsList;
    }

    public void setCoinsList(List<Coin> coinsList) {
        this.coinsList = coinsList;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCurrentCoinsList() {
        return currentCoinsList;
    }

    public void setCurrentCoinsList(List<Coin> currentCoinsList) {
        this.currentCoinsList = currentCoinsList;
    }
}
