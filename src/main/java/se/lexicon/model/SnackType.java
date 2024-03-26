package se.lexicon.model;

public enum SnackType {

    CHIPS(15),
    POPCORN(20);

    private final double price;


    SnackType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
