/*
Utwórz metodę, która przyjmuje dwa parametry
- długość i szerokość tablicy, a następnie zwraca nowo utworzoną,
dwuwymiarową tablicę wypełnioną losowymi wartościami.
Utwórz drugą metodę do wyświetlania zwróconej tablicy.

 */
package com.company;

import java.util.Random;

public class Zad1TablicaWielowymRandom {

public static void main(String[] args) {
        int[][] tablica = generujTablice(5, 3);

        wyswietlTablice(tablica);
    }

    private static int[][] generujTablice(int szerokosc, int wysokosc) {
        int[][] tablica = new int[wysokosc][szerokosc];
        Random losowaLiczba = new Random();

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                tablica[i][j] = losowaLiczba.nextInt(21); // losuje z liczb od 0 do 20 bez 21
            }
        }
        return tablica;
    }

    private static void wyswietlTablice(int[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


