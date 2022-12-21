package test.AbdullahHocaDersTekrar.Day2;

public class odevTC {
    public static void main(String[] args) {
    /*
TC kimlik numarasının son rakamı çift olmak zorundadır. 0 rakamı ile başlayamaz. ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının
9 katının toplamının birler basamağı 10. rakamı; 1, 3, 5, 7 ve 9. rakamın toplamının
8 katının birler basamağı 11. rakamı vermektedir.
 */

        long kimlik=10000000146l;
        String kimlikStr="10000000146";
        boolean dogruMu=false;
        int toplam=0;
int topTekSayilar=0;
int topCiftSayilar=0;
int sonToplam=0;

             if(kimlik%2==0&&kimlikStr.charAt(0)!='0'){

            for (int i = 0; i < kimlikStr.length()-1; i++) {

                toplam+=Integer.parseInt(kimlikStr.substring(i,i+1));
            }
            if(toplam%10==Integer.parseInt(kimlikStr.substring(10))){

                for (int i = 0; i < kimlikStr.length()-2; i+=2) {

                    topTekSayilar+=Integer.parseInt(kimlikStr.substring(i,i+1));
                }
                topTekSayilar=topTekSayilar*7;

                for (int i = 1; i < kimlikStr.length()-3; i+=2) {

                    topCiftSayilar+=Integer.parseInt(kimlikStr.substring(i,i+1));
                }

                topCiftSayilar=topCiftSayilar*9;

               int tekVeCiftSayiTop= topCiftSayilar+topTekSayilar;//300

                if( tekVeCiftSayiTop%10==Integer.parseInt(kimlikStr.substring(9,10))){


                    for (int i = 0; i < kimlikStr.length()-2; i+=2) {

                        sonToplam += Integer.parseInt(kimlikStr.substring(i, i + 1));
                    }
                    sonToplam=sonToplam*8;

                    if(sonToplam%10==Integer.parseInt(kimlikStr.substring(10))){

          dogruMu=true;
            }else{

             }
                }else{

                }

            }else{

            }

        }else{

        }
if(dogruMu==true){
    System.out.println("Tc kimlik no dogru kodlanmis");
}else{
    System.out.println("yanlis");
}



    }
}
