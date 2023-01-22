package test.day09;

import java.util.ArrayList;
import java.util.List;

public class silfibo {
    public static void main(String[] args) {
        String str="1-48 of 124523 results for nutella";
        int indexOf=str.indexOf("of");
        int indexResult=str.indexOf("result");
        System.out.println("indexResult = " + indexResult);
        System.out.println("indexOf = " + indexOf);
       int sayi=Integer.parseInt(str.substring(indexOf+3,indexResult-1));
        System.out.println("sayi = " + sayi);

    }
    }