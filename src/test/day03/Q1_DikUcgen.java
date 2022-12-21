package test.day03;

import java.util.Scanner;

public class Q1_DikUcgen {
    public static void main(String[] args) {
        /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        NOT:
        Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        denkleminden yararlanabilirsiniz.
        -----Ornek Ekran Ciktisi-----
        ilk kenari giriniz: 2
        ikinci kenari giriniz 15
        üçüncü kenari giriniz: 7
        Bu bir dik ucgen degildir.
        Bu bir dik ucgendir.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dik ucgen olusturmak uzere kenar uzunluklari giriniz");
        int birinciK=scan.nextInt();
        int ikinciK=scan.nextInt();
        int ucuncuK= scan.nextInt();
        if((birinciK*birinciK+ikinciK*ikinciK==ucuncuK*ucuncuK)||(birinciK*birinciK+ucuncuK*ucuncuK==ikinciK*ikinciK)||
                ( ucuncuK*ucuncuK+ikinciK*ikinciK==birinciK*birinciK)){
            System.out.println("Bu bir dik ucgendir");
        }else{
            System.out.println("Dik ucgen degildir");
        }
    }
}
