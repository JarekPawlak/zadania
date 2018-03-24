package com.company.kolekcje1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
*ZADANIE #7*
Utwórz metodę, która przyjmuje listę liczb, a następnie zwraca listę, która będzie zawierała dwie listy.
 Na pozycji `0` mają być elementy parzyste, a na pozycji `1` elementy nieparzyste.
 */
public class zadanie7 {
    public static void main(String[] args) {
        List<Integer> pierwotnaLista = wypelnijListe(10);
        wyswietlListe(pierwotnaLista);
        List<List<Integer>> podzielonaLista = podzielListe(pierwotnaLista);//wygeneruje podwojna liste z liczbami parzystymi i nieparzystymi
        System.out.println(podzielonaLista);

    }

    private static List<List<Integer>> podzielListe(List<Integer> pierwotnaLista) {
        List<Integer> listaParzystych = new ArrayList<>();
        List<Integer> listaNieparzystych = new ArrayList<>();
        List<List<Integer>> podzielonaLista = new ArrayList<>();

        for (int i = 0; i < pierwotnaLista.size(); i++) {
            int liczba = pierwotnaLista.get(i);
            if (liczba % 2 == 0) {
                listaParzystych.add(liczba);
            } else {
                listaNieparzystych.add(liczba);
            }
        }
        podzielonaLista.add(listaParzystych);
        podzielonaLista.add(listaNieparzystych);
        return podzielonaLista;

    }

    private static void wyswietlListe(List<Integer> wypelnijListe) {
        System.out.println(wypelnijListe);
    }

    private static List<Integer> wypelnijListe(int zakres) {
        Random r = new Random();
        List<Integer> nowaLista = new LinkedList<>();//zamiast ArrayList
        for (int i = 0; i < zakres; i++) {
            nowaLista.add(r.nextInt(10));
        }
        return nowaLista;
    }
}
