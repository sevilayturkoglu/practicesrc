package test.BenimSoruCozumlerim.IfElseStatement;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
kucukse “Maalesef kaldin” yazdirin.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not= sc.nextInt();
        if(not>=50){
            System.out.println("Tebrikler sinifi gectiniz");
        }else{
            System.out.println("Maalesef sinifta kaldin");
        }
    }
}
