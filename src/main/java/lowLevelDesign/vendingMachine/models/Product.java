package lowLevelDesign.vendingMachine.models;

public class Product {
    ItemType product;
    int price;

    public Product() {

    }

    public Product(ItemType product, int price) {
        this.product = product;
        this.price = price;
    }

    public ItemType getProduct() {
        return product;
    }

    public void setProduct(ItemType product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product=" + product +
                ", price=" + price +
                '}';
    }
}
