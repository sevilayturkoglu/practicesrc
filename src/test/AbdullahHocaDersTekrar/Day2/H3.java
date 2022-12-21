package test.AbdullahHocaDersTekrar.Day2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class H3 {
    /*
    kullanıcının istediği büyüklükte diziye 0-100 arası rastgele sayılarla doldurup kaçının ortalamanın altında,
    kaçının ortalamanın üzerinde olduğunu bulan metodu bulunuz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array uzunluğunu giriniz: ");
        int uzunluk= scan.nextInt();
        arrayOlustur(uzunluk);
    }

    private static void arrayOlustur(int uzunluk) {
        int arr[]=new int[uzunluk];
        Random rnd=new Random();
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rnd.nextInt(100);
            toplam+=arr[i];
        }
        double ortalama=toplam/arr.length;
        int alt=0,ust=0,esit=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ortalama){
                alt++;
            }else if(arr[i]>ortalama){
                ust++;
            }else{
                esit++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Ortalama: "+ortalama+"\n"
                +alt+" adet sayı ortalamadan küçük\n" +
                ust+" adet sayı ortalamdan büyük\n" +
                esit+" adet sayı ortalamaya eşit");
    }
}
