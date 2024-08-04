package lowLevelDesign.designPatterns.mediatorPattern;

public class Bidder implements IBidder {

    String name;

    void Bidder(String name) {
        this.name = name;
    }

    @Override
    public void placeBid(int amount) {

    }

    @Override
    public void receiveBidNotification(int amount) {
        System.out.println("Got notified for a new bid ! Amount is " + amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
