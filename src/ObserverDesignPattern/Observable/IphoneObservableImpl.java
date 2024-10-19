package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.INotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements IStockObservable {
    List<INotificationObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(INotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(INotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(INotificationObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount=newStockCount;
    }
}
