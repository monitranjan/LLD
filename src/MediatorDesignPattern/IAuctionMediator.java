package MediatorDesignPattern;

// Mediator Interface
public interface IAuctionMediator {
    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, int bidAmount);
}
