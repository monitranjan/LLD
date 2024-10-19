package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.INotificationObserver;

public interface IStockObservable {
    public void add(INotificationObserver observer);
    public void remove(INotificationObserver observer);
    public void notifySubscribers();
    public int getStockCount();
    public void setStockCount(int i);
}
