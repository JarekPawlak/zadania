package com.company.zadanie5Dziedziczenie;

    public class Pracownik extends Osoba {
        int pensja;

        public Pracownik(String imie, int wiek, int pensja) {
            super(imie, wiek);
            this.pensja = pensja;
        }

        @Override
        public String toString() {
            return String.format("imie: %s, wiek: %s, pensja: %s", imie, wiek, pensja);
        }

        public int policzPensje (){
            return pensja;
        }
    }


