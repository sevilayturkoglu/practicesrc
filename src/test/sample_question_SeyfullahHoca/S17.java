package test.sample_question_SeyfullahHoca;

import java.util.Scanner;

public class S17 {
    public static void main(String[] args) {
        /*
         Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
Örnek:
char ch1='a'
String name = "Ali bakkala geç gitti."
Beklenen Çıktı= a sayısı = 3
Ipucu:
Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz! Sayac adlı bir int variable oluşturarak
bunun ile kelimenin kaç defa geçtiginiLoop içindeki İf ile bulabilirsiniz!
         */
       Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = sc.next().toUpperCase();
        System.out.println("Lutfen bir karakter");

        char karakter = sc.next().toUpperCase().charAt(0);
         int count=0;
        for (int i = 0; i <isim.length() ; i++) {
            if(isim.charAt(i)==karakter){
               count++;

            }
        }
        System.out.println("Karakterimiz kelimenin icinde " + count + " kez gecmektedir");

    }
}