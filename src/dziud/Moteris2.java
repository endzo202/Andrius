package dziud;

import java.util.Scanner;

public class Moteris2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        do {
            System.out.println("Iveskite zodi");

            word = scanner.nextLine();
            int countLetters = countletter(word);
            if (word.length() % 2 == 0) {
                System.out.println("Ivestas zodis " + word + " yra lyginis " + " jo ilgis yra  " + word.length() + "rasta a raidziu " + countLetters);

            }else{
                System.out.println("Ivestas zodis " + word + " yra nelyginis " + " jo ilgis yra  " + word.length() + "rasta a raidziu " + countLetters);
            }
          //  System.out.println(word);
        } while (!word.toLowerCase().equals("PABAIGA"));
    }

    private static int countletter(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }


}

