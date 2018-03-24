package pl.maciejczapla;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe A: ");
        int a = scanner.nextInt();

        System.out.print("Podaj liczbe B: ");
        int b = scanner.nextInt();

        System.out.print("Podaj liczbe C: ");
        int c = scanner.nextInt();

        boolean wynikSprawdzenia = sprawdz(a, b, c);
//        System.out.printf("Podane liczby: %s takie same", (wynikSprawdzenia ? "SĄ" : "NIE SĄ"));

        if (wynikSprawdzenia) {
            System.out.println("Podane liczy SĄ takie same");
        } else {
            System.out.println("Podane liczy NIE SĄ takie same");
        }

    }

    private static boolean sprawdz(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        } else {
            return false;
        }
    }
}
