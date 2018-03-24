package pl.maciejczapla;

import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        String odpowiedz = sprawdzPrzedzial(liczba);

        System.out.println(odpowiedz);
    }

    private static String sprawdzPrzedzial(int liczba) {
        int min = -4;
        int max = 4;

        if (liczba < min) {
            return String.format("Liczba %s jest mniejsza od  %s", liczba, min);
        } else if (liczba > max) {
            return String.format("Liczba %s jest wieksza od  %s", liczba, max);
        } else {
            return String.format("Liczba %s jest w przedziale  < %s, %s >", liczba, min, max);
        }
    }
}
