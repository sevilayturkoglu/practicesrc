package test.AbdullahHocaDersTekrar.Day3;

import java.util.ArrayList;
import java.util.List;

public class deneFibo {
    public static void main(String[] args) {
        List<Integer>fiboList=new ArrayList<>();
        fiboList.add(0);
        fiboList.add(1);
        int sinirDeger=15;
        int toplam=0;

        for (int i = 2; i <sinirDeger ; i++) {
            toplam= fiboList.get(fiboList.size()-1)+ fiboList.get(fiboList.size()-2);
           fiboList.add(toplam);

        }
        System.out.println(fiboList);
    }
}
