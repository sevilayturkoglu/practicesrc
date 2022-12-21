package test.AbdullahHocaDersTekrar.Day3;

import java.util.Scanner;

public class Soru4 {
    /*
     Soru4:

             * Basit bir 5 ürünlü manav alisveris programi yaziniz.
             *
             * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
             * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
             * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
             * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
             * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
             * goster.
              */
    public static void main(String[] args) {
        int mandalinaFiyat=8;
        int cilekFiyat=15;
        int elmaFiyat=9;
        int portakalFiyat=10;
        int karpuzFiyat=18;
        int toplamOdeme=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("mandalina=1\ncilek=2\nelma=3\nkarpuz=4\nportakal=5\n almak istediginiz urunun numarasini giriniz");
        String devam="evet";
        while (devam.equalsIgnoreCase("evet")){
            int hangiUrun=sc.nextInt();
            System.out.println("Istediginiz urunun kg olarak miktarini giriniz");
            int kg= sc.nextInt();
            sc.nextLine();
            System.out.println("Baska bir urun daha almak ister misiniz evet ,hayir olarak cevaplayiniz,hayira basarak sistemden cikiniz");
            devam=sc.nextLine();
            if(devam.equalsIgnoreCase("evet")) {
                System.out.println("mandalina=1 \ncilek=2  \nelma=3  \nkarpuz=4 \nportakal=5  \n  almak istediginiz urunun numarasini giriniz");
            }
           if(hangiUrun==1){
               toplamOdeme+=kg*mandalinaFiyat;
           }if(hangiUrun==2){
               toplamOdeme+=kg*cilekFiyat;
            }if(hangiUrun==3){
               toplamOdeme+=kg*elmaFiyat;
            }if(hangiUrun==4){
               toplamOdeme+=kg*karpuzFiyat;
            }if(hangiUrun==5){
               toplamOdeme+=kg*portakalFiyat;
            }

        }
        System.out.println("Toplam odemeniz ="+toplamOdeme+" Tl");
        /*HOCANIN COZUMU
         static ArrayList<String> urunList = new ArrayList<>(Arrays.asList("Portakal", "Mandalina", "Elma", "Ispanak", "Muz"));
    static ArrayList<Integer> fiyatList = new ArrayList<>(Arrays.asList(10, 12, 15, 10, 18));
    static double toplam = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("******DOYURAN MARKET******");
        menu();
    }

    private static void menu() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i  + ". ürün: " + urunList.get(i-1) + " fiyatı: " + fiyatList.get(i-1) + " TL");
        }

        System.out.println("Seçmek istediğiniz ürünün kodunu giriniz: ");
        int urun = scan.nextInt();
        System.out.println("Miktar giriniz: ");
        double miktar = scan.nextInt();
        toplam += miktar * fiyatList.get(urun - 1);

        System.out.println("Alışverişe devam etmek istiyormusunuz? E/H");
        char secim = scan.next().charAt(0);

        if (secim == 'e' || secim == 'E') {
            menu();
        } else {
            System.out.println("Ödenecek tutar: " + toplam);
         */
    }
}
