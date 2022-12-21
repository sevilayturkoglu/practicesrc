package test.sample_question_SeyfullahHoca;

import java.util.Arrays;

public class S35 {
    /*
Soru 35-)
Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
		--> toCharArray() yöntemini kullanmayın
Örnek:
		String isim:    Yakup
		char arr[]:     [Y,a,k,u,p]
İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin

     */
    public static void main(String[] args) {
        String isim = "Yakup";

        System.out.println(Arrays.toString(charArray(isim)));
    }public static char[] charArray(String isim){
        char[]cari=new char[isim.length()];

        for (int i = 0; i < cari.length; i++) {
            cari[i]=isim.charAt(i);
        }
        return cari;

    }


}


