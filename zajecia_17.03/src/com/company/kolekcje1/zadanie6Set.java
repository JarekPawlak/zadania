package com.company.kolekcje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
*ZADANIE #6*
Utwórz metodę, która przyjmuje dwa parametry - listę liczb (np. `ArrayList`) oraz poszukiwaną liczbę.
Metoda ma zwrócić listę indeksów pod którymi występuje poszukiwana liczba.
Uzytkownik podaje ile liczb ma podac, podaje liczbe poszukiwana, a program zwraca liste indeksow pod ktorymi kryje sie szukana liczbe.
Dodatkowo stworz metode ktora podswietli indeksy z szukana liczba - chodzi o wizualizacje wyniku zadania.
 - podaj liczbe elementow
 - wczytaj element
 */
public class zadanie6Set {

        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int liczbaElementow = pobierzLiczbeElementow();
            int poszukiwanaLiczba = pobierzPoszukiwana();

            List<Integer> mojaLista = uzupelnijListe(liczbaElementow);

            List<Integer> listaIndeksow = znajdzPoszukiwaneIndeksy(mojaLista, poszukiwanaLiczba);

            wyswietlInaczej(mojaLista, listaIndeksow);
        }

        private static void wyswietlInaczej(List<Integer> mojaLista,
                                            List<Integer> listaIndeksow) {

            for (int indeks = 0; indeks < mojaLista.size(); indeks++) {
                System.out.print(mojaLista.get(indeks) + "\t");
            }
            System.out.println();
            int drugiIndeks = 0;
            if (listaIndeksow.isEmpty()) {
                System.out.println("nie ma takiej liczby w tej tablicy ;( ");
                return;
            }
            for (int indeks = 0; indeks < mojaLista.size(); indeks++) {
                if (indeks == listaIndeksow.get(drugiIndeks)) {
                    System.out.print("x\t");
                    drugiIndeks++;
                    if (drugiIndeks == listaIndeksow.size()) {
                        break;
                    }
                } else {
                    System.out.print("\t");
                }
            }
        }

        private static List<Integer> znajdzPoszukiwaneIndeksy(List<Integer> mojaLista, int poszukiwanaLiczba) {
            List<Integer> listaIndeksow = new ArrayList<>();
            for (int indeks = 0; indeks < mojaLista.size(); indeks++) {
                if (mojaLista.get(indeks) == poszukiwanaLiczba) {
                    listaIndeksow.add(indeks);
                }
            }
            return listaIndeksow;
        }

        private static int pobierzPoszukiwana() {
            System.out.print("podaj poszukiwana liczbę: ");
            return scanner.nextInt();
        }

        private static List<Integer> uzupelnijListe(int liczbaElementow) {
            Random r = new Random();
            List<Integer> uzupelnionaLista = new ArrayList<>();
            for (int i = 0; i < liczbaElementow; i++) {
                uzupelnionaLista.add(i, r.nextInt(15));
            }
            return uzupelnionaLista;
        }

        private static int pobierzLiczbeElementow() {
            System.out.print("podaj liczbe elementow do wczytania: ");
            return scanner.nextInt();
        }
    }

