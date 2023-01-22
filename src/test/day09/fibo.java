package test.day09;

import java.util.ArrayList;
import java.util.List;

public class fibo {
 static int y;
  static int x;
    public static void main(String[] args) {
        int sayi = 44;

        if (fiboHesap(sayi)) System.out.println("Fibonacci series contain your number : " + sayi );
        else System.out.println("Fibonacci series contain that numbers : " + x + " and " + y);
    }
    public static boolean fiboHesap(int sayi) {

        List<Integer> fiboList = new ArrayList<>();
        fiboList.add(0);
        fiboList.add(1);

        for (int i = 2; i < sayi; i++) {
            fiboList.add(fiboList.get(i - 1) + fiboList.get(i - 2));
            if (fiboList.get(i) >= sayi) {
                break;
            }
        }
        System.out.println(fiboList);

        if(fiboList.get((fiboList.size()-1))==sayi){

            return true;
        }
         y=fiboList.get(fiboList.size()-1);
         x=fiboList.get(fiboList.size()-2);


        return false;
    }

}