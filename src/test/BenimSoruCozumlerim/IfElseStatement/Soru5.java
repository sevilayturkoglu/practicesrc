package test.BenimSoruCozumlerim.IfElseStatement;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
olarak yazdirin, yoksa girilen harfi yazdirin
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir harf  giriniz");
        char harf = sc.next().charAt(0);
       /* if(harf>=97&&harf<=122){
            System.out.println("Karakterinizin buyuk harfi= " + (char)(harf - 32));
        }else{
            System.out.println("Girilen karakter = " + harf);
            }
            */

        //Alternatif cozum:
        if (harf >= 'a' && harf <= 'z') {
          System.out.println("Karakterinizin buyuk harfi= "+(char)(harf-32));
            System.out.println(Character.toUpperCase(harf));
        } else {
            System.out.println("Girilen karakter*=" +harf);
        }
        /*
        Altervatif cozum:
         Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf =scan.next().toUpperCase().charAt(0);
        if (harf =='a'&& harf=='z'){
            System.out.println(harf);
        }else {
            System.out.println(harf);
        }
        System.out.println(Character.toLowerCase(harf));
         */
    }

}