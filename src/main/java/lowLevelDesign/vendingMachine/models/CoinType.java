package lowLevelDesign.vendingMachine.models;

public enum CoinType {
    FIVE(5), ONE(1), TWO(2), TEN(10);
    public int value;

    CoinType(int value) {
        this.value = value;
    }
}
