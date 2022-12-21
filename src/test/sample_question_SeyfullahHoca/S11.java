package test.sample_question_SeyfullahHoca;

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        /*
        Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır
                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
	Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
Giriş :
		 > Gandalf Grey 563245879632
Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632 (edited)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen aralarinda entera basarak adinizi soyadinizi ve kredi karti numaranizi giriniz");
        String isim = sc.next();
        String soyIsim = sc.next();
        String kartNu = sc.next();



        if(kartNu.length()==16) {
            System.out.println("İsim : "+isim.toUpperCase().substring(0, 1) + isim.substring(1).replaceAll("\\w", "*") +
                    " "+soyIsim.toUpperCase().substring(0, 1) + soyIsim.substring(1).replaceAll("\\w", "*")+"\n"+"CCN :  "+
                    kartNu.replace(kartNu.substring(0,12),("**** **** ")));

        }else{
            System.out.println("Geçersiz kredi kartı numarası");
        }
    }
}
