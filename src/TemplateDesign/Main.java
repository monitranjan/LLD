package TemplateDesign;

public class Main {
    public static void main(String[] args) {
        PaymentFlow obj = new PayToFriend();
        obj.SendMoney();

        PaymentFlow obj1 = new PayToMerchant();
        obj1.SendMoney();

        //revision with factory
        PaymentFlow obj3 = PaymentFactory.getPayTO("Hello");
        obj3.SendMoney();
    }
}
