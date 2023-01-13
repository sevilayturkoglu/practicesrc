package test.day08;

import java.util.Scanner;

public class Q01_Ebob_Ekok {
    public static void main(String[] args) {
// Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
        // Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen ebob ve ekokunu bulmak uzere aralarinda enter a basarak iki sayi giriniz");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();
        int kucuksayi = 0;
        int buyuksayi=0;
        int ekok = 1;
        int ebob = 0;
        int count = 0;
        if (sayi1 > sayi2) {
            kucuksayi = sayi2;
            buyuksayi=sayi1;
        } else {
            kucuksayi = sayi1;
            buyuksayi=sayi2;
        }
        for (int i = 2; i <= kucuksayi; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("sayilarin ebobu yoktur");
        }
        System.out.println(ebob);
        for (int i =buyuksayi ; i <=sayi1*sayi2 ; i+=buyuksayi) {
           if(i%kucuksayi==0) {
              ekok=i;
              break;
           }
        }
        System.out.println(ekok);
    }
}