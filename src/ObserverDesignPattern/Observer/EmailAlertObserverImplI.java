package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.IStockObservable;

public class EmailAlertObserverImplI implements INotificationObserver {
    String emailId;
    IStockObservable observable;

    public EmailAlertObserverImplI(String emailId, IStockObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendMail(emailId,"Product is in stock hurry up");
    }

    public void sendMail(String emailId, String msg){
        System.out.println("mail sent to:" + emailId);
    }
}
