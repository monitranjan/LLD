package StateDesignPattern;

public class Item {
    ItemType product;
    int price;

    public ItemType getProduct() {
        return product;
    }

    public void setProduct(ItemType product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
