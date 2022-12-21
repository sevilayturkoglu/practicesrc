package test.day03;

public class Q3 {
    public static void main(String[] args) {
        /*
         * Ask the user for a String and a sentence
         * Find and print occurrence of String in sentence.
         * (without case sensitivity)
         *
         * sentence ="hihihi" String="hi" output="There are 3 "hi"s in hihihi "
         * sentence ="I am coming" String="com" output ="there is 1 "com" in sentence "
         *
         *//*
         * Kullanicidan bir kelime ve cumle aliniz
         * Kelimeyi cumle icinde aratip yazdiriniz
         *
         * Orn : Cumle = "hihihi" String = "hi" output = "hihihi" ' nin icinde 3 tane "hi" var
         * Orn : Cumle = "Yoldayim" String = "yol" output = "Yoldayim" in icinde 1 tane "yol" var
         */
        String cumle = "javak Javak";
        String part = "Java";
        int partL=part.length();

        int count = 0;

        for (int i = 0; i <=cumle.length()-partL ; i++) {
            if (cumle.substring(i, i + partL).equalsIgnoreCase(part)) {

                count++;
            }
        }
        System.out.println(cumle+" nin icinde "+count+" tane "+part+"  var");
        }
    }
