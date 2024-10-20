package MediatorDesignPattern;
import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
public class Auction implements IAuctionMediator {
    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for (Colleague colleague : colleagues) {
            if (!colleague.getName().equals(bidder.getName())) {
                colleague.receiveBidNotification(bidAmount);
            }
        }
    }
}
