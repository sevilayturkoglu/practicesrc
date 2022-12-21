package test.sample_question_SeyfullahHoca;

import java.util.Scanner;

public class S19 {
    public static void main(String[] args) {
        /*
        Soru 19-)
Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
ipucu:
Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen dogum ayinizi ay adi olarak girin ornegin eylul  ");
        String ay = sc.next().toLowerCase();
        System.out.println("Lutfen dogdugunuz gunu rakamsal olarak girin tek rakamlar onune 0 koymayin");
        int gun = sc.nextInt();

        System.out.println("Verdiginiz dogum tarihine gore burcunuz= " + burcum(ay,gun));

    }public static String burcum( String ay , int gun ){
        String burc = "";
        switch (ay){
            case "ocak": burc= gun>=21  ? "kova":"oglak";break;
            case "subat": burc= gun>21  ? "balik":"kova";break;
            case "mart": burc= gun>21  ? "koc":"balik";break;
            case "nisan": burc= gun>21  ? "boga":"koc";break;
            case "mayis": burc= gun>21  ? "ikizler":"boga";break;
            case "haziran": burc= gun>21  ? "yengec":"ikizler";break;
            case "temmuz": burc= gun>21  ? "aslan":"yengec";break;
            case "agustos": burc= gun>21  ? "basak":"aslan";break;
            case "eylul": burc= gun>21  ? "terazi":"basak";break;
            case "ekim": burc= gun>21  ? "akrep":"terazi";break;
            case "kasim": burc= gun>21  ? "yay":"akrep";break;
            case "aralik": burc= gun>21  ? "oglak":"yay";break;
            default:
                System.out.println("Yanils ay girisi yaptiniz");
        }
      return burc;
    }
}
