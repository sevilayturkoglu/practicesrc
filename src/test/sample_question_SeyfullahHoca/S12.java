package test.sample_question_SeyfullahHoca;

public class S12 {
    public static void main(String[] args) {
        /*
        Soru 12-)
Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

Ipucu:  IF/Else kullanabilirsiniz.
Örnek:
İki tamsayı girin:
25  veya  4567986321453
46   veya 123456
Konsolda Çıktı :
Sayıların toplamı: 71  veya  Fazla Yüklenme (edited)
         */
        long birinciSayi = 1000000L;
        long ikinciSayi = 1453525;
        long ucuncuSayi1 = birinciSayi + ikinciSayi;
        long ucuncuSayi=birinciSayi+ikinciSayi;
        int basamakSayiBirinci = 0;
        int basamakSayiIkinci = 0;
        int basamakSayiUcuncu = 0;

        while (birinciSayi >0) {
            birinciSayi = birinciSayi / 10;
            basamakSayiBirinci++;
        }
        while (ikinciSayi > 0){
            ikinciSayi = ikinciSayi / 10;
        basamakSayiIkinci++;

      }while(ucuncuSayi>0){
           ucuncuSayi=ucuncuSayi/10;
           basamakSayiUcuncu++;
        }

        if(basamakSayiBirinci>10||basamakSayiIkinci>10||basamakSayiUcuncu>10){
            System.out.println("sayilarin toplami = " + ucuncuSayi1 + " fazla yukleme yaptiniz");
        }else{
            System.out.println("sayilarin toplami = " + ucuncuSayi1 );
        }

        System.out.println(basamakSayiUcuncu + " " + basamakSayiBirinci+" "+basamakSayiIkinci);
    }
}
