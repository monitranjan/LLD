package StateDesignPattern;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(20);
    public int value;
    Coin(int value){
        this.value = value;
    }
}
