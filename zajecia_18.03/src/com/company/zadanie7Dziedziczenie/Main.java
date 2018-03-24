package com.company.zadanie7Dziedziczenie;


import com.company.zadanie6Dziedziczenie.Osoba;

/*
Utwórz klasę `Konto`, która zawiera pola `stan`, `numer`, `wlasciciel` (klasa `Osoba`)
oraz metody umożliwiające wpłatę, wypłatę, przelewanie środków, sprawdzenie status konta.

Utworz klasę `KontoOszczednosciowe`, które dodatkowo zawiera pole `procentOszczednosci` (dodawany za każdą transakcję)
Utworz klasę `KontoFirmowe`, które dodatkowo zawiera pole `oplataZaTransakcje` (odejmowany od stanu konta *przy każdej transakcji*)
 */
public class Main {
    public static void main(String[] args) {
//        testyKontaPrywatnego();
//        testyKontaFirmowego();
        testyKontaOszczednosciowego();
    }

    private static void testyKontaOszczednosciowego() {
        Osoba osoba2 = new Osoba("Wojtek", 30);
        KontoOszczednosciowe kontoOszczednosciowe1= new KontoOszczednosciowe(500, 504, osoba2);
        System.out.println(kontoOszczednosciowe1.stanKonta());
        kontoOszczednosciowe1.wplata(100);
        System.out.println(kontoOszczednosciowe1.stanKonta());
        kontoOszczednosciowe1.wplata(100);
        kontoOszczednosciowe1.wplata(100);
        kontoOszczednosciowe1.wplata(100);
        System.out.println(kontoOszczednosciowe1.stanKonta());
        kontoOszczednosciowe1.wplata(100);
        kontoOszczednosciowe1.wplata(100);
        kontoOszczednosciowe1.wplata(100);
        System.out.println(kontoOszczednosciowe1.stanKonta());


    }

    private static void testyKontaFirmowego() {
        Osoba osoba2 = new Osoba("Wojtek", 30);
        KontoFirmowe kontoFirmowe1 = new KontoFirmowe(5000, 502,osoba2);
        KontoFirmowe kontoFirmowe2= new KontoFirmowe(6000,503,osoba2);
        System.out.println(kontoFirmowe1.stanKonta());
        kontoFirmowe1.wyplata(500);
        System.out.println(kontoFirmowe1.stanKonta());
        kontoFirmowe1.wplata(500);
        System.out.println(kontoFirmowe1.stanKonta());
        kontoFirmowe1.przelewSrodkow(500,kontoFirmowe2);
        System.out.println(kontoFirmowe1.stanKonta());
    }

    private static void testyKontaPrywatnego() {
        Osoba osoba1 = new Osoba("Michal", 21);
        Konto konto1 = new Konto(2000, 500, osoba1);
        Konto konto2 = new Konto(3000, 501, osoba1);

        System.out.println(konto1.stanKonta());
        konto1.wplata(200);
        System.out.println(konto1.stanKonta());
        konto1.wyplata(400);
        System.out.println(konto1.stanKonta());
        konto1.wyplata(5000);
        System.out.println(konto1.stanKonta());
        String komunikat = konto1.przelewSrodkow(500, konto2);
        System.out.println(komunikat);
        System.out.println(konto1.stanKonta());
        System.out.println(konto2.stanKonta());
        String komunikat2 = Konto.przelewMiedzyKontami(500, konto1, konto2);
        System.out.println(komunikat2);
    }
}