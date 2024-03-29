package se.lexicon;

import se.lexicon.model.*;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Drink water = new Drink(10, "Water", "no taste", false);
        Drink cola = new Drink(20, "Cola", "Lemon", true);

        Candy gum = new Candy(10, "Gum", CandyType.GUM, CandyTaste.SALTY);

        Snack snack = new Snack(15, "Snack", SnackType.POPCORN, "Sweet");



        Product [] products = {water,cola,gum,snack};

        VendingMachineImpl vendingMachine = new VendingMachineImpl(products);
        vendingMachine.addCurrency(10);
        System.out.println(vendingMachine.getBalance()); // 10
        vendingMachine.addCurrency(5);
        System.out.println(vendingMachine.getBalance()); // 15

        vendingMachine.request(3);
        System.out.println(vendingMachine.getDescription(1));


        vendingMachine.request(1);
        System.out.println(vendingMachine.getBalance());

        System.out.println(vendingMachine.getDescription(1));
        // call request method 4

    }

}

