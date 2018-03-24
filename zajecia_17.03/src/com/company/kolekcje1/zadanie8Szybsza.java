package com.company.kolekcje1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Utwórz metodę, która przyjmuje dwa parametry - listę liczb (np. `ArrayList`)
oraz indeks za którym należy “przeciąć” tablicę i zwrócić drugą część.
> Dla `3` oraz `<1, 7, 8, 22, 10, -2, 33>`
> powinno zwrócić `<10, -2, 33>`
 */
public class zadanie8Szybsza {
    public static void main(String[] args) {
        List<Integer> lista = wypelnijListe(10);
        System.out.println(lista);
        System.out.println(podzielona(lista, 3));
        System.out.println(szybciejPodzielona(lista, 3));
    }

    private static List<Integer> szybciejPodzielona(List<Integer> lista, int podzielony) {
        return lista.subList(podzielony + 1, lista.size());// dzieki subList jest szybciej
    }

    private static List<Integer> wypelnijListe(int rozmiar) {
        Random r = new Random();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < rozmiar; i++) {
            temp.add(r.nextInt(30)-10);// to daje zakres od <-10 do 10>
        }
        return temp;// zwraca liste liczb
    }

    private static List<Integer> podzielona(List<Integer> lista, int podzielony) {// metoda przyjmuje dwa paarmetry: pierwszy lista liczb bo Integer a drugim parametrem jest liczba całkowita (int) i zwraca liste liczb
        List<Integer> listaKoncowa = new ArrayList<>();
        for (int i = podzielony + 1; i < lista.size(); i++) {
            listaKoncowa.add(lista.get(i));//dodaje do listy podzielonej wartosc z listy

        }
        return listaKoncowa;
    }
}



