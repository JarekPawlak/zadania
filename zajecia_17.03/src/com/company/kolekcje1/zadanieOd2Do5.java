package com.company.kolekcje1;

    /*
*ZADANIE #2*
Utwórz metodę, która wczytuje liczby od użytkownika do momentu podania `-1` a następnie zwraca ich
listę (np. wykorzystując implementację `ArrayList`)

*ZADANIE #3*
Utwórz metodę, która przyjmuje listę liczb, a następnie zwraca ich sumę.

*ZADANIE #4*
Utwórz metodę, która przyjmuje listę liczb, a następnie największą z nich

*ZADANIE #5*
Utwórz metodę, która przyjmuje listę liczb, a następnie zwraca różnicę pomiędzy największa a najmniejszą
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanieOd2Do5 {

        public static void main(String[] args) {

            List<Integer> listaLiczb = pobierzLiczbe();
            wyswietlListe(listaLiczb);

            int suma = sumujListe(listaLiczb);
            System.out.println("Suma liczb wynosi: " + suma);

            int najwiekszaLiczba = znajdzNajwieksza(listaLiczb);
            System.out.println("Największa liczba to: " + najwiekszaLiczba);

            int roznica = policzRoznice(listaLiczb);
            System.out.println("Różnica między największa a najmniejszą liczbą: " + roznica);
        }

        private static int policzRoznice(List<Integer> listaLiczb) {
            int najwiekszaLiczba = listaLiczb.get(0);
            int najmniejszaLiczba = listaLiczb.get(0);

            for (Integer sprawdzanaLiczba : listaLiczb) {
                if (sprawdzanaLiczba > najwiekszaLiczba) {
                    najwiekszaLiczba = sprawdzanaLiczba;
                }

                if (sprawdzanaLiczba < najmniejszaLiczba) {
                    najmniejszaLiczba = sprawdzanaLiczba;
                }
            }

//        for (int i = 0; i < listaLiczb.size(); i++) {
//            int sprawdzanaLiczba = listaLiczb.get(i);
//
//            if (sprawdzanaLiczba > najwiekszaLiczba) {
//                najwiekszaLiczba = sprawdzanaLiczba;
//            }
//
//            if (sprawdzanaLiczba < najmniejszaLiczba) {
//                najmniejszaLiczba = sprawdzanaLiczba;
//            }
//        }
            return najwiekszaLiczba - najmniejszaLiczba;
        }

        private static int znajdzNajwieksza(List<Integer> listaLiczb) {
            int i = 1;
            int najwiekszaLiczba = listaLiczb.get(0);

            while (i < listaLiczb.size()) {
                int sprawdzanaLiczba = listaLiczb.get(i);
                if (sprawdzanaLiczba > najwiekszaLiczba) {
                    najwiekszaLiczba = sprawdzanaLiczba;
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
                System.out.print("Podaj liczbę: ");
                int wczytanaLiczba = scanner.nextInt();

                if (wczytanaLiczba == -1) {
                    return mojaLista;
                }
                mojaLista.add(wczytanaLiczba);
            }
        }

        private static void wyswietlListe(List<Integer> listaLiczb) {
            for (Integer element : listaLiczb) {
                System.out.print(element + ", ");
            }
            System.out.println("\b\b");
        }
    }

