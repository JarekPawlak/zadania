package com.company.OBIEKTY5;

public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto(1000, "Kowalski");
        konto.wyswietlStanKonta();
        konto.wplataNaRachunek(99);
        konto.wyswietlStanKonta();

        konto.wyplataZRachunku(16000);
        konto.wyswietlStanKonta();
        Konto kontoDrugie = new Konto (0, "Nowak");
        //stan konta i właścieciel to cechy konkretnego obiektu konto lub kontoDrugie
        kontoDrugie.wyswietlStanKonta();
    }
}

