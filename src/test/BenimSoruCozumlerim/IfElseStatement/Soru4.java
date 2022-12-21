package test.BenimSoruCozumlerim.IfElseStatement;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        /*
        - Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
olup olmadigini yazdirin
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir karakter  giriniz");
        char harfi= sc.next().charAt(0);
/*if(character>=65&& character<=90){
    System.out.println("Girdiginiz karakter buyuuk harftir");
}else{
    System.out.println("Girilen karakter buyuk harf degildir");
}
    */
    //Alternatif cozum:
    if (harfi >= 'A' && harfi <= 'Z') {
            System.out.println("buyuk harf");
        }
      else {
            System.out.println("Buyuk harf degil");
        }

}
}