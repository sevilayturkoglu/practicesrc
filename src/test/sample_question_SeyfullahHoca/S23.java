package test.sample_question_SeyfullahHoca;

public class S23 {
    public static void main(String[] args) {
        /*
        Soru 23-)
Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
Örnek:
Girdi: 6
Çıktı: 6!=65432*1=720
ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */
int sayi=6;
        System.out.println(factYap(sayi));
    }public static String factYap(int sayi){
        String faktoryelSonuc="";
        int faktSayi=1;
        for (int i = sayi; i >=1; i--) {
            faktSayi=faktSayi*i;
            faktoryelSonuc+=i;

        }
        faktoryelSonuc=faktoryelSonuc.substring(0,faktoryelSonuc.length()-1);
        return sayi+"!="+faktoryelSonuc+"*1="+faktSayi;

    }
}
