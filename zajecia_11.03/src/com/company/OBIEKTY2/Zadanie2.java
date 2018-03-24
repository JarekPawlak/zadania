package com.company.OBIEKTY2;

public class Zadanie2 {
    public static void main(String[] args) {
        Rownanie rownanie = new Rownanie(5,4,5);
        double wynik = rownanie.wykonajRownanie();
        System.out.println("wynik rownania: =" + wynik);
        System.out.println("a wynosi: "+rownanie.getA());
        System.out.println("b wynosi: "+rownanie.getB());
        rownanie.setB(9);
        System.out.println("c wynosi: "+rownanie.getC());
        System.out.println("porownanie wartosci: " + rownanie.porownajWartosci(10_000));
    }
}
