package test.day03;

import java.util.Scanner;

public class Q2_BolmeOperatoruKullanmadanBolme {
    public static void main(String[] args) {
        /*
        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bolmek icin bir sayi giriniz");
        int bolunenSayi= sc.nextInt();
        System.out.println("Lutfen bolen sayiyi giriniz");
        int bolenSayi= sc.nextInt();

        System.out.println(bol(bolunenSayi, bolenSayi));
    }

    public static int bol(int bolunenSayi, int bolenSayi) {
        int bolum=0;
        while (bolunenSayi>bolenSayi){
            bolunenSayi-=bolenSayi;
            bolum++;

        } return bolum;
    }
}
