//package com.company.OBIEKTY3;
//
//import java.util.Random;
//
///*
//Utwórz klasę `Tablica` służącą do obsługi tablicy jednowymiarowej z możliwością dynamicznej zmiany rozmiaru.
//*konstruktor:*
//* jednoparametrowy (przyjmujący początkowy rozmiar tablicy)
//
//*pole:*
//* będące tablicą, ale z modyfikatorem `private`
//
//*metody umożliwiające:*
//* Wstawienie elementu na koniec
//* Zwrócenie rozmiar tablicy
//* Wyświetlenie tablicy
//* Rozszerzenie tablicy o wybraną liczbę pozycji na końcu (domyślnie o `1`)
//* Wstawienie elementu na początek
//* Wstawienie elementu pod wybranym indeksem
//* Usunięcie elementu pod wybranym indeksem
//* Zwrócenie największego elementu w tablicy
// */
//public class Tablica {
//    private int tablica[];
//
//    Tablica(int rozmiar) {
//        tablica = new int[rozmiar];
//
//    }
//
//    void wyswietlTablice() {
//        System.out.print("[");
//        for (int liczba : tablica) {// petla for(INT- typ elementu w zbiorze LICZBA-element w iteracji : TABLICA-zbior) {}
//            System.out.print(liczba + ", ");
//
//        }
//        System.out.println("\b\b]");
//    }
//
//    void wstawPodIndeks(int indeks, int wartosc) {
//        tablica[indeks] = wartosc;
//    }
//
//    void wstawNaPoczatek (int wartosc,){
//        rozszerzTablice();
//        wstawPodIndeks(0, wartosc);
//    }
//
//    void wypelnijLosowo() {
//
//        Random losuj = new Random();
//        for (int i = 0; i < tablica.length; i++) {
//            tablica[i] = losuj.nextInt(11);//losuje od 0 do 10 o jedna mniej
//        }
//    }
//
//    void rozszerzTablice() {
//        rozszerzTablice(1, true);
//    }
//
//    //* Rozszerzenie tablicy o wybraną liczbę pozycji na końcu (domyślnie o `1`)
//    void rozszerzTablice(int wartosc, boolean czyRozszerzycNaKoncu) {
//        int nowaTablica[] = new int[tablica.length + wartosc];
//
//        int przesuniecie;
//
//        if (czyNaKoniec) {
//            przesuniecie = 0;//wartosc = zero bo nie ma przesuniecia tablic
//        } else {
//            przesuniecie = wartosc;
//        }
//
//        for (int i = 0; i < tablica.length; i++) {
//            nowaTablica[i + wartosc] = tablica[i];
//        }
//        tablica = nowaTablica;
//    }
//
//
//    void wstawNaKoniec(int wartosc) {
//        rozszerzTablice();
//        wstawPodIndeks(tablica.length - 1, wartosc);
//    }
//
//
//    int rozmiarTablicy() {
//        return tablica.length;
//
//    }
//}
