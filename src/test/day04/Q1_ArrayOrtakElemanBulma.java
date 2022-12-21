package test.day04;

import java.util.Arrays;

public class Q1_ArrayOrtakElemanBulma {
    /*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
    public static void main(String[] args) {


        String[] arr1 = {"John", "Brad", "Ange", "Sofia", "Emily"};
        String[] arr2 = {"sofia", "brad", "grace", "emily", "hazel"};
        System.out.println(Arrays.toString(yeniArrayGetir(arr1, arr2)));

    }public static String [] yeniArrayGetir(String[] arr1 ,String[] arr2 ){
        String bol = "";
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
   if(arr1[i].equalsIgnoreCase(arr2[j])){
    bol+=arr2[j]+"-";
}
            }
        }
        String[] newArray=bol.split("-");

return newArray;
    }
}
