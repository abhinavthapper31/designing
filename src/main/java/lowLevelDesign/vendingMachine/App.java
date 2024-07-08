package lowLevelDesign.vendingMachine;

public class App {

    /*
     *
     * STATE DESIGN PATTERN : TC + Vending + ATM
     *
     * Products(code and price)
     * Rows (With products) / Shelf
     * keypad
     * buttons (Insert cash button(coins)), Select product button (select prod code)
     * Function depends on state
     * Machine States :
     *
     *
     *
     * */
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(getInitialInventory());
        displayInventory( machine);




    }

    private static Inventory getInitialInventory() {
        Inventory inventory = new Inventory(10);
        Shelf[] shelfs = inventory.getInventory();
        for (int i = 0; i < shelfs.length; i++) {
            Product product = new Product();
            if (i >= 0 && i < 3) {
                product.setProduct(ItemType.COKE);
                product.setPrice(12);
            } else if (i >= 3 && i < 5) {
                product.setProduct(ItemType.PEPSI);
                product.setPrice(9);
            } else if (i >= 5 && i < 7) {
                product.setProduct(ItemType.LAYS);
                product.setPrice(13);
            } else if (i >= 7 && i < 10) {
                product.setProduct(ItemType.SODA);
                product.setPrice(7);
            }
            shelfs[i].setProduct(product);
            shelfs[i].setSoldOut(false);
        }

        return inventory;
    }


    private static void displayInventory(VendingMachine vendingMachine){

        Shelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            System.out.println(slots[i]);
        }
    }

}
