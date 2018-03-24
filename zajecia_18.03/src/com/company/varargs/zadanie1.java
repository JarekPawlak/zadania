package com.company.varargs;
/*
*ZADANIE #1*
Utwórz metodę, która wykorzystuje mechanizm *varargs* by przekazać do metody dowolną, większą od zera, liczbę
elementów typu `int` i zwrócić ich sumę.
 */

public class zadanie1 {
    public static void main(String[] args) {
        int[] tablica = new int[]{1, 2, 3, 4, 5, 6};
        int suma = sumujLiczby(1, tablica);
        System.out.println(suma);

        suma = sumujLiczby(5, 7,8);
        System.out.println(suma);
    }

    private static int sumujLiczby(int pierwsza, int... liczby) {
        int suma = pierwsza;

        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        return suma;
    }
}