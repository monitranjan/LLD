package MediatorDesignPattern;

public class AuctionClient {
    public static void main(String[] args) {
        // Create the mediator
        IAuctionMediator auctionMediator = new Auction();

        // Create some bidders and register them with the auction mediator
        Colleague bidder1 = new Bidder("Bidder1", auctionMediator);
        Colleague bidder2 = new Bidder("Bidder2", auctionMediator);
        Colleague bidder3 = new Bidder("Bidder3", auctionMediator);

        // Start the bidding process
        System.out.println("Bidder1 places a bid of 100");
        bidder1.placeBid(100);

        System.out.println("\nBidder2 places a bid of 150");
        bidder2.placeBid(150);

        System.out.println("\nBidder3 places a bid of 120");
        bidder3.placeBid(120);
    }
}
