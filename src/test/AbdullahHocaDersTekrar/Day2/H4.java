package test.AbdullahHocaDersTekrar.Day2;

public class H4 {
    /*
    String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JMJ
    */
    public static void main(String[] args) {
        String strArr[]={"Kemal","Jonathan","Mark","Jackson","Ali"};
        System.out.println("İlk harfler: "+harfKontrol(strArr));
    }

    private static String harfKontrol(String[] strArr) {
        String ilkHarfler="";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].endsWith("n")||strArr[i].endsWith("k")){
                ilkHarfler+=strArr[i].charAt(0);
                System.out.println(strArr[i]);
            }
        }
        return ilkHarfler;
    }
}
