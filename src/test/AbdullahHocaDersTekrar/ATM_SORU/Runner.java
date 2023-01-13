package test.AbdullahHocaDersTekrar.ATM_SORU;
    import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

    public class Runner {
        /*
       ATM
    Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
    Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
    Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
    Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.
    Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
    Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina
    geri donsun.
    Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
        */
        static ArrayList<Kullanici> kullaniciList = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);
        static Islemler islemler = new Islemler();

        public static void main(String[] args) {
            Kullanici kullanici = new Kullanici("1234123412341234", "1234", 50000);
            kullaniciList.add(kullanici);
            System.out.println("*****WISEQARTER BANKA HOŞGELDİNİZ*****");
            System.out.print("YENİ KULLANICI İÇİN 'E' TUŞUNA BASINIZ. DEVAM ETMEK İÇİN 'H' TUŞUNA BASINIZ\n" +
                    "SEÇİMİNİZ: ");
            char secim = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();
            if (secim == 'E') {
                yeniKullanici(kullaniciList); // BU METOD SORUDA OLMAMASINA RAĞMEN CONSTRUCTOR İLE KULLANICI OLUŞTURMA AMAÇLI YAPTIK
            } else {
                giris();
            }

        }

        protected static void giris() {
            System.out.print("Kart No Giriniz: ");
            String kKartNo = scanner.nextLine().replace(" ", "");
            System.out.print("Sifre Giriniz: ");
            String kSifre = scanner.next();

            boolean kontrol = false;
            for (Kullanici each : kullaniciList) {
                if (each.getKartNo().equals(kKartNo) && each.getSifre().equals(kSifre)) {
                    islemler.menu(kullaniciList, kKartNo);
                    kontrol = true;
                }

            }
            if (kontrol == false) {
                System.out.println("Kart no veya şifre yanlış!!!!");
                scanner.nextLine();
                giris();
            }
        }

        static public void yeniKullanici(ArrayList<Kullanici> kullaniciList) {
            System.out.print("YENİ KULLANICININ KART NUMARASINI GİRİNİZ: ");
            String kartNo = scanner.nextLine().replace(" ", "");
            System.out.print("YENİ KULLANICI İÇİN ŞİFRE GİRİNİZ: ");
            String sifre = scanner.next();
            Kullanici kullanici = new Kullanici(kartNo, sifre, 0);
            kullaniciList.add(kullanici);
            scanner.nextLine();
            giris();
        }

        static public void sifreDegistir(ArrayList<Kullanici> kullaniciList, String kartNo) {
            System.out.print("ESKİ ŞİFREYİ GİRİNİZ: ");
            String eSifre = scanner.next();
            boolean kontrol = false;
            for (Kullanici w : kullaniciList) {
                if (w.getKartNo().equals(kartNo)) {
                    if (eSifre.equals(w.getSifre())) {
                        System.out.print("YENİ ŞİFRE GİRİNİZ: ");
                        w.setSifre(scanner.next());
                        kontrol = true;
                        scanner.nextLine();
                        giris();
                    }
                }
            }
            if (kontrol == false) {
                System.out.println("ŞİFRE HATALI!!!");
                sifreDegistir(kullaniciList, kartNo);
            }
        }
}
