package com.company.OBIEKTY4;

public class Main {

    public static void main(String[] args) {

        //task 3
        Pobieranie p = new Pobieranie();
        System.out.print("Podaje liczbę elementów:");
        int liczbaElementowDoPobrania = p.pobierzInt(false);

        int[] mojeLiczby = p.pobierzTabliceInt(liczbaElementowDoPobrania);

        for (int i: mojeLiczby) {
            System.out.print(i + "\t");
        }

    }
}
