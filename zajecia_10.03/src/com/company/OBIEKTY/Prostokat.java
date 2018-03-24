package com.company.OBIEKTY;

/*
Utwórz klasę `Rectangle` (`Prostokąt`) posiadającą
*pola reprezentujące:*
- dłuższy bok
- krótszy bok

*metody służące do:*
- policzenia obwodu
- policzenia pola powierzchni
- porównania czy pola powierzchni dwóch przekazanych prostokątów
    są takie same (zwracająca wartość `boolean`)
 */
public class Prostokat {// klasa Prostokat
    int dluzszyBok;// to jest pole w klasie Prostokat
    int krotszyBok;

    Prostokat(int dluzszyBok, int krotszyBok) {
        this.dluzszyBok = dluzszyBok;// this odwołanie do obecnego obiektu, szuka pol w calej klasie a nie tylko w metodzie
        this.krotszyBok = krotszyBok;

    }

    int policzObwod() {
        return 2 * dluzszyBok + 2 * krotszyBok;
    }

    int policzPole() {
        return dluzszyBok * krotszyBok;

    }

    static boolean porownajProstokaty(Prostokat pl, Prostokat p2) {// te nazwy Prostokat p1 obowiazuja tylko w tej metodzeie
        if (pl.policzPole() == p2.policzPole()) {
            return true;
        }
        return false;
    }
}
