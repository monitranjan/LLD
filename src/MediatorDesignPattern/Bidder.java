package MediatorDesignPattern;

// Concrete Colleague
public class Bidder implements Colleague {
    String name;
    IAuctionMediator auctionMediator;

    public Bidder(String name, IAuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this); // Register this bidder to the mediator
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount); // Inform the mediator about the bid
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder: " + name + " got the notification that someone has put a bid of: " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}

