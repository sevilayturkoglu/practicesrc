package test.day05;

import java.util.Arrays;

public class Q3_KelimeyiHarflerineAyir {
    public static void main(String[] args) {
        /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.
         toCharArray() methodunu kullanmayiniz!
         * Input : John
         * Output : [J, o, h, n]
         */

        String name="Jhon";

        kelimeninHarfleriniAyirma(name);

    }

    public static void kelimeninHarfleriniAyirma(String name) {
char[] harfler=new char[name.length()];


        for (int n = 0; n < name.length(); n++) {
            harfler[n]=name.charAt(n);
            System.out.print(harfler[n]+" ");
        }
        System.out.println(Arrays.toString(harfler));
    }
}
