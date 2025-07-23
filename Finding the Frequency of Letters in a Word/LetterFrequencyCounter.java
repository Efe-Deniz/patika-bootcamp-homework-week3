package patika_week_3;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Kelime Giriniz: ");
        String input = scanner.nextLine().toLowerCase();

        //Harf frekanslarını hesaplama
        Map<Character, Integer> result = calculateFrequency(input);
        printFrequencies(result);


    }
    public static Map<Character, Integer> calculateFrequency(String input) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        return map;
    }



    public static void printFrequencies(Map<Character,Integer> map){

        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }

}
