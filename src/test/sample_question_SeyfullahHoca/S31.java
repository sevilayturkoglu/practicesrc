package test.sample_question_SeyfullahHoca;

import java.util.Arrays;
import java.util.Scanner;

public class S31 {
    public static void main(String[] args) {
        /*
        Soru 31-)
Kullanıcıdan Arrayin uzunlugunu isteyin.
Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt

         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen arrayinizin uzunlugunu giriniz");
        int arrLength=sc.nextInt();
        int [] arr=new int[arrLength];
        System.out.println("Lutfen arrayinize eleman giriniz");

        for (int i = 0; i < arr.length; i++) {
            int eleman=sc.nextInt();
            arr[i]=eleman;
        }
        System.out.println(Arrays.toString(arr));
    }
}
