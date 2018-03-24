package com.company.kolekcje1;

import java.util.ArrayList;
import java.util.List;

/*
Utwórz metodę, która przyjmuje listę (`List`) np. `ArrayList` elementów typu `String`
a następnie zwraca listę w odwróconej kolejności.
 */
public class zadanie1 {
    public static void main(String[] args) {
        List<String> mojaLista=new ArrayList<>();
        mojaLista.add("Pierwszy");
        mojaLista.add("Drugi");
        mojaLista.add("Trzeci");
        mojaLista.add("Czwarty");
        mojaLista.add("Piąty");

        wyswietlTablice(mojaLista);
        odwrocListe(mojaLista);
        wyswietlTablice(mojaLista);

    }

    private static void wyswietlTablice(List<String> mojaLista) {
        for (int i = 0; i < mojaLista.size(); i++) {
            System.out.print(mojaLista.get(i)+",");
        }
        System.out.println();
    }
    private static void odwrocListe(List<String> mojaLista) {
        for (int pozycja = 0; pozycja < mojaLista.size()/2; pozycja++) {//mojaLista.size dzielona przez 2 aby przerwac petle w polowie
            String tymczasowyElement = mojaLista.get(pozycja);// do tymczasowej wartosci wkladamy pozycje nr 1 z listy
            int ostatniaPozycja=mojaLista.size()-1-pozycja;// -1 bo numerujemy od 0,
            mojaLista.set(pozycja,mojaLista.get(ostatniaPozycja));
            mojaLista.set(ostatniaPozycja,tymczasowyElement);
        }
    }
}
