package com.company.varargs;

/*
*ZADANIE #3*
Utwórz metodę, która wykorzystuje *varargs* by przekazać do metody dowolną, większą od zera, liczbę elementów typu
`String` i zwrócić jeden napis sklejony z nich.
 */

public class Zadanie3 {
    public static void main(String[] args) {
        String wynik = sklejTekst("Mam", "na", "imię", "Jarek!");
        System.out.println(wynik);
    }

    private static String  sklejTekst(String pierwszyTekst, String... dalszyTekst) {
        String wynik = pierwszyTekst;

        for (String tekst : dalszyTekst) {
            wynik += " " + tekst;         //wynik = wynik + tekst;
        }
        return wynik;
    }
}