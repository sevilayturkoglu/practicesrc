package test.AbdullahHocaDersTekrar.Day1;

public class Soru2 {
    /*
    // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.
     */
    public static void main(String[] args) {
        for (int i = 0; i <=255; i++) {
            if(Character.isLetter(i)) {
                System.out.println((char) (i ) +"="+i);
              //  System.out.println(i);
            }
        }
    }
}
