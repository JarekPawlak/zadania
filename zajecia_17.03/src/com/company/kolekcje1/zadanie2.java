package com.company.kolekcje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*ZADANIE #2*
Utwórz metodę, która wczytuje liczby od użytkownika do momentu podania `-1`
a następnie zwraca ich listę listę (np. wykorzystując implementację `ArrayList`)

*ZADANIE #3*
Utwórz metodę, która przyjmuje listę liczb, a następnie zwraca ich sumę.

*ZADANIE #4*
Utwórz metodę, która przyjmuje listę liczb, a następnie największą z nich

*ZADANIE #5*
Utwórz metodę, która przyjmuje listę liczb, a następnie zwraca różnicę pomiędzy największa a najmniejszą.
 */
public class zadanie2 {
    public static void main(String[] args) {
        List<Integer> listaLiczb = pobierzLiczbe();
        wyswietlListe(listaLiczb);
        sumujListe(listaLiczb);
        int suma = sumujListe(listaLiczb);
        System.out.println("Suma liczb wynosi: " + suma);
        int najwiekszaLiczba = znajdzNajwiekszLiczba(listaLiczb);
        System.out.println("Najwieksza liczba to: " + najwiekszaLiczba);
        int roznica = policzRoznice(listaLiczb);
        System.out.println("Roznica miedzy najwieksza i najmniejsza liczba to: "+ roznica);


        for (Integer element : listaLiczb) {
            System.out.print(element);
        }

    }

    private static int policzRoznice(List<Integer> listaLiczb) {
        int najwiekszaLiczba = listaLiczb.get(0);
        int najmniejszaLiczba = listaLiczb.get(0);

        for (Integer sprawdzanaLiczba:listaLiczb){// zamiast petli for lepsza jest petla foreach
            if (sprawdzanaLiczba > najwiekszaLiczba) {
                najwiekszaLiczba = sprawdzanaLiczba;
            }
            if (sprawdzanaLiczba<najmniejszaLiczba){
                najmniejszaLiczba=sprawdzanaLiczba;
            }
        }


//        for (int i = 0; i < listaLiczb.size(); i++) {
//            int sprawdzanaLiczba = listaLiczb.get(i);
//            if (sprawdzanaLiczba > najwiekszaLiczba) {
//                najwiekszaLiczba = sprawdzanaLiczba;
//            }
//            if (sprawdzanaLiczba<najmniejszaLiczba){
//                najmniejszaLiczba=sprawdzanaLiczba
//            }
//        }
        return najwiekszaLiczba-najmniejszaLiczba;
    }

    private static int znajdzNajwiekszLiczba(List<Integer> listaLiczb) {
        int i = 1;
        int najwiekszaLiczba = listaLiczb.get(0);

        while (i < listaLiczb.size()) {
            int sprawdzanaLiczba = listaLiczb.get(i);
            if (sprawdzanaLiczba > najwiekszaLiczba) {
                najwiekszaLiczba = listaLiczb.get(i);
            }
            i++;
        }
        return najwiekszaLiczba;
    }

    private static int sumujListe(List<Integer> listaLiczb) {
        int suma = 0;
        for (int i = 0; i < listaLiczb.size(); i++) {
            suma += listaLiczb.get(i);

        }
        return suma;
    }


    private static List<Integer> pobierzLiczbe() {
        List<Integer> mojaLista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj liczbe: ");
            int wczytanaLiczba = scanner.nextInt();
            if (wczytanaLiczba == -1) {
                break;
            }
            mojaLista.add(wczytanaLiczba);
        }
        return mojaLista;
    }

    private static void wyswietlListe(List<Integer> listaLiczb) {
        for (Integer element : listaLiczb) {
            System.out.print(element + "'");
        }
        System.out.println("\b\b");
    }
}