package days.second;

import java.util.Scanner;

public class SecondExample {

    public static void main(String[] args) {

        System.out.println("Pasirinkite ka norite apskaiciuoti\n1-Staciojo trikampio plotas\n2-Staciakampio plotas\n3-Kvadrato plotas\n4-Apskritimo plotas");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option){
            case 1:
                //double result = triangle(scanner);
                System.out.println("Trikampio plotas yra " + triangle(scanner));
                break;
            case 2:
                System.out.println("Staciakampio plotas yra " + staciakampis(scanner));
                break;

            case 3:
                System.out.println("Kvadrato plotas yra " + kvadratas(scanner));
                break;

            case 4:
                System.out.println("Apskritimo plotas yra " + apskritimas(scanner));
                break;
            default:
                System.out.println("Netinka nei vienas variantas");
                break;
        }
    }

    private static double triangle(Scanner scanner){
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b statini");
        double b = scanner.nextDouble();
        return (a * b) / 2;
    }

    private static double staciakampis(Scanner scanner){
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b statini");
        double b = scanner.nextDouble();
        return (a * b);

    }
    private static double kvadratas(Scanner scanner) {
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();
        return (a * a);
    }

    private static double apskritimas(Scanner scanner) {
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();
        return Math.PI *(a * 2);
    }
}
