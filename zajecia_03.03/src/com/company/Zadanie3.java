package com.company;
// utworz metode przyjmujaca jeden parametr i wyswietla wszystkie potegi dwojki nie przekraczajace podanego parametru

public class Zadanie3 {
    public static void main(String[] args) {
        int liczba = 20;
        potegaLiczba(liczba);

    }

    private static void potegaLiczba(int liczba) {

        for (int i = 1; i < liczba; i*=2) {
            System.out.println(i);

        }
    }
}
