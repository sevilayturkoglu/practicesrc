package test.AbdullahHocaDersTekrar.Day6.InterfaceSoru;

import java.util.Scanner;

public class Daire implements IInterface{
    Scanner scan=new Scanner(System.in);
    int r=0;
    @Override
    public void alan() {
        System.out.println("Dairenin yarıçapını giriniz: ");
        r=scan.nextInt();
        System.out.println("Alan: "+(3.14*r*r));

    }

    @Override
    public void cevre() {
        System.out.println("Çevre: "+(2*r*3.14));
    }
}
