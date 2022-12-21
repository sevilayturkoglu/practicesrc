package test.AbdullahHocaDersTekrar.Day1;

public class odev_mukemmelSayi {

    public static void main(String[] args) {
        // 1 den 1000 e kadar olan mükemmel sayıları arar
        // 1000 ü artırabilirsiniz

        for(int a=1;a<=1000;a++){
            int toplam = 0;
            for (int i = 1 ; i < a ; i++) {
                if(a %i == 0)
                    toplam += i;
            }

            if (toplam == a)
                System.out.println(a + " mükemmel bir sayidir");

        }
    }
}