package test.AbdullahHocaDersTekrar.Day2;

public class S4_charAt {
    public static void main(String[] args) {
        String[] words = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        basHarfler(words);
    }public static void basHarfler(String[] words){
        for (int i = 0; i < words.length; i++) {
            String basHarf="";
            if(words[i].charAt(words[i].length()-1)=='n'||words[i].charAt(words[i].length()-1)=='k'){
                basHarf+=words[i].charAt(0);
            }
            System.out.print(basHarf);
        }
    }
}
