package com.company;

import java.util.Random;

/*
Utwórz metodę, która przyjmuje dwa parametry - długość i szerokość tablicy.
Utwórz drugą metodę, który wypełni ją wartościami losowymi.
Następnie trzecia metoda wyświetla ją *wraz z sumą elementów* w danym wierszu i kolumnie
> Na przykład:
>
```1 2 3 | 6
1 2 3 | 6
1 2 3 | 6
- - - + -
3 6 9 | 18```
 */

public class Zad2TabliceSumaWierszyIKolum {
    public static void main(String[] args) {

        int wysokosc = 3;
        int szerokosc = 5;

        sumaElementowTablicy(wysokosc, szerokosc);


    }

    private static void sumaElementowTablicy(int wysokosc, int szerokosc) {
        int[][] tablica = tworzWypelnionaTablice(wysokosc, szerokosc);
        int[] sumyKolumn = new int[szerokosc];
        for (int i = 0; i < wysokosc; i++) {
            int sumaWiersza = 0;
            for (int j = 0; j < szerokosc; j++) {
                sumaWiersza += tablica[i][j];
                System.out.print(tablica[i][j] + "\t");
                sumyKolumn[j] += tablica[i][j];
            }
            System.out.println(" | " + sumaWiersza);
        }
        for (int i = 0; i < szerokosc + 2; i++) {
            System.out.print("-\t");

        }
        System.out.println();
        for (int i = 0; i < szerokosc; i++) {
            System.out.print(sumyKolumn[i] + "\t");
        }
    }

    private static int[][] tworzWypelnionaTablice(int wysokosc, int szerokosc) {
        return tworzWypelnionaTablice(wysokosc, szerokosc, 21);
    }

    private static int[][] tworzWypelnionaTablice(int wysokosc, int szerokosc, int zakresLiczb) {
        Random generator = new Random();
        int[][] wypelnionaTablica = new int[wysokosc][szerokosc];
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                wypelnionaTablica[i][j] = generator.nextInt(zakresLiczb);
            }
        }
        return wypelnionaTablica;
    }

}