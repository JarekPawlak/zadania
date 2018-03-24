package com.company.zadanie5Dziedziczenie;


public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Jan", 21);
        Osoba osoba2 = new Osoba("Ola", 18);

        Pracownik pracownik1 = new Pracownik("Ala", 32, 2400);
        Pracownik pracownik2 = new Pracownik("Marek", 48, 4000);

        Kierownik kierownik1 = new Kierownik("Maciek", 28, 10_000, 10_000);

        System.out.println(osoba1.imie + ", " + osoba1.wiek);
        System.out.println(osoba1);

        System.out.println(pracownik1.imie + ", " + pracownik1.pensja);

        System.out.println("Pensja pracownika 1: " + pracownik1.policzPensje());

        System.out.println("Pensja kierownika 1 wraz z premią: " + kierownik1.policzPensje());
    }
}