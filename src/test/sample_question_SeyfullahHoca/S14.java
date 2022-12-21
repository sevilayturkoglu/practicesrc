package test.sample_question_SeyfullahHoca;

public class S14 {
    public static void main(String[] args) {
        /*
        Soru 14-)
Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır. Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"  değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
Ipucu:
IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
         */
        String str="Harfaga";
        int count=1;
        for (int i = 0; i <str.length()-1 ; i++) {
            if(str.substring(i+1).contains(str.substring(i,i+1))){
                System.out.println(str.substring(i + 1)+"*");
                count++;

            }
        }
        System.out.println(count);
        System.out.println(count > 0 ? "Tekrarlayan eleman var" : " tekrarlayan eleman yok");
    }
}
