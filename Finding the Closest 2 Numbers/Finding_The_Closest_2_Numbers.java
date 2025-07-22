package patika_week_3;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Finding_The_Closest_2_Numbers {

    public static void main(String[] args) {

        TreeSet<Integer> listTreeSet = new TreeSet<>();

        listTreeSet.add(3);
        listTreeSet.add(5);
        listTreeSet.add(16);
        listTreeSet.add(9);
        listTreeSet.add(10);
        listTreeSet.add(28);
        listTreeSet.add(35);
        listTreeSet.add(30);
        listTreeSet.add(6);
        listTreeSet.add(21);

        //for döngüsünde kullanmak ve get methodundan yararlanmak için arrayyliste çevirme

        List<Integer> sortedList = new ArrayList<>(listTreeSet);

        int minFark = Integer.MAX_VALUE;
        int sayi1 = 0;
        int sayi2 = 0;

        for (int i = 0; i < sortedList.size()-1; i++) {
            int fark = sortedList.get(i+1) - sortedList.get(i);

            if(fark<minFark){
                minFark = fark;
                sayi1 = sortedList.get(i);
                sayi2 = sortedList.get(i+1);
            }


        }

        System.out.println("En yakın iki sayı: " + sayi1 + " ve " + sayi2);
        System.out.println("Aralarındaki fark: " + minFark);





    }



}
