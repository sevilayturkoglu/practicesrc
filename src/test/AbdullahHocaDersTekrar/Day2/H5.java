package test.AbdullahHocaDersTekrar.Day2;

import java.util.Arrays;

public class H5 {
  /*  MOUNTAIN ARRAY SORUSU : *Verilen herhangi bir arrayin Mountain Array olup olmadıgını kontrol etmek için bir kod yazınız.
    Not:
    Mountain Array ==> [0, 2, 5, 3, 1]
    Bir array elemanları en büyük degerine kadar sürekli artan, en büyük degerinden sonra sürekli azalan deger alıyorsa Mountain Array' dir.
    Mountain Array Degil ==> [5, 2, 7, 1, 4]
    Bir array elemanları en büyük degerine kadar sürekli azalan, en büyük degerinden sonra sürekli artan deger alıyorsa Mounta!n Array degildir
    */
    public static void main(String[] args) {
        int arr1[] = {0, 2, 5, 3, 1};
        int arr2[] = {5, 2, 7, 1, 4};

        mountainArray(arr1);
        mountainArray(arr2);
    }
    private static void mountainArray(int[] arr) {
        int enBuyuk = 0;
        int enBuyukIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > enBuyuk) {
                enBuyuk = arr[i];
                enBuyukIndex = i;
            }
        }
        boolean kontrol = true;

        for (int i = enBuyukIndex; i < arr.length - 1; i++) {//5, 3, 1
            if (arr[i] > arr[i + 1]) {
                continue;
            } else {
                kontrol = false;
                break;
            }
        }

        if (kontrol) {
            for (int i = enBuyukIndex; i > 0; i--) {//0, 2, 5
                if (arr[i] > arr[i - 1]) {
                    continue;
                } else {
                    kontrol = false;
                    break;
                }
            }
        }

        if (kontrol) {
            System.out.println(Arrays.toString(arr) + " arrayi mountain arraydir");
        } else {
            System.out.println(Arrays.toString(arr) + " arrayi mountain array değildir");
        }

    }

}
