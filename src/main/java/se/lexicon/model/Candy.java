package se.lexicon.model;

public final class Candy extends Product {

    private final CandyTaste taste;
    private final CandyType type;

    public Candy(double price, String productName,CandyType type,CandyTaste taste) {
        super(price, productName);
        this.type = type;
        this.taste = taste;


    }






    @Override
    public String examine() {
        return "Product name : " + getProductName() + ", Price : " + getPrice() + ",Taste :" + taste + ", Type" + type;
    }

    @Override
    public String use() {
        return "Product name : " + getProductName() + ", Price : " + getPrice();
    }
}
