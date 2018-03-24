package com.company;

import java.util.Arrays;

/**
 * Utwórz metodę, która przyjmuje dwie tablice. Metoda ma zwrócić sumę podanych tablic.
 * To znaczy element na pozycji `0` z pierwszej tablicy, dodajemy do elementu
 * na pozycji `0` z drugiej tablicy. Tablice mają być tych samych długości.
 * >`[1,  2,  3,  4]`
 * >`[5,  6,  7,  8]`
 * >`[6,  8, 10, 11]`
 */

public class Zadanie14b {
    public static void main(String[] args) {
        int[] tablicaA = new int[]{9, 8, 9, 4};
        int[] tablicaB = new int[]{5, 5, 4, 8};

        sumujTablice(tablicaA, tablicaB);
        System.out.println(Arrays.toString(sumujTablice(tablicaA, tablicaB)));
    }

    private static int[] sumujTablice(int[] tablicaA, int[] tablicaB) {
        int liczbaDoPrzeniesienia = 0;
        int[] nowaTablica;

        if (tablicaA.length > tablicaB.length) {
            nowaTablica = new int[tablicaA.length];
        } else {
            nowaTablica = new int[tablicaB.length];
        }

        for (int i = nowaTablica.length - 1; i >= 0; i--) {

            int suma = tablicaA[i] + tablicaB[i] + liczbaDoPrzeniesienia;

//            if(tablicaA.length == nowaTablica.length){
//                suma = tablicaA[i] + liczbaDoPrzeniesienia;
//
//            }


            liczbaDoPrzeniesienia = 0;

            if (suma >= 10) {
                liczbaDoPrzeniesienia = suma / 10;
            }
            nowaTablica[i] = suma % 10;

        }

        if (liczbaDoPrzeniesienia > 0) {
            int[] wiekszaTablica = new int[nowaTablica.length + 1];

            wiekszaTablica[0] = liczbaDoPrzeniesienia;

            for (int i = 1; i < wiekszaTablica.length; i++) {
                wiekszaTablica[i] = nowaTablica[i - 1];

            }
            return wiekszaTablica;
        }

        return nowaTablica;
    }
}
