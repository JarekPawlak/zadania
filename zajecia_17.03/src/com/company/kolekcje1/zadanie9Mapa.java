package com.company.kolekcje1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
*ZADANIE #9*
Utwórz metodę, która wczytuje liczby od użytkownika do momentu podania wartości `-1`
a następnie zwraca mapę wartości, gdzie kluczem jest liczba a wartością jest liczba jej wystąpień.
 */
public class zadanie9Mapa {
    public static void main(String[] args) {
        Map<Integer, Integer> mojaMapa = wypelnijMape();
        System.out.println(mojaMapa);
    }

    private static Map<Integer, Integer> wypelnijMape() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> mapaLiczb = new HashMap<>();
        while (true) {
            int podanaLiczba = scanner.nextInt();
            if (podanaLiczba == -1) {
                break;
            }
            if (mapaLiczb.containsKey(podanaLiczba)) {// sprawdza czy ta mapa zawiera ten klucz "podanaLiczba"
                int staraWartosc = mapaLiczb.get(podanaLiczba);
                mapaLiczb.put(podanaLiczba, ++staraWartosc);// najpierw zwiekszam a pozniej daje wartosc
            } else {
                mapaLiczb.put(podanaLiczba, 1);

            }
            mapaLiczb.put(podanaLiczba, 1);// put dodaje nowy element do Mapy
        }
        return mapaLiczb;
    }
}
