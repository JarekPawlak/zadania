package pl.maciejczapla;


import java.util.Scanner;

/**
 * Utwórz metodę, do której przekazujesz jeden parametr
 * (typu `int`) oraz zwraca informację (typu logicznego)
 * czy liczba jest większa (bądź równa) od 100
 */
public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę:  ");
        int liczba = scanner.nextInt();

        boolean wynik = check(liczba);

        System.out.printf("%s: (%s)\n", liczba, wynik);
        System.out.println(liczba + ": " + wynik);
    }

    private static boolean check(int liczba) {
        if (liczba >= 100) {
            return true;
        } else {
            return false;
        }
    }
}