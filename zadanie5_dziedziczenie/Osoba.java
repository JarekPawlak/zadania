package com.company.Weekend_2018_03_17_18_Listy_Mapy_Sety.zadanie6_dziedziczenie;

/*
*ZADANIE #5*
Utwórz klasę `Osoba`, która zawiera pola `imie`, `wiek`
 */

public class Osoba {
    protected String imie;
    protected int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }


}
