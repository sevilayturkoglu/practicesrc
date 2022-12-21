package test.sample_question_SeyfullahHoca;

import java.util.Arrays;
import java.util.Scanner;

public class S32 {
    /*
    Soru=32
Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin..
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen arrayinizin uzunlugunu giriniz");
        int arrLength=sc.nextInt();
        int [] reverse=new int[arrLength];
        System.out.println("Lutfen arrayinize eleman giriniz");

        for (int i = 0; i < reverse.length; i++) {
            int eleman=sc.nextInt();
            reverse[(arrLength-i)-1]=eleman;
        }

        System.out.println(Arrays.toString(reverse));
    }
}
