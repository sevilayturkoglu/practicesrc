package test.AbdullahHocaDersTekrar.Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru3 {
    /*
     Soru3:
//Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
//Örnek: 12 = 1 1 0 0

     */
    public static void main(String[] args) {
        int sayi=6;
        int decimal=6;
        String str="";

        while (decimal>=1){
       str+=decimal%2;
       decimal=decimal/2;
       }

       String binary="";

        for (int i = str.length()-1; i >=0; i--) {
            binary+= str.substring(i,i+1);
        }
        System.out.println(sayi+"  sayisinin binary degeri = " +binary);
        //HOCANIN COZUMU
         System.out.println("Binary ifadeye çevirilecek desimal değeri giriniz: ");
        Scanner scan=new Scanner(System.in);
        int desimalSayi= scan.nextInt();
        System.out.println(desimalSayi+" sayısının binary karşılığı: "+binaryCevir(desimalSayi));
    }

    private static ArrayList binaryCevir(int desimalSayi) {
        ArrayList<Integer> binary=new ArrayList<>();
        while (desimalSayi>=1){
            binary.add(desimalSayi%2);//0,1,1
            desimalSayi/=2;
        }
        //Collections.reverse(binary);
        ArrayList<Integer> binaryTers=new ArrayList<>();
        for (int i = binary.size()-1; i>=0; i--) {
            binaryTers.add(binary.get(i));
        }
        return binaryTers;// 1, 1, 0

    }

}
