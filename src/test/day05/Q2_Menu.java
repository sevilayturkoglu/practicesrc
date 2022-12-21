package test.day05;

import java.util.Arrays;

public class Q2_Menu {
    public static void main(String[] args) {
        // create 2D array of food:
        // print all the foods sorted
        // american
        //----------
        // italian
        //----------
        // asian
        //----------
        // afghani
        //----------
        // indian

        String[][] food = {{"steak", "hot dog", "cheeseburger"},
                {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"},
                {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};

        String[] ulkeler = {"America", "Italia", "Asia", "Afghani", "Indian"};

        for (String[] ulkeyemekleri:food) {
            for (String yemekler:ulkeyemekleri) {
                System.out.println(yemekler);
            }
            System.out.println("****************************");
        }

        //fori ile
        for (int i = 0; i < food.length ; i++) {
            System.out.println("*********"+ulkeler[i]+"************");

        for (int j = 0; j< food[i].length; j++) {
           System.out.println(food[i][j]);
        }

        }
    }
}