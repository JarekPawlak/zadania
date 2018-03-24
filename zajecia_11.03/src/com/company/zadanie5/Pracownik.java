package com.company.zadanie5;

//Utwórz klasę `Pracownik` posiadającą
//        *pola reprezentujące:*
//        * imie
//        * drugie imie
//        * nazwisko
//        * wiek
//        * płeć (`true` = kobieta, `false` = mężczyzna)
//        * pensję
//        * adres (z poprzedniego zadania)*gettery & settery**
//      *następujące kostruktory:*
//        * bezparametrowy
//        * 2-parametrowy (przyjmujący imię, nazwisko i płeć)
//  *metody zwracające:*
//        * imie, drugie imie (jeśli istnieje!) i nazwisko (jako jeden string)
//        * płec w formie tekstowej (tzn. `Kobieta` lub `Mężczyzna`)
//        * liczbę lat pozostałych do emerytury (dla `Kobiet` 60, dla `Mężczyzn` 65)

import java.util.Scanner;

public class Pracownik {


    private String imie;
    private String nazwisko;
    private int pensja;
    private int wiek;
    private boolean plec;

    public Pracownik() {

    }

    public Pracownik(String imie, String nazwisko, int pensja, int wiek, boolean plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
        this.wiek = wiek;
        this.plec = plec;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public String getImie() {

        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getPensja() {
        return pensja;
    }

    public int getWiek() {
        return wiek;
    }

    public boolean isPlec() {
        return plec;
    }

    public void imieINazwisko() {
        System.out.printf("%s %s (l.%s) [%s]", imie, nazwisko, wiek,
                plec ? "K" : "M");
    }

    public void plecTekst() {
        System.out.printf("%s", plec ? "Kobieta" : "Mężczyzna");
    }

    public int ileDoEmerytury() {
        return (plec ? 60 : 65) - wiek;
    }

    public void wczytajPracownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię pracownika:");
        imie = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika:");
        nazwisko = scanner.nextLine();
        System.out.println("Podaj pensję pracownika:");
        pensja = scanner.nextInt();
        System.out.println("Podaj wiek pracownika:");
        wiek = scanner.nextInt();
        System.out.println("Podaj płeć pracownika:");
        plec = scanner.nextBoolean();

    }

}
