package com.company;
/*
narysuj sapera
*/

import java.util.Random;

public class Zad3SAPER {
    public static void main(String[] args) {
        int wysokosc = 3;
        int szerokosc = 8;
        narysujPlansze(wysokosc, szerokosc);


    }

    private static void narysujPlansze(int wysokosc, int szerokosc) {
        boolean[][] plansza = wypelnijPlansze(wysokosc, szerokosc);
        wysietlPlansze(plansza);
        int[][] tablicaCyfrowa = wypelnijCyframi(plansza);
        wyswietlPlanszeCyfrowa(tablicaCyfrowa);
    }

    private static void wyswietlPlanszeCyfrowa(int[][] tablicaCyfrowa) {
        for (int i = 0; i < tablicaCyfrowa.length; i++) {
            for (int j = 0; j < tablicaCyfrowa[0].length; j++) {
                if (tablicaCyfrowa[i][j] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print(tablicaCyfrowa[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static int[][] wypelnijCyframi(boolean[][] plansza) {
        int cyfry[][] = new int[plansza.length][plansza[0].length];                         //tworzymy kolejna tablice wypelnioną cyframi,
        for (int i = 0; i < cyfry.length; i++) {
            for (int j = 0; j < cyfry[0].length; j++) {
                if (plansza[i][j]) {
                    cyfry[i][j] = -1;
                } else {
                    cyfry[i][j] = 0;
                }

            }
        }
        return cyfry;
    }

    private static void wysietlPlansze(boolean[][] plansza) {
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[0].length; j++) {                       //zamiast 0 mogło by być i , ale wszystkie wiersze są równe, wiec mniej pamieci zajmuje
                if (plansza[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

    }

    private static boolean[][] wypelnijPlansze(int wysokosc, int szerokosc) {
        boolean[][] plansza = new boolean[wysokosc][szerokosc];
        Random random = new Random();
        for (int liczbaBomb = 0; liczbaBomb < wysokosc * szerokosc / 4; liczbaBomb++) {

            int x = random.nextInt(wysokosc);
            int y = random.nextInt(szerokosc);
            if (plansza[x][y]) {
                liczbaBomb--;
                continue;
            }
            plansza[x][y] = true;
        }
        return plansza;
    }
}