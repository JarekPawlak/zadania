package com.company.varargs;

/*
*ZADANIE #2*
Utwórz metodę, która przyjmuje trzy parametry - boolean oraz dowolną liczbę (większą od 0) liczb (typu `int`). Gdy
pierwszy parmametr ma wartość `true` metdoa zwraca największą przekazaną liczbą, a gdy `false` najmniejszą.
 */

public class Zadanie2 {
    public static void main(String[] args) {
        int wynik = zwrocMinLubMax(false, 6, 2, 8, 4);
        System.out.println(wynik);
    }

    private static int zwrocMinLubMax(boolean czyMax, int pierwsza, int... liczby) {
        int wynik = pierwsza;

        for (int sprawdzanaLiczba : liczby) {
            if (czyMax && sprawdzanaLiczba > wynik) {
                wynik = sprawdzanaLiczba;
            } else if (!czyMax && sprawdzanaLiczba < wynik) {
                wynik = sprawdzanaLiczba;
            }
        }

//        for (int i = 0; i < liczby.length; i++) {
//            int sprawdzanaLiczba = liczby[i];
//
//            if (czyMax && sprawdzanaLiczba > wynik) {
//                wynik = sprawdzanaLiczba;
//            } else if (!czyMax && sprawdzanaLiczba < wynik) {
//                wynik = sprawdzanaLiczba;
//            }
//        }
        return wynik;
    }
}