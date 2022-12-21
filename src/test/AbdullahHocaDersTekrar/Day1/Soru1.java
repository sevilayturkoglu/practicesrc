package test.AbdullahHocaDersTekrar.Day1;

public class Soru1 {
    /*
    100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).
     */
    public static void main(String[] args) {
        int top=0;
        for (int i = 100; i >0 ; i--) {
            if(i%13==0){
                System.out.println(i+"  sayisi 13 e tam bolunur");
                top+=i;
            }
        }System.out.println("top = " + top);
    }
}
