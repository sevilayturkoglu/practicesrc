package test.BenimSoruCozumlerim.IfElseStatement;

import java.util.Scanner;

public class Soru1_EskenarUcgen {
    public static void main(String[] args) {
         /*
        Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir ucgen olusturmak uzere uc tane kenar uzunlugu giriniz");
        int bk= sc.nextInt();
        int ik= sc.nextInt();
        int uk= sc.nextInt();
        if(bk<=0||ik<=0||uk<=0){
            System.out.println("Boyle bir uzunluktan ucgen olusturulamaz");
            return;
        }if(bk==ik && ik==uk){
            System.out.println("Eskenar ucgen");
        }else{
            System.out.println("Eskenar ucgen degil");
        }
    }
}
