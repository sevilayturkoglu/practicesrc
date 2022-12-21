package test.sample_question_SeyfullahHoca;

public class S28 {
    public static void main(String[] args) {
        /*
        Soru-28)
Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
Örnek:
      Sayı: 1238
      Sayının Tersi: 8321
İpucu:  Loop kullanabilirsiniz.
         */
        int sayi=1238;
        String sayi1=String.valueOf(sayi);
        String ters="";
        for (int i = sayi1.length()-1; i >=0; i--) {
            ters+=sayi1.substring(i,i+1);

        }
        sayi=Integer.parseInt(ters);
        System.out.println(sayi);
    }
}
