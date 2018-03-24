/*
        Utwórz klasę `Address` (`Adres`) posiadającą
        *pola reprezentujące:*
        * ulicę
        * numer domu
        * numer mieszkania
        * kod pocztowy
        * miasto

        *następujące kostruktory:*
        * bezparametrowy
        * 3-parametrowy (przyjmujący pierwsze trzy pola)
        * 5-parametrowy (przyjmujący wszystkie pola)

        *metody zwracające:*
        * pełen adres
        * ulicę (wraz z numerami)
        */
package com.company.OBIEKTY1;

public class Adres {
    String ulica;
    int nrDomu;
    int nrMieszkania;
    String kodPocztowy;
    String miasto;

    Adres() { // to jest konstruktor bezparametrowy

    }

    public Adres(String ulica, int nrDomu, int nrMieszkania, String kodPocztowy, String miasto) {//to jest konstruktor, ktory wygenerowanłem przez program
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public Adres(String ulica, int nrDomu, int nrMieszkania) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
    }

    public Adres(int nrDomu) {
        this.nrDomu = nrDomu;
    }

//    public Adres(int nrDomu) { // nie da sie dwa razy wygenerowac konstruktora ("constructor already exist"), ktory ma ta sama zmienna np typu int lub String
//        this.nrDomu = nrDomu;
//    }

    public Adres(String miasto) {
        this.miasto = miasto;

    }

    String pelenAdres() {
//        return String.format("%s %s, %s %s %s", ulica, nrDomu, nrMieszkania, kodPocztowy, miasto);
        return
                ulica + " " + nrDomu + " m." + nrMieszkania + " " + kodPocztowy + " " + miasto;
//                kodPocztowy + "" + miasto + "" + ulica + "" + nrDomu + "" + nrMieszkania;


    }
}