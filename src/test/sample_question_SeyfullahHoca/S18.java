package test.sample_question_SeyfullahHoca;

import java.util.Scanner;

public class S18 {
    public static void main(String[] args) {
    /*
    Soru 18-) Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım. Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
İpucu:
yol=Hız*zaman
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen saatteki hizinizi giriniz");
        int hiz = sc.nextInt();
        System.out.println("Lutfen kac km yol gideceginizi giriniz");
        int km=sc.nextInt();
        neZamanGelirim(hiz,km);
    } public static void neZamanGelirim( double hiz,double km){
        double zaman=1;
        zaman= km/hiz;
        int saat=(int)zaman;
        double dakika=1;
        dakika=zaman*60;
        dakika=dakika%60;

        System.out.println(saat + " saat  "+dakika+"  dakika" +" sonra gideceginiz yere varmis olacaksiniz");



    }

}
