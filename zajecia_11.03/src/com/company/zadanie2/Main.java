package com.company.zadanie2;

public class Main {
    public static void main(String[] args) {

        Tablica tablicaA = new Tablica(5);
        tablicaA.wyswietlTablice();

        tablicaA.wypelnijLosowo();
        tablicaA.wyswietlTablice();
//
//        tablicaA.wstawPodIndeks(3, 9);
//        tablicaA.wyswietlTablice();
//
//        tablicaA.wstawNaKoniec(2_000);
//        tablicaA.wyswietlTablice();
//
//        tablicaA.wstawNaPoczatek(5_000);
//        tablicaA.wyswietlTablice();
//
//
        tablicaA.usunPodIndeksem(2);
        tablicaA.wyswietlTablice();

        System.out.println("Najwieksza liczba z tablicy: " + tablicaA.najwiekszaLiczba());
        System.out.println("Indeks najwiekszej liczby: " + tablicaA.indeksNajwiekszejLiczby());


    }
}
