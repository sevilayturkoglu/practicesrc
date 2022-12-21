package test.sample_question_SeyfullahHoca;

import java.util.Arrays;

public class S33 {
    public static void main(String[] args) {
        /*
       Soru =33
        Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
Örnek:
String str=''Kodlama harika.''
String arr[]: ".etaerg si gnidoC"
İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın

         */
       String str="Kodlama harika";
        String[]ters=new String[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            ters[(str.length()-1)-i]=str.substring(i,i+1);
        }
        System.out.println(Arrays.toString(ters));


        String str1 = "Kodlama harika.";
        String[] arr = str1.split("");
        String[] tersArr = new String[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            tersArr[i] = arr[arr.length-i-1];
        } System.out.println(Arrays.toString(tersArr));


    }
}