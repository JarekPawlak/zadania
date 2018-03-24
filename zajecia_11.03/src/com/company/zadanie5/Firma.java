package com.company.zadanie5;

import java.util.ArrayList;
import java.util.List;

/*
Utwórz klasę `Firma` posiadającą listę (`ArrayList()`) osób (*z powyższego zadania 5*) oraz metody umożliwiające:
* wyświetlenie listy pracowników
* zwrócenie pracownika który zarabia najwięcej
* zwrócenie najstarszego pracownika
* zwrócenie liczby pracowników starszych niż podana wartość
* przyznanie podwyżki procentowej (np. podnieść wszystkim o 10%)
* przyznanie podwyżki kwotowej (np. wszystkim o 500 zł)
* przyznanie podwyżki kwotowej do podanej kwoty)
*
 */
public class Firma {
    // List <pracownik> list = new AArrayList<>();

    private List<Pracownik> listaPracownikow = new ArrayList<>();// private zeby uzytkownik nie mowgl tego modyfikowac

    void wyswietleniListyPracownikow() {
        for (int i = 0; i < listaPracownikow.size(); i++) {
            Pracownik pracownik = listaPracownikow.get(i);
            System.out.printf("%s %s %s \n", pracownik.getImie(), pracownik.getNazwisko(), pracownik.getPensja());

        }
    }

    void dodajPracownika(Pracownik p1) {
        listaPracownikow.add(p1);

    }

    Pracownik najlepiejOplacany() {
        int najwyzszaPensja = listaPracownikow.get(0).getPensja();
        int indeks = 0;
        for (int pozycja = 0; pozycja < listaPracownikow.size(); pozycja++) {
            Pracownik p = listaPracownikow.get(pozycja);
            if (najwyzszaPensja < p.getPensja()) {
                najwyzszaPensja = p.getPensja();
                indeks = pozycja;
            }

        }
        return listaPracownikow.get(indeks);
    }

    void ktoDostaniePremie(int procentPodwyzki) {

        for (int i = 0; i < listaPracownikow.size(); i++) {
            Pracownik p = listaPracownikow.get(i);
            p.setPensja(p.getPensja() * procentPodwyzki / 100 + p.getPensja());

        }
    }

    void najnizszaKrajowa(int minimalnaPensja) {
        for (int i = 0; i < listaPracownikow.size(); i++) {
            Pracownik p = listaPracownikow.get(i);
            if (p.getPensja() < minimalnaPensja) {
                p.setPensja(minimalnaPensja);
            }
        }
    }
}


