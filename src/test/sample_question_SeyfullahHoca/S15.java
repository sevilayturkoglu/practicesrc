package test.sample_question_SeyfullahHoca;

import java.util.Scanner;

public class S15 {
    public static void main(String[] args) {
        /*
        15-Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
-> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
-> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
Örn:
	 isim1= masa
         isim2= ali
	 Konsol => maalisa
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim1=sc.next();
        sc.nextLine();
        System.out.println("Lutfen bir isim daha giriniz");
        String isim2=sc.next();

       if(isim1.length()%2==0){
           //substringle yapilis:
            System.out.println(isim1.substring(0, isim1.length() / 2) + isim2 + isim1.substring(isim1.length() / 2));
            //replace ile yapilis
            System.out.println(isim1.replace(isim1.substring(isim1.length() / 2), isim2) + isim1.substring(isim1.length() / 2));
       }else{
            System.out.println("isim2 isim1 e eklenemez");
       }

    }
}
