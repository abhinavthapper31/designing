package lowLevelDesign.vendingMachine.models;

public class Coin {
    CoinType coinType;

    public Coin(CoinType type) {
        this.coinType = type;
    }

    public CoinType getCoinType() {
        return coinType;
    }
}
