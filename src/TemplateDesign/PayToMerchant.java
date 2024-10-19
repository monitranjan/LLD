package TemplateDesign;

public class PayToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("validating request pay to merchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("charging fees 10%");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit amount logic");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit remaining amount");
    }
}
