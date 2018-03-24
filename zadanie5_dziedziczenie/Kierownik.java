package com.company.Weekend_2018_03_17_18_Listy_Mapy_Sety.zadanie6_dziedziczenie;

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
