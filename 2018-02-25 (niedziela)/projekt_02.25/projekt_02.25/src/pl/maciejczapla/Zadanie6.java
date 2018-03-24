package pl.maciejczapla;

import java.util.Scanner;

/**
 * Utwórz metodę, do której przekazujesz jeden parametr a ona zwróci informację czy przekazany parametr jest maksymalnie o 2 różny od wielokrotności liczby **20**
 */
public class Zadanie6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        boolean wynik = sprawdzLiczbe(liczba);
        System.out.println("Czy spełnia warunek: " + (wynik ? "TAK" : "NIE"));
    }

    private static boolean sprawdzLiczbe(int liczba) {
        int reszta = liczba % 20;
        if ((reszta >= 0 && reszta < 3) || reszta == 18 || reszta == 19) {
            return true;
        } else {
            return false;
        }
    }
}
