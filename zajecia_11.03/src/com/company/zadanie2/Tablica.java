package com.company.zadanie2;

/*
Utwórz klasę `Tablica` służącą do obsługi tablicy jednowymiarowej z możliwością dynamicznej zmiany rozmiaru.
*konstruktor:*
* jednoparametrowy (przyjmujący początkowy rozmiar tablicy)

*pole:*
* będące tablicą, ale z modyfikatorem `private`

*metody umożliwiające:*
++++++++++++++ * Wstawienie elementu na koniec
++++++++++++++ * Zwrócenie rozmiar tablicy
++++++++++++++ * Wyświetlenie tablicy
++++++++++++++ * Rozszerzenie tablicy o wybraną liczbę pozycji na końcu (domyślnie o `1`)
++++++++++++++ * Wstawienie elementu na początek
++++++++++++++ * Wstawienie elementu pod wybranym indeksem
++++++++++++++ * Usunięcie elementu pod wybranym indeksem
++++++++++++++ * Zwrócenie największego elementu w tablicy
 */

import java.util.Random;

public class Tablica {
    private int tablica[];

    Tablica(int rozmiar) {
        tablica = new int[rozmiar];
    }

    void wyswietlTablice() {
        System.out.print("[");
        for (int liczba : tablica) {
            System.out.print(liczba + ", ");
        }
        System.out.println("\b\b]");
    }

    void wstawPodIndeks(int indeks, int wartosc) {
        tablica[indeks] = wartosc;
    }

    void wstawNaPoczatek(int wartosc) {
        rozszerzTablice(1, false);
        wstawPodIndeks(0, wartosc);
    }

    void wypelnijLosowo() {
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(11);
        }
    }

    void usunPodIndeksem(int indeksDoUsuniecia) {
        int nowaTablica[] = new int[tablica.length - 1];
        int przesuniecie = 0;
        for (int obecnaPozycja = 0; obecnaPozycja < tablica.length - 1; obecnaPozycja++) {
            if (obecnaPozycja == indeksDoUsuniecia) {
                przesuniecie++;
            }
            nowaTablica[obecnaPozycja] = tablica[obecnaPozycja + przesuniecie];
        }
        tablica = nowaTablica;
    }

    private void rozszerzTablice() {
        rozszerzTablice(1, true);
    }

    private void rozszerzTablice(int wartosc, boolean czyRozszerzycNaKoncu) {
        int nowaTablica[] = new int[tablica.length + wartosc];
        int przesuniecie;

        if (czyRozszerzycNaKoncu) {
            przesuniecie = 0;
        } else {
            przesuniecie = wartosc;
        }

        for (int i = 0; i < tablica.length; i++) {
            nowaTablica[i + przesuniecie] = tablica[i];
        }
        tablica = nowaTablica;
    }

    void wstawNaKoniec(int wartosc) {
        rozszerzTablice();
        wstawPodIndeks(tablica.length - 1, wartosc);
    }

    int najwiekszaLiczba() {
        return tablica[indeksNajwiekszejLiczby()];
    }

    int indeksNajwiekszejLiczby() {
        int indeks = 0;
        int najwiekszaLiczba = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (najwiekszaLiczba < tablica[i]) {
                najwiekszaLiczba = tablica[i];
                indeks = i;
            }
        }
        return indeks;
    }

    int rozmiarTablicy() {
        return tablica.length;
    }


}
