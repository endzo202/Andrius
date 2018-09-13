package days.second;

import java.util.Scanner;

public class FirstExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite polindroma kuri tikrinsite");

        String word = scanner.nextLine();


        //boolean val = isWordPalindrome(word);

        if (isWordPalindrome(word.replaceAll(" ", ""))) {
            System.out.println("Tai polindromas");
        }else{
        System.out.println("Tai nepolindromas");


    }

}

    private static boolean isWordPalindrome(String text) {
        boolean val = true;
        for (int i = 0; i < text.length(); i++) {
            char first = text.charAt(i);
            char second = text.charAt(text.length() - 1 - i);
            if (first != second){
                val = false;
                break;
            }

        }
        return val;
    }


}
