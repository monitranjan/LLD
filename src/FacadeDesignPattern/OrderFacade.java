package FacadeDesignPattern;

public class OrderFacade {
    ProductDao productDao;
    Invoice invoice;
    Payment payment;
    SendNotification notification;

    public OrderFacade() {
        productDao = new ProductDao();
        invoice = new Invoice();
        payment = new Payment();
        notification = new SendNotification();
    }

    public void createOrder(){
        Product product = productDao.getProduct(121);
        System.out.println(product.getName()+ " :" +product.getPrice());
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
    }
}
