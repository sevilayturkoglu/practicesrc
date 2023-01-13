package test.BenimSoruCozumlerim;

import java.util.Scanner;

public class sif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sifreDogruMu = true;
        String ozelKarakterler = "§±@!$%^&*()_-+=?/>.<,`~#";
        int control = 0;

        do {
            control=0;
            System.out.println("Lutfen sifre giriniz");
            String sifre = sc.nextLine();

            if (sifre.length() >= 8) {
                sifreDogruMu = true;
            } else {
                sifreDogruMu = false;
                control++;
            }
            if (sifreDogruMu == false) {
                System.out.println("Sifrenizin karakter sayisi 8 den fazla olmalidir ");
            }
            for (int i = 0; i < sifre.length(); i++) {
                if (ozelKarakterler.contains(sifre.substring(i, i + 1))) {
                    sifreDogruMu = true;
                    break;
                } else {
                    sifreDogruMu = false;
                }
            }
            if (sifreDogruMu == false) {
                System.out.println("Sifre ozel karakter icermelidir");
                control++;

            }
            for (int i = 0; i < sifre.length(); i++) {
                if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                    sifreDogruMu = true;
                    break;
                } else {
                    sifreDogruMu = false;
                }
            }
            if (sifreDogruMu == false) {
                System.out.println("Sifre buyuk harf icermelidir");
                control++;

            }
            for (int i = 0; i < sifre.length(); i++) {
                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                    sifreDogruMu = true;
                    break;
                } else {
                    sifreDogruMu = false;

                }
            }
            if (sifreDogruMu == false) {
                System.out.println("Sifre kucuk harf icermelidir");
                control++;

            }
            if (control==0) {
                System.out.println("sifreniz basariyla kaydedildi");

            }
        } while (control!=0) ;



    }
}
