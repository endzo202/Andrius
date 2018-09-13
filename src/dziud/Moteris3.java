package dziud;

import java.util.Scanner;

public class Moteris3 {
    public static void main(String args[]) {
        int skaicius;
        System.out.println("iveskite skaiciu :");

        Scanner input = new Scanner(System.in);//atidaro konsole su zmogum
        skaicius = input.nextInt();//kursorius dirba

        if (skaicius % 2 == 0)
            System.out.println("Skaicius lyginis");
        else
            System.out.println("Skaicius nelyginis");
    }
}