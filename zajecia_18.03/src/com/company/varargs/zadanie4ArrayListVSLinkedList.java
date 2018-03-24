package com.company.varargs;

import java.util.ArrayList;
        import java.util.LinkedList;
        import java.util.List;

/*
Utwórz metody które będą testować czas działania dwóch implementacji listy (tzn. `List`) - `ArrayList` i `LinkedList`.
 Do pomiaru czasu wykorzystaj `System.currentTimeMillis();`. Sprawdź czas:

  wstawiania na koniec (np. 500_000 elementów)
  wstawiania na początek (np. 500_000 elementów)
  wybierania po indeksie (tzn. 500_000 razy pobierz element pod jakimś indeksem)
  sumowania wszysch elementów przy wykorzystaniu pętli - for
  sumowania wszysch elementów przy wykorzystaniu pętli - foreach
 */
public class zadanie4ArrayListVSLinkedList {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("ArrayList:");
        wstawNaKoniec(arrayList, 10_000_000);
        System.out.println("LinkedList:");
        wstawNaKoniec(linkedList, 10_000_000);
//
//        System.out.println();
//
//        System.out.println("ArrayList:");
//        wstawNaPoczatek(new ArrayList<>(), 100_000);
//        System.out.println("LinkedList:");
//        wstawNaPoczatek(new LinkedList<>(), 100_000);

        System.out.println();
//
//        System.out.println("ArrayList:");
//        wybierzpoIndeksie(arrayList);
//        System.out.println("LinkedList:");
//        wybierzpoIndeksie(linkedList);

//        System.out.println("ArrayList:");
//        wybierzPoIndeksieForEach(arrayList);
//        System.out.println("LinkedList:");
//        wybierzPoIndeksieForEach(linkedList);

        System.out.println();

        System.out.println("ArrayList:");
        wstawNaSrodku(arrayList, 1_000);
        System.out.println("LinkedList:");
        wstawNaSrodku(linkedList, 1_000);


    }

    private static void wstawNaSrodku(List<Integer> list, int ileElementow) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < ileElementow; i++) {
            list.add(list.size() / 2, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Czas wstawiania do środka listy: " + (end - start) + " ms");
    }

    private static void wybierzpoIndeksie(List<Integer> list) {
        long suma = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            suma += list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Suma elementów " + suma);
        System.out.println("Czas wybierania po indeksie: " + (end - start) + " ms");

    }

    private static void wybierzPoIndeksieForEach(List<Integer> list) {
        long suma = 0;
        long start = System.currentTimeMillis();
        for (int i : list) {
            suma += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Suma elementów " + suma);
        System.out.println("Czas sumowania elementów (forEach): " + (end - start) + " ms");

    }

    private static void wstawNaKoniec(List<Integer> list, int liczbaElementow) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < liczbaElementow; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Czas wstawiania na koniec: " + (end - start) + " ms");
    }

    private static void wstawNaPoczatek(List<Integer> list, int liczbaElementow) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < liczbaElementow; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Czas wstawiania na poczatek: " + (end - start) + " ms");
    }


}