package test.AbdullahHocaDersTekrar.ATM_SORU;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {

        static Scanner scanner = new Scanner(System.in);

        void menu(ArrayList<Kullanici> kullaniciList, String kartNo) {
            System.out.print("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ\n" +
                    "1. BAKİYE SORGULAMA\n" +
                    "2. PARA YATIRMA\n" +
                    "3. PARA ÇEKME\n" +
                    "4. PARA GÖNDERME\n" +
                    "5. ŞİFRE DEĞİŞTİRME\n" +
                    "6. ÇIKIŞ\n" +
                    "SEÇİMİNİZ: ");
            if (scanner.hasNextInt()) {
                int secim = scanner.nextInt();
                switch (secim) {
                    case 1: {
                        bakiyeSorgulama(kullaniciList, kartNo);
                    }
                    case 2: {
                        paraYatirma(kullaniciList, kartNo);
                    }
                    case 3: {
                        paraCekme(kullaniciList, kartNo);
                    }
                    case 4: {
                        scanner.nextLine();
                        paraGonderme(kullaniciList, kartNo);
                    }
                    case 5: {
                        Runner.sifreDegistir(kullaniciList, kartNo);
                    }

                    case 6: {
                        System.out.println("*****GÜLE GÜLE*****");
                        System.exit(0);
                    }
                    default:{
                        System.out.println("GEÇERSİZ DEĞER GİRDİNİZ!!!");
                        scanner.nextLine();
                        menu(kullaniciList, kartNo);
                    }
                }
            }else {
                System.out.println("SAYISAL DEĞER GİRİNİZ!!!");
                scanner.nextLine();
                menu(kullaniciList, kartNo);
            }

        }
        private void paraGonderme(ArrayList<Kullanici> kullaniciList, String kartNo) {
            System.out.print("PARA GÖNDERMEK İSTEDİĞİNİZ İBANI GİRİNİZ: ");
            String iban = scanner.nextLine().toUpperCase().replace(" ", "");
            if (iban.length() == 26 && iban.startsWith("TR")) {
                System.out.print("GÖNDERMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
                double miktar = scanner.nextDouble();
                for (Kullanici w : kullaniciList) {
                    if (w.getKartNo().equals(kartNo)) {
                        if (miktar <= w.getBakiye()) {
                            w.setBakiye(w.getBakiye() - miktar);
                            bakiyeSorgulama(kullaniciList, kartNo);
                        } else {
                            System.out.println("BAKİYENİZ YETERSİZ!!!");
                            paraCekme(kullaniciList, kartNo);
                        }
                    }
                }
            } else {
                System.out.println("YANLIŞ İBAN GİRDİNİZ!!!");
                paraGonderme(kullaniciList, kartNo);
            }
        }

        private void paraCekme(ArrayList<Kullanici> kullaniciList, String kartNo) {
            System.out.print("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
            double miktar = scanner.nextDouble();
            for (Kullanici w : kullaniciList) {
                if (w.getKartNo().equals(kartNo)) {
                    if (miktar <= w.getBakiye()) {
                        w.setBakiye(w.getBakiye() - miktar);
                        bakiyeSorgulama(kullaniciList, kartNo);
                    } else {
                        System.out.println("BAKİYENİZ YETERSİZ!!!");
                        paraCekme(kullaniciList, kartNo);
                    }
                }
            }
        }

        private void paraYatirma(ArrayList<Kullanici> kullaniciList, String kartNo) {
            System.out.print("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
            double miktar = scanner.nextDouble();
            for (Kullanici w : kullaniciList) {
                if (w.getKartNo().equals(kartNo)) {
                    w.setBakiye(w.getBakiye() + miktar);
                    bakiyeSorgulama(kullaniciList, kartNo);
                }
            }
        }

        private void bakiyeSorgulama(ArrayList<Kullanici> kullaniciList, String kartNo) {
            for (Kullanici w : kullaniciList) {
                if (w.getKartNo().equals(kartNo)) {
                    System.out.println("BAKİYENİZ: " + w.getBakiye() + " tl");
                    menu(kullaniciList, kartNo);
                }
            }
        }


    }

