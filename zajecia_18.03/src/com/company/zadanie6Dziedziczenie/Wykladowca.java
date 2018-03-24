package com.company.zadanie6Dziedziczenie;

public class Wykladowca extends Osoba {
    private Uczelnia uczelnia;

    public Wykladowca(String imie, int wiek) {
        super(imie, wiek);
    }

    public void setUczelnia(Uczelnia uczelnia) {

        this.uczelnia = uczelnia;
    }

    @Override
    public String toString() {
        if (uczelnia != null) {
            return "Wykladowca{" +
                    "uczelnia=" + uczelnia +
                    ", imie='" + imie + '\'' +
                    ", wiek=" + wiek +
                    '}';
        } else {
            return "Wykladowca{" +
                    "imie='" + imie + '\'' +
                    ", wiek=" + wiek +
                    '}';
        }
    }
}