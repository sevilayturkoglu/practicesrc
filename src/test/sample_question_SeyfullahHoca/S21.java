package test.sample_question_SeyfullahHoca;

public class S21 {
    public static void main(String[] args) {
        /*
        Soru 21-)
Bir aydaki gün sayısını bulmak için bir Java programı yazın
(Mülakat Sorusu / Interview Sorusu / Leak Year)

Örnek:
Bir ay numarası girin: 2
Bir yıl girin: 2016

Şubat 2016'da 29 gün vardır
ipucu:
Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
         */
        int ay=2;
        int yil = 2001;
        int kacGun=0;

switch (ay){
    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        kacGun=31;
        break;
    case 4: case 6: case 9: case 11:
        kacGun=30;
        break;
    case 2:
        if(artikMi(yil).equals("Artik yil")){
            kacGun=29;
        }else{
            kacGun=28;
        }
        break;
}
        System.out.println(yil+" yilinda "+ay+". ay "+kacGun+" gun surmektedir");

    }public static String artikMi(int yil){
        String sonuc="";
    if ((yil % 4 == 0 && yil%100!=0 )|| yil%400==0){
           sonuc= "Artik yil";
        }else{
        sonuc="Artik yil degil";
        }
    return sonuc;
    }
}
