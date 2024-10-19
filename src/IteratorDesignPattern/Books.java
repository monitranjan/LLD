package IteratorDesignPattern;

public class Books {
    private int price;
    private String bookName;

    public Books(int price, String bookName) {
        this.price = price;
        this.bookName = bookName;
    }

    private void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
