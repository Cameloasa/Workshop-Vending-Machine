package se.lexicon.model;

public final class Snack extends Product{

    private SnackType type; // popcorn
    String taste;

    public Snack(double price, String productName, SnackType type, String taste) {
        super(type.getPrice(), productName);
        this.type = type;
        this.taste = taste;
    }

    public Snack(double price, String productName, String taste) {
        super(price, productName);
        this.taste = taste;
    }

    @Override
    public String examine() {
        return "Product :" + getProductName() + "Price ;" + getPrice() +" +, Taste: " + taste + " , Type: " + type;
    }

    @Override
    public String use() {
        return "Product :" + getProductName() + ",Price ;" + getPrice() ;
    }
}
