package se.lexicon;

import se.lexicon.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Drink water = new Drink(10,"Water","no taste", false);
        Drink cola = new Drink(20,"Cola","Lemon",true);
        System.out.println(water.examine());
        System.out.println(water.use());

        Candy gum = new Candy(10,"Gum",CandyType.GUM, CandyTaste.SALTY);
        System.out.println(gum.examine());




        Snack snack = new Snack(15,"Snack",SnackType.POPCORN,"Sweet");
        System.out.println(snack.examine());
    }
}

