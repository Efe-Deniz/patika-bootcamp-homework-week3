package patika_week_3;

import java.util.HashMap;
import java.util.Map;

public class MapEntryPrinter {

    public static void main(String[] args) {

        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("Ali",85);
        hashMap.put("Zeynep",100);
        hashMap.put("Ayşe",90);
        hashMap.put("Fatma",95);
        hashMap.put("Kazim",80);

        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey() + " = " +  entry.getValue());
        }

    }
}
