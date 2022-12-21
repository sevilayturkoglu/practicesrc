package test.sample_question_SeyfullahHoca;

import java.util.Scanner;

public class S22 {
    public static void main(String[] args) {
        /*
       Soru 22-) Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
Giriş :
30 ve 40

Beklenen Çıktı:
30 ve 40 için EBOB= 10
30 ve 40 için EKOK= 120
ipucu:
Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen ebob ve ekokunu hesaplamak uzere iki sayi giriniz");
        int sayi1=sc.nextInt();
        int sayi2=sc.nextInt();
        int ebob=1;
        int ekok=1;
        int kucukSayi=1;
        if(sayi1<sayi2){
            kucukSayi=sayi1;
        }else {
            kucukSayi=sayi2;
        }
        for (int i = 2; i <=kucukSayi ; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("sayilarin ebobu = " + ebob + " sayilarin ekoku = "+ekok);
    }
}
