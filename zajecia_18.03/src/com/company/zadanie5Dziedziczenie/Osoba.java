package com.company.zadanie5Dziedziczenie;


/*
*ZADANIE #5*
Utwórz klasę `Osoba`, która zawiera pola `imie`, `wiek`.
Następnie utwórz klasę `Pracownik`, która zawiera dodatkowe pola `pensja`.
Następnie utwórz klasę `Kierownik`, która rozszerza klasę `Pracownik`
i posiada dodatkowe pole `premia`.
Utwórz obiekt jednej i drugiej klasy oraz przetestuj działanie.
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
