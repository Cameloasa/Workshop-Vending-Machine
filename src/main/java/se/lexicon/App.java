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

        Drink water = new Drink(10, "Water", "Lemonade", false);
        Drink cola = new Drink(15, "Cola", "Cola", true);

        Candy gum = new Candy(20, "Gum", CandyType.GUM, CandyTaste.SALTY);
        Candy chocolate = new Candy(25,"Candy bar", CandyType.CHOCOLATE,CandyTaste.STRAWBERRY);

        Snack popcorn = new Snack(30, "Snack", SnackType.POPCORN, "Chilly");
        Snack chips = new Snack(35,"Chips",SnackType.CHIPS,"Sour");


        Product [] products = {
                water,
                cola,
                gum,
                chocolate,
                popcorn,
                chips};

        VendingMachineImpl vendingMachine = new VendingMachineImpl(products);
        vendingMachine.addCurrency(10);
        System.out.println(vendingMachine.getBalance()); // 10
        vendingMachine.addCurrency(5);
        System.out.println(vendingMachine.getBalance()); // 15

        System.out.println(Arrays.toString(vendingMachine.Products()));

        System.out.println(vendingMachine.getBalance());
        System.out.println(Arrays.toString(vendingMachine.Products()));
        System.out.println(vendingMachine.getDescription(1));

    }

}

