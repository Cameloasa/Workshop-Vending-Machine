package se.lexicon.model;

public class VendingMachine implements IVendingMachine{


    @Override
    public void addCurrency(double amount) {
        
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public int request(int id) {
        return 0;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int id) {
        return null;
    }

    @Override
    public String[] Products() {
        return new String[0];
    }
}
