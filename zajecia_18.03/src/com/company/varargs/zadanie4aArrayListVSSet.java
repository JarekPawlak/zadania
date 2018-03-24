package com.company.varargs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zadanie4aArrayListVSSet {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        System.out.println("ArrayList:");
        wstawNaKoniec(lista, 10_000_000);
        System.out.println("Set:");
        wstawNaKoniecSet(set, 10_000_000);


    }
    private static void wstawNaKoniec(List<Integer> list, int liczbaElementow) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < liczbaElementow; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Czas wstawiania na koniec: " + (end - start) + " ms");
    }

    private static void wstawNaKoniecSet(Set<Integer> set, int liczbaElementow) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < liczbaElementow; i++) {
            set.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Czas wstawiania na koniec (set): " + (end - start) + " ms");
    }


}
