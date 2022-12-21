package test.sample_question_SeyfullahHoca;

public class S26 {
    public static void main(String[] args) {
        /*
        Soru 26-)
Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
Örnek:
Giriş :6
Çıkış: 6 Mükemmel Sayıdır
Giriş :7
Çıkış:7 Mükemmel Sayı Değildir
ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz :wink:

         */
        int mukemmelMi=24;
        int top=0;
        for (int i = 1; i <mukemmelMi ; i++) {
            if(mukemmelMi%i==0){
                top+=i;
            }

        }if(top==mukemmelMi){
            System.out.println("Mukemmel sayi");
        }else {
            System.out.println("mukemmel degil");
        }
    }
}
