package com.company.OBIEKTY4;

//
//Utwórz klasę `Pobieranie` służącą do pobierania danych z konsoli.
//        *metody:*
//        * `pobierzInt()`
//        * `pobierzString()`
//
//        Dodaj możliwość przekazania wartości logicznej,
// od której zależy wyświetlenie komunikatu na konsoli
// (np. `Podaj wartość typu String: `).
//        Użytkownik może zadeklarować obiekt nowo utworzonej klasy
// u siebie w projekcie:
//
//        ```Pobieranie p = new Pobieranie();
//        p.pobierzInt(true)```
// Użytkownik podaje ile liczb chce wczytać i metoda zwraca mu tablice


import java.util.Scanner;

public class Pobieranie {
    private Scanner myScanner;

    public Pobieranie(){
        myScanner = new Scanner(System.in);
    }

    public int[] pobierzTabliceInt(int size){
        int[] myInts = new int[size];

        for (int i = 0; i < size; i++) {
            myInts[i] = pobierzInt(true);
        }

        return myInts;
    }

    public String[] pobierzTabliceString(int size){
        String[] myStrings = new String[size];

        for (int i = 0; i < size; i++) {
            myStrings[i] = pobierzString(true);
        }

        return myStrings;
    }

    public int pobierzInt(boolean info){
        if(info){
            System.out.print("Podaj wartość typu int: ");
        }

        System.out.println();

        int value = myScanner.nextInt();
        myScanner.nextLine();
        return value;
    }

    public String pobierzString(boolean info){
        if(info){
            System.out.print("Podaj wartość typu String: ");
        }

        return myScanner.nextLine();
    }
}
