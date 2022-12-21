package test.sample_question_SeyfullahHoca;

import java.util.Scanner;

public class S16 {
    public static void main(String[] args) {
        /*
        Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
                  Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
                  Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                               Loopun içerisinde StringM methodlarından  yararlanalım!
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz ");
       // String word = scan.nextLine();
        String newWord = "";
        boolean ok=true;

        while (ok){
            String word = scan.nextLine();
            if(word.length()>=5){
                newWord+=word.substring(word.length()-3).repeat(2);
                System.out.println(newWord);
               ok=false;
            }else{
                System.out.println("Girdiginiz kelimenin karakter uzunlugu "+ word.length()+" tur. Lutfen en az 5 harfli yeni kelime giriniz");
            }
        }
    }
}