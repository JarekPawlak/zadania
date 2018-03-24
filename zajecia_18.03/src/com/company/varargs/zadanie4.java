//package com.company.varargs;
//
//import com.sun.xml.internal.fastinfoset.algorithm.IntegerEncodingAlgorithm;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
///*
//*ZADANIE #4*
//Utwórz metody które będą testować czas działania dwóch implementacji listy (tzn. `List`) - `ArrayList` i `LinkedList`.
//Do pomiaru czasu wykorzystaj `System.currentTimeMillis();`. Sprawdź czas:
//> wstawiania na koniec (np. 500_000 elementów)
//> wstawiania na początek (np. 500_000 elementów)
//> wybierania po indeksie (tzn. 500_000 razy pobierz element pod jakimś indeksem)
//> sumowania wszysch elementów przy wykorzystaniu pętli - for
//> sumowania wszysch elementów przy wykorzystaniu pętli - foreach
// */
//public class zadanie4 {
//    public static void main(String[] args) {
//
//        List<Integer> arrayList = new ArrayList<>();
//        List<Integer> linkedList = new LinkedList<>();
//        System.out.println("ArrayList");
//        wstawNaKoniec(arrayList, 10_000_000);
//        System.out.println("LinkedList");
//        wstawNaKoniec(linkedList, 10_000_000);
//        wstawNaPoczatek(new ArrayList<>(),500_000);
//    }
//
//    private static void wstawNaPoczatek(List<Integer>list, int liczbaElementow) {
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < ; i++) {
//
//        }
//    }
//
//    private static void wstawNaKoniec(List<Integer> list, int liczbaElementow) {
//        long start=System.currentTimeMillis();//zwraca ilosc milisekund od 01 stycznia 1970 r.?
//        for (int i = 0; i < liczbaElementow; i++) {
//            list.add(i);//domyslan metoda .add wstawia na koniec
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("Czas wykonania: "+(end-start));
//
//    }
//}
//
