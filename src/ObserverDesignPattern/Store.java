package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.IStockObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImplI;
import ObserverDesignPattern.Observer.MobileAlertObserverImplI;
import ObserverDesignPattern.Observer.INotificationObserver;

public class Store {
    public static void main(String[] args) {
        IStockObservable iphoneStockObservable = new IphoneObservableImpl();
        INotificationObserver observer1 = new EmailAlertObserverImplI("monit@gmail.com",iphoneStockObservable);
        INotificationObserver observer2 = new EmailAlertObserverImplI("monitranjan@gmail.com", iphoneStockObservable);
        INotificationObserver observer3 = new MobileAlertObserverImplI("monitranjan", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);
    }
}
