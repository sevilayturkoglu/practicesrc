package test.BenimSoruCozumlerim.IfElseStatement;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen yasiniz giriniz");
        int yas= sc.nextInt();

        if(yas>=65){
            System.out.println("Emekli olabilirsiniz");
        }else{
            System.out.println("Emekli olmak icin " + (65 - yas) + " yil daha calismalisiniz");
        }
    }
}
