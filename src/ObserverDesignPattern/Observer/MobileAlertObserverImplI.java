package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.IStockObservable;

public class MobileAlertObserverImplI implements INotificationObserver {
    String userName;
    IStockObservable observable;

    public MobileAlertObserverImplI(String emailId, IStockObservable observable){
        this.observable = observable;
        this.userName = emailId;
    }

    @Override
    public void update() {
        sendNotificationOnMobile(userName,"Product is in stock hurry up");
    }

    public void sendNotificationOnMobile(String userName, String msg){
        System.out.println("Notification sent to:" + userName);
    }
}
