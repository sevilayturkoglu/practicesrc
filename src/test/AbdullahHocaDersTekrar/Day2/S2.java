package test.AbdullahHocaDersTekrar.Day2;

public class S2 {
    public static void main(String[] args) {
        /*
        2-Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
         Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.
         */
        int[]somunlar={4,5,6,7};
        int[]civatalar={7,6,4,3,5,1};

        for (int i = 0; i < somunlar.length; i++) {
            String esitler="";
            for (int j = 0; j < civatalar.length ; j++) {
                if(somunlar[i]==civatalar[j]){
                    esitler+=somunlar[i]+"="+civatalar[j];
                    System.out.println(somunlar[i]+" somunu "+civatalar[j]+" civatası ile eşleşti");
                }
            }
            System.out.println(esitler);
        }
    }
}
