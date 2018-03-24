package com.company.zadanie7Dziedziczenie;

import com.company.zadanie6Dziedziczenie.Osoba;

public class KontoFirmowe extends Konto {
    private int oplataZaTransakcje=5;

    public KontoFirmowe(int stan, int numerRachunku, Osoba osoba) {
        super(stan, numerRachunku, osoba);
    }

    public void setOplataZaTransakcje(int oplataZaTransakcje) {
        this.oplataZaTransakcje = oplataZaTransakcje;
    }

    @Override
    public boolean wyplata(int wyplaconaKwota) {
        return super.wyplata(wyplaconaKwota+oplataZaTransakcje);
    }

    @Override
    public boolean wplata(int wplaconaKwota) {
        return super.wplata(wplaconaKwota-oplataZaTransakcje);
    }

    @Override
    public String przelewSrodkow(int kwotaPrzelewu, Konto rachunekDocelowy) {
        return super.przelewSrodkow(kwotaPrzelewu, rachunekDocelowy, oplataZaTransakcje);
    }

}
