package MediatorDesignPattern;

// Colleague Interface
public interface Colleague {
    void placeBid(int bidAmount);
    void receiveBidNotification(int bidAmount);
    String getName();
}
