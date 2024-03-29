package se.lexicon.model;

import java.util.Arrays;
import java.lang.reflect.Array;

public class VendingMachineImpl implements IVendingMachine{
    //Fields
     private Product [] products; // {watter, cola, gum,snacks}
     private int depositPool; // 0
    private static final int [] VALID_AMOUNTS = {5,10,20,50,100,500,1000};



    // constructor
    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(double amount) {
        // validate the amount that should be in the array
        // yes-> add to depositPool
        // No -< throw error with a proper message
        //boolean isValid = false;

      for(int validAmount :VALID_AMOUNTS ){
          if(validAmount == amount){
              depositPool += amount;

              break;
          }
      }

    }


    @Override
    public int getBalance() {
        return depositPool;
    }


    @Override
    public int endSession () {
        int remainingAmount = depositPool;
        depositPool = 0;
        return remainingAmount;
    }

    @Override
    public String getDescription ( int id){
        for (Product product : products){
            if (product.getId() == id){
                return product.getProductName();
            }
        }
       return null;
    }

    @Override
    public String[] Products () {
        String[] productsStr = new String[products.length]; // [null, null null]
        for (int i = 0; i < products.length; i++) {
            String productDescription = products[i].examine();
            productsStr[i] = productDescription;
        }
        return productsStr;

    }
    @Override
    public Product request(int id) {
        for (int i = 0 ; i < products.length ; i++){

            if (id == products[i].getId()){
                if (depositPool >= products[i].getPrice()) {
                    depositPool -= products[i].getPrice();
                    return products[i];
                }
            }
        }
        // iterate on the array
        // check the id to find
        // if id exist in the array of products
        // check if the product price is <= depositPool
        // count and modify the depositPool
        // return the found product


        return null;

    }

    private Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }



}



