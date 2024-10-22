package FacadeDesignPattern;

public class Product{
    String name;
    int productId;
    int price;

    public Product(String name, int price, int ProductId) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
