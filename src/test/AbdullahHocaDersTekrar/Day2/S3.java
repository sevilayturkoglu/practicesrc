package test.AbdullahHocaDersTekrar.Day2;

public class S3 {
    public static void main(String[] args) {
        /*
        3-kullanıcının istediği büyüklükte diziye 0-100 arası rastgele sayılarla doldurup kaçının ortalamanın altında
        ,kaçının ortalamanın üzerinde olduğunu bulan metodu bulunuz
         */
        int[] sayilar = {2, 8, 25, 64, 45};
        System.out.println(ortUzeriMi(sayilar));
    }public static int ortUzeriMi(int[] sayilar ){
        int top=0;
        double ort=1;
       int count=0;
        for (int i = 0;i < sayilar.length; i++) {
            top+=sayilar[i];
            ort=top/ sayilar.length;

        }
        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i]>ort){
                count++;
            }
        }
     // //  System.out.println(ort);
       return count;
    }
}
