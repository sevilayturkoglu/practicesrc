package test.sample_question_SeyfullahHoca;

public class S20tekrarlananakrakterler {
    public static void main(String[] args) {
        /*
        Soru 20-)
Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır. Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ; aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                Örnek:
                giriş: ama
		çıkış: Dizede yinelenen karakterler var

                İpucu: İf Else ve Char kullanarak çözebiliriz.
         */
        String word = "ece";
        String yenilenen="";
        int count=0;
        if (word.length() <=3) {
            for (int i = 0; i < word.length(); i++) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.substring(i, i + 1).equals(word.substring(j, j + 1))) {
                        yenilenen+=word.substring(j,j+1);
                       count++;
                    }
                }
            }
        } else {
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }if(count>=1){
            System.out.println("yenilenen kelime var");
            System.out.println("yenilenen karakter= "+yenilenen);
        }else {
            System.out.println("yenilenen kelime yok");
        }
    }
}


