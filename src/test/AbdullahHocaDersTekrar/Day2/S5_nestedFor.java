package test.AbdullahHocaDersTekrar.Day2;

public class S5_nestedFor {
    /*
    1-Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan metodu yazınız
2-Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun. Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.
3-kullanıcının istediği büyüklükte diziye 0-100 arası rastgele sayılarla doldurup kaçının ortalamanın altında,kaçının ortalamanın üzerinde olduğunu bulan metodu bulunuz
4-String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JMJ
5-MOUNTAIN ARRAY SORUSU : Verilen herhangi bir arrayin Mountain Array olup olmadıgını kontrol etmek için bir kod yazınız.
Not:
Mountain Array ==> [0, 2, 5, 3, 1]
Bir array elemanları en büyük degerine kadar sürekli artan, en büyük degerinden sonra sürekli azalan deger alıyorsa Mountain Array' dir.
Mountain Array Degil ==> [5, 2, 7, 1, 4]
Bir array elemanları en büyük degerine kadar sürekli azalan, en büyük degerinden sonra sürekli artan deger alıyorsa Mountain Array degildir
     */
    public static void main(String[] args) {
        int[] mountainMi={0,1,2,3,4,5,6,7,8,4,3}  ;
        boolean dagMi1 = false;
        boolean dagMi = false;
        int enBuyuk = 0;
        int enBuyukIndex = 0;

        for (int i = 0; i < mountainMi.length; i++) {
            if (mountainMi[i] > enBuyuk) {
                enBuyuk = mountainMi[i];
                enBuyukIndex = i;
            }
        }

        for (int i = 0; i < enBuyukIndex; i++) {
            for (int j = enBuyukIndex ; j < mountainMi.length-1; j++) {
                if (mountainMi[j] > mountainMi[j + 1]) {
                    dagMi1 = true;
                } else {
                    dagMi1 = false;
                    break;
                }

            }   if (mountainMi[i] < mountainMi[i + 1]) {
                dagMi = true;
            } else {
                dagMi = false;
                break;

            }
        }
        if(dagMi==true&&dagMi1==true){
            System.out.println("mountain array");
        }else{
            System.out.println("mountain array degil");
        }



            }
        }
            



