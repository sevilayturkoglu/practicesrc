package test.BenimSoruCozumlerim.IfElseIfStatement;

import java.util.Scanner;

public class IntervievSorusu {
    public static void main(String[] args) {
        /*
        Soru ) Interview Question
Kullanicidan artik yil olup olmadigini kontrol
etmek icin yil girmesini isteyin.
Kural 1: 4 ile bolunemeyen yillar artik yil
degildir
Kural 2: 4 ile bolunup 100 ile bolunemeyen
yillar artik yildir
Kural 3: 4’un kati olmasina ragmen 100 ile
bolunebilen yillardan sadece
400’un kati olan yillar artik yildir
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen artik yil olup olmadigini anlamak uzere bir yil giriniz");
        int yil = sc.nextInt();


        //1.yol:
     if (yil % 4 == 0 && yil%100==0 && yil%400==0 ) {
            System.out.println("Artik yil");
        } else if (yil % 4 == 0 && yil%100!=0) {
            System.out.println("Artik yil");
        }else{
            System.out.println("Artik yil degil");
        }

        //2.yol:
       if ((yil % 4 == 0 && yil%100!=0 )|| yil%400==0){
            System.out.println("Artik yil");
        }else{
            System.out.println("Artik yil degil");
        }

        //3.yol:
  /* boolean artikMi=true;
        System.out.println(artikMi);
   if(yil%4==0){
       if(yil%100==0){
           if(yil%400==0){
               artikMi=true;
           }else{
               artikMi=false;
           }
       }else {
           artikMi=true;
       }
   }else{
       artikMi=false;
   }if(artikMi==true){
            System.out.println(artikMi);
            System.out.println("Artik yil");
        }else{
            System.out.println(artikMi);
            System.out.println("Artik yil degil");
        }*/
        if (yil % 4 == 0 || yil % 400 == 0) {
            if ((yil % 4 == 0 && yil % 100 != 0)||yil % 400 == 0) {
                System.out.println("Artik yil");
            }else {
                System.out.println("Artik yil degil");
            }
        } else {
            System.out.println("Artik yil degil");
        }

    }

}
