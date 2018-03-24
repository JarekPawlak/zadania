package com.company.zadanie5Dziedziczenie;

public class Kierownik extends Pracownik {
    int premia;

    public Kierownik(String imie, int wiek, int pensja, int premia) {
        super(imie, wiek, pensja);
        this.premia = premia;
    }

    @Override
    public int policzPensje() {
        return super.policzPensje() + premia;
    }
}
