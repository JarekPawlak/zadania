package com.company.domZad7Pracownik;
/*
Utwórz klasę Pracownik zawierający pola imie, wiek oraz listę
(np. ArrayList) adresów (klasa Address). W klasie Pracownik dodaj metody

zwrocWszystkieAdresy()
zwrocAktualnyAdres() (który będzie zawsze na pozycji 0 w liście)
dodajNowyAdres() (powinien być dodawany na pozycji 0)
przedstawPracownika()
 */

import java.util.ArrayList;
import java.util.List;

public class Pracownik {
    private String imie;
    private int wiek;
    private List<List<String>> adresyPracownika = new ArrayList<>();

    public void przedstawPracownika() {
        System.out.printf("nasz pracownika ma na imię %s, ma %s lat, oraz zamieszkuje aktualnie pod adresem: %s", imie, wiek, zwrocAktualnyAdres());
    }

    public List<String> zwrocAktualnyAdres() {
        return adresyPracownika.get(0);
    }

    public List<List<String>> zwrocWszystkieAdresy() {
        return adresyPracownika;
    }

    public void dodajAdres(String ulica, String miasto) {
        Adres adr = new Adres(ulica, miasto);
        List<String> dodajAdrespracownika = new ArrayList<>();
        dodajAdrespracownika.add(ulica);
        dodajAdrespracownika.add(miasto);
        adresyPracownika.add(0, dodajAdrespracownika);
    }

    public Pracownik(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
}
