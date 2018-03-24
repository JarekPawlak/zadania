package com.company.zad7pdPracownik;
public class Main {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("adam", 24);
        pracownik1.dodajAdres("zniwna", "Lodz");
        pracownik1.dodajAdres("wolna", "wawa");
        pracownik1.dodajAdres("mokradla", "bagienne");

        Pracownik pracownik2 = new Pracownik("mirek", 20);
        pracownik2.dodajAdres("slomiana", "lodx");
        pracownik2.dodajAdres("mirabelki", "wawa");

        System.out.println(pracownik2.zwrocWszystkieAdresy());
        System.out.println(pracownik1.zwrocAktualnyAdres());
        System.out.println(pracownik2.zwrocAktualnyAdres());
        pracownik1.przedstawPracownika();

    }
}
