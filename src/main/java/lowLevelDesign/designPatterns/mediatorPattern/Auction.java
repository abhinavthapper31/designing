package lowLevelDesign.designPatterns.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

    private List<Bidder> bidders;
    private IBidder highestBidder;
    private int highestAmount;

    Auction() {
        bidders = new ArrayList<>();
        highestAmount = 0;
    }

    @Override
    public void addBidder(Bidder bidder) {
        this.bidders.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int amount) {
        System.out.println("Received bid of amount " + amount + " by bidder " + bidder.getName());

        for (Bidder b : this.bidders) {

            if (amount > highestAmount) {
                highestBidder = bidder;
                highestAmount = amount;
                if (!b.getName().equalsIgnoreCase(bidder.getName())) {
                    b.receiveBidNotification(amount);
                }
            }


        }

    }

    @Override
    public void announceWinner() {
        if (highestBidder != null) {
            // print winner
        }
    }
}
