// revision perspective with factory
package TemplateDesign;

public class PaymentFactory {
    public static PaymentFlow getPayTO(String PayTo){
        return switch (PayTo) {
            case "friend" -> new PayToFriend();
            case "merchant" -> new PayToMerchant();
            default -> {
                System.out.println("Please select a payment type");
                yield null;
            }
        };
    }
}
