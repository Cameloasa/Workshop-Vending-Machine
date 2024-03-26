package se.lexicon;

import se.lexicon.model.Drink;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Drink drink = new Drink(10,"Water","no taste", false);
        System.out.println(drink.examine());
        System.out.println(drink.use());

    }
}

