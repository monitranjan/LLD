package FacadeDesignPattern;

public class ProductDao {
    public Product getProduct(int productId){
        return new Product("Pepsi",10,123);
    }
}
