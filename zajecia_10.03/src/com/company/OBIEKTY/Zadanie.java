package com.company.OBIEKTY;
/*
Utwórz klasę `Rectangle` (`Prostokąt`) posiadającą
*pola reprezentujące:*
- dłuższy bok
- krótszy bok

*metody służące do:*
- policzenia obwodu
- policzenia pola powierzchni
- porównania czy pola powierzchni dwóch przekazanych prostokątów są takie same (zwracająca wartość `boolean`)
 */

public class Zadanie {
    public static void main(String[] args) {
        Prostokat mojProstokat = new Prostokat(108, 1);
        System.out.println("Dłuższy bok: " + mojProstokat.dluzszyBok);
        System.out.println("Obwód prostokąta: " + mojProstokat.policzObwod());
        System.out.println("Pole prostokąta: " + mojProstokat.policzPole());

        Prostokat drugiProstokat = new Prostokat(12, 9);
        System.out.println("Obwód drugiego prostokata: " + drugiProstokat.policzObwod());
        System.out.println("Pole drugiego prostokata: " + drugiProstokat.policzPole());

        boolean wynik = Prostokat.porownajProstokaty(mojProstokat,drugiProstokat);
        System.out.println(wynik ? "Pola prostokatów są równe": "Pola prostokątów nie są równe");
    }

}
