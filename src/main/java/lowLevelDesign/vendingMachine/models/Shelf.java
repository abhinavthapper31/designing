package lowLevelDesign.vendingMachine.models;

public class Shelf {

    Product product;
    boolean soldOut;
    int code;

    public Shelf() {

    }

    public Shelf(Product type, int code) {
        this.product = type;
        this.soldOut = false;
        this.code = code;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "product=" + product +
                ", soldOut=" + soldOut +
                ", code=" + code +
                '}';
    }
}
