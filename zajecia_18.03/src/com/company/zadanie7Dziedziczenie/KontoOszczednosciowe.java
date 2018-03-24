package com.company.zadanie7Dziedziczenie;

import com.company.zadanie6Dziedziczenie.Osoba;

public class KontoOszczednosciowe extends Konto {
    private int bonus = 10;
    private int licznik = 0;

    public KontoOszczednosciowe(int stan, int numerRachunku, Osoba osoba) {
        super(stan, numerRachunku, osoba);
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean wplata(int wplaconaKwota) {
        licznik++;
        if (licznik % 3 == 0 && licznik<=3) {
            wplaconaKwota += bonus;
        }
        return super.wplata(wplaconaKwota);
    }

}