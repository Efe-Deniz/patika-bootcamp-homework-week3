package patika_week_3;

import java.util.*;

public class Letter_Finding_Game {


    public static void main(String[] args) {

        Set<String> tempSet = new HashSet<>();
        Random rand = new Random();

        while (tempSet.size() < 4) {
            int randomNumber = rand.nextInt(26);
            char letter = (char) ('a' + randomNumber);
            tempSet.add(String.valueOf(letter));
        }

        ArrayList<String> letterList = new ArrayList<>(tempSet);

        System.out.println("Başlangıç Harf Listesi: " + letterList);

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i <4 ; i++) {
            System.out.print((i+1) + " . harfi giriniz: ");
            String userLetter = scanner.nextLine().toLowerCase();
            if (letterList.contains(userLetter)) {
                int index = letterList.indexOf(userLetter);
                letterList.set(index, "found");
            } else {
                letterList.add(userLetter);
            }

        }
        System.out.println(letterList);


    }
}
