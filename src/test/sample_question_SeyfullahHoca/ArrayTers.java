package test.sample_question_SeyfullahHoca;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTers {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("arrayin uzunlugunu giriniz");
        int uzunluk= scan.nextInt();
        Integer[] arr= new Integer[uzunluk];
        Integer [] reverse = new Integer[uzunluk];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("eleman giriniz ");
            int eleman= scan.nextInt();
            arr[i]=eleman;
           reverse[reverse.length-i-1]= arr[i];
        }

        System.out.println(Arrays.toString(reverse));


    }
}