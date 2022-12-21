package test.AbdullahHocaDersTekrar.Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru2 {
    /*
     Soru2:

     * Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     * 1-1-2-3-5-8-13-21-34....
     */
    public static void main(String[] args) {
        int tamSayi=34;
        int sayi1=0;
        int sayi2=1;
        int sayi3=1;

        if(tamSayi>1) {
            List<Integer> fibonacci = new ArrayList<>();
            fibonacci.add(sayi1);
            fibonacci.add(sayi2);
            while (sayi3 < tamSayi) {
                sayi3 = sayi1 + sayi2;
                fibonacci.add(sayi3);
                sayi1 = sayi2;
                sayi2 = sayi3;
            }
            System.out.println(fibonacci);
        }else{
            System.out.println("verilen sayidan fibonacci dizisi yapamayiz");
        }
//HOCANIN COZUMU
 Scanner scan=new Scanner(System.in);
        System.out.println("Fibonacci serisi için eleman sayısı giriniz: ");
        int sayi= scan.nextInt();
        ArrayList<Integer> fibo=new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        int toplam=0;

        for (int i = 2; i < sayi; i++) {
        toplam=(fibo.get(fibo.size()-2)+(fibo.get(fibo.size()-1)));
        fibo.add(toplam);
        }

        System.out.println(fibo);

    }
}
