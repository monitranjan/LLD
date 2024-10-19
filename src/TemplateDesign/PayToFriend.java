package TemplateDesign;

public class PayToFriend extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("validate Logic of PaytoFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculating fees 0%");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit amount logic of paytofriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit the full amount");
    }
}
