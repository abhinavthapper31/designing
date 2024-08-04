package lowLevelDesign.designPatterns.mediatorPattern;

public interface IBidder {

    void placeBid(int amount);

    void receiveBidNotification(int amount);
}
