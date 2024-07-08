package lowLevelDesign.vendingMachine;

public class Coin {
    CoinType coinType;

    Coin(CoinType type) {
        this.coinType = type;
    }

    public CoinType getCoinType() {
        return coinType;
    }
}
