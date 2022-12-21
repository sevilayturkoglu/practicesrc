package test.AbdullahHocaDersTekrar.Day2;

import java.util.Scanner;

public class H1 {
    //Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan metodu yazınız
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cümle giriniz: ");
        String cumle=scan.nextLine();//1l2ı3g5f

        System.out.println("Sayısal değerler toplamı: "+sayisalIfadeleriTopla(cumle));
    }

    private static int sayisalIfadeleriTopla(String cumle) {
        int toplam=0;
        String cumleArr[]=cumle.split("");//1-j-2-ı-3-5-f
        /*
        for (String each:cumleArr) {
            if (Character.isDigit(each.charAt(0))) {
                toplam+=Integer.valueOf(each);
            }
        }

         */
        for (int i = 0; i < cumleArr.length; i++) {
            if (Character.isDigit(cumleArr[i].charAt(0))){// char veri tipinin Wrapper Class larda tanımlanması Character
                toplam+=Integer.parseInt(cumleArr[i]);
            }
        }
        return toplam;
    }
}
