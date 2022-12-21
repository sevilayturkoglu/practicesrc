package test.AbdullahHocaDersTekrar.Day2;

public class S1 {
    public static void main(String[] args) {
        /*
        1-Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan metodu yazınız
         */
        String str = "a1fg5re6qw7";
        System.out.println(degerTopla(str));

    }public static int degerTopla(String str){
        int top=0;
        for (int i = 0; i < str.length() ; i++) {
          if(Character.isDigit(str.charAt(i))){
              top+=Integer.valueOf(str.substring(i,i+1));
          }
        }
        return top;
    }
}
