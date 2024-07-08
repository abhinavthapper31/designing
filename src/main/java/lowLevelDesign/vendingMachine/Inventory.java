package lowLevelDesign.vendingMachine;

public class Inventory {

    Shelf[] inventory;

    Inventory(int itemCount) {
        inventory = new Shelf[itemCount];
        initialEmptyInventory();
    }

    public Shelf[] getInventory() {
        return inventory;
    }

    public void initialEmptyInventory() {
        int startCode = 101;
        for (int i = 0; i < inventory.length; i++) {
            Shelf space = new Shelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            // since it is empty initialization, all are initially sold out
            inventory[i] = space;
            startCode++;
        }
    }

    public void addProduct(Product item, int code) throws Exception {
        for (Shelf itemShelf : inventory) {
            if (itemShelf.code == code) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.setProduct(item);
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("Already item is present, you can not add item here");
                }
            }
        }

    }

    public Product getItem(int codeNumber) throws Exception {

        for (Shelf itemShelf : inventory) {
            if (itemShelf.code == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("item already sold out");
                } else {

                    return itemShelf.getProduct();
                }
            }
        }
        throw new Exception("Invalid Code");
    }


    public void updateSoldOutItem(int codeNumber) {
        for (Shelf itemShelf : inventory) {
            if (itemShelf.code == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }
}
