package com.company.kolekcje1;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/*

*ZADANIE #10*
Utwórz metodę, która przyjmuje trzy parametry. Pierwszy - liczba liczb do wylosowania, druga to początek
zakresu losowania, trzecia to koniec zakresu losowania. Metoda ma zwrócić mapę gdzie kluczem jest liczba
a wartością jest liczba jej wystąpień.

 */
public class zadanie10Mapy {
    public static void main(String[] args) {
        Map<Integer, Integer> nowaMapa = generujMape(210_000_000, -2, 2);
        System.out.println(nowaMapa);
        wyswietlMape(nowaMapa);
    }

    private static void wyswietlMape(Map<Integer, Integer> nowaMapa) {
        for (Map.Entry<Integer, Integer> element : nowaMapa.entrySet()) {
            System.out.println(element.getKey() + "\t-->\t" + element.getValue());
        }
    }

    private static Map<Integer, Integer> generujMape(int liczbaLiczb, int min, int max) {
        Random r = new Random();
        Map<Integer, Integer> wygenerowanaMapa = new TreeMap<>();

        for (int i = 0; i < liczbaLiczb; i++) {
            int losowaLiczba = r.nextInt(max - min + 1) + min;

            if (wygenerowanaMapa.containsKey(losowaLiczba)) {
                wygenerowanaMapa.put(losowaLiczba, wygenerowanaMapa.get(losowaLiczba) + 1);
            } else {
                wygenerowanaMapa.put(losowaLiczba, 1);
            }
        }
        return wygenerowanaMapa;
    }
}