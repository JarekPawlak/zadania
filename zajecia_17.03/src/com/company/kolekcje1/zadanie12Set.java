package com.company.kolekcje1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Utwórz metodę, która która przyjmuje set (np. `HashSet`)
i zwraca jego rozmiar (tzn. liczbę elementów)
 */
public class zadanie12Set {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(17);
        set.add(15);
        set.add(15);
        set.add(13);
        System.out.println(set);
        System.out.println(set.size());

    }


}

