package test.AbdullahHocaDersTekrar.Day6.InterfaceSoru;

import java.util.Scanner;

public class Kare implements IInterface{
    Scanner scan=new Scanner(System.in);
    int kenar=0;
    @Override
    public void alan() {
        System.out.print("Karenin bir kenar uzunluğunu giriniz: ");
        kenar=scan.nextInt();
        System.out.println("Alan= "+(kenar*kenar));
    }

    @Override
    public void cevre() {
        System.out.println("Cevre= "+(4*kenar));
    }
}
