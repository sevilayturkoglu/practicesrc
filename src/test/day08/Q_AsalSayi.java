package test.day08;

import java.util.ArrayList;
import java.util.List;

public class Q_AsalSayi {
    public static void main(String[] args) {
        /*
         * Write a program that accepts an integer as input and prints first 10 prime
         * numbers greater than input
         *
         * Check numbers if they are even or not in a return method
         */
        int input=5;
        int count=0;
        List<Integer> first10Primes=new ArrayList<>();
        isPrime(input);
        while (count<10){
            if (isPrime(input)) {
                first10Primes.add(input);
                count++;
            }
            input++;
        }
        System.out.println(first10Primes);
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }return true;
    }
}
