package com.company.kolekcje1;

import java.util.HashMap;
import java.util.Map;

/*
*ZADANIE #11*
Utwórz metodę, która przyjmuje dwa parametry - mapę (w postaci `klucz - wartość` np. `String - int`)
oraz poszukiwaną liczbę. Metoda ma zwrócić informację ile razy w mapie występuje (jako wartość) podana liczba.
 */
public class zadanie11 {
    public static void main(String[] args) {
        Map<String, Integer> mojaMapa = new HashMap<>();
        wypelnijMape(mojaMapa);
        int ileRazy = ileRazyWystepujeWMapie(mojaMapa, 21);
        System.out.println(ileRazy);
    }

    private static void wypelnijMape(Map<String, Integer> mojaMapa) {
        mojaMapa.put("Ala", 21);
        mojaMapa.put("Ola", 18);
        mojaMapa.put("Ula", 16);
        mojaMapa.put("Iza", 21);
        mojaMapa.put("Ewa", 21);

    }

    private static int ileRazyWystepujeWMapie(Map<String, Integer> mojaMapa, int szukanaWartosc) {
        int licznik = 0;

        for (Map.Entry<String, Integer> element : mojaMapa.entrySet()) {// petla for each, parametr "element" użyty na potrzeby tej pętli
            if (element.getValue() >= szukanaWartosc) {
                licznik++;
            }
        }
        return licznik;

    }

}

