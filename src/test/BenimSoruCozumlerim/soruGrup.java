package test.BenimSoruCozumlerim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soruGrup {
    public static void main(String[] args) {

        //   Write a method that
        //   returns the index of the first occurrence of given integer in a list.
        // Assume that the index of the first element in the list is zero.
        // If the number does not exist return -1.
        int n = 5;
        int[] arr = {2, 3, 5, 6, 7, 5, 8,5};
        System.out.println(list( arr,n));
    }
    public static List<Integer> list( int arr[],int n) {
        int index=0;
        List<Integer> sayi=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]==(n)) {
                sayi.add(i);
            }
        }
        return sayi;
    }

}






















