package com.company;
// utworz metode przyjmujaca jeden parametr i wyswietla wszystkie potegi dwojki nie przekraczajace podanego parametru

public class zadanie3WyswietlaPotegiLiczbyDoMax {
    public static void main(String[] args) {
        int liczba = 80;

        potegaLiczba(liczba);
        potegowanieWhile(liczba);
        potegowanieDoWhile(liczba);
    }

    private static void potegowanieDoWhile(int liczba) {
        int i = 1;
        do {
            System.out.println(i);
            i *= 2;

        } while (i < liczba);
    }
// inicjuje i, sprawdza warunek i wykonuje polecenie instrukcji
    private static void potegaLiczba(int liczba) {
        for (int i = 1; i < liczba; i *= 2) {
            System.out.println(i);

        }
    }

    private static void potegowanieWhile(int liczba) {
        int i = 1;
        while (i < liczba) {
            System.out.println(i);
            i *= 2;
        }
    }
}
