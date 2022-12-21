package test.AbdullahHocaDersTekrar.Day1;

public class Soru3 {
    public static void main(String[] args) {
        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın

         * Bugün hava oldukca güzel.-> 2
         */
        String str = "Bugün hava oldukca güzel".toUpperCase();
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("A")) {
                count++;
            } if (str.substring(i, i + 1).equalsIgnoreCase("C")) {
                break;
            }

        }System.out.println(count);
    }
}