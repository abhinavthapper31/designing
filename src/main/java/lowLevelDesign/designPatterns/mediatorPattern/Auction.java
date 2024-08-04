package lowLevelDesign.designPatterns.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

    private List<Bidder> bidders;

    Auction() {
        bidders = new ArrayList<>();
    }

    @Override
    public void addBidder(Bidder bidder) {
        this.bidders.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int amount) {
        System.out.println("Received bid of amount " + amount + " by bidder " + bidder.getName());

        for (Bidder b : this.bidders) {
            if (!b.name.equalsIgnoreCase(bidder.getName())) {
                b.receiveBidNotification(amount);
            }
        }

    }
}
