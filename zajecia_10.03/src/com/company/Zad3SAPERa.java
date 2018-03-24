
package com.company;
import java.util.Random;

public class Zad3SAPERa {

    public static void main(String[] args) {
        narysujPlansze(10, 15);

    }

    private static void narysujPlansze(int wysokosc, int szerokosc) {
        boolean tablica[][] = wypelnijPlansze(wysokosc, szerokosc);
        wyswietlPlansze(tablica);
        System.out.println();
        int[][] nowaTablica = wypelnijCyframi(tablica);
        wyswietlPlansze(nowaTablica);

    }

    private static void wyswietlPlansze(int[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[0].length; j++) {
                if (tablica[i][j] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print(tablica[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static int[][] wypelnijCyframi(boolean[][] tablica) {
        int[][] cyfry = new int[tablica.length][tablica[0].length];
        for (int i = 0; i < cyfry.length; i++) {
            for (int j = 0; j < cyfry[0].length; j++) {
                if (tablica[i][j]) {
                    cyfry[i][j] = -1;
                } else {
                    cyfry[i][j] = poziomNiebezpieczenstwa(tablica, i, j);
                }

            }
        }
        return cyfry;
    }

    private static int poziomNiebezpieczenstwa(boolean[][] tablica, int wiersz, int kolumna) {
        int liczbaBomb = 0;
        for (int i = wiersz - 1; i <= wiersz + 1; i++) {
            for (int j = kolumna - 1; j <= kolumna + 1; j++) {
                if (i >= 0 &&
                        i < tablica.length &&
                        j >= 0 &&
                        j < tablica[0].length &&
                        tablica[i][j]) {
                    liczbaBomb++;
                }
            }
        }
        return liczbaBomb;
    }


    private static void wyswietlPlansze(boolean[][] plansza) {
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[0].length; j++) {
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
        Random bomby = new Random();
        boolean plansza[][] = new boolean[wysokosc][szerokosc];

        for (int liczbaBomb = 0; liczbaBomb < wysokosc * szerokosc / 2; liczbaBomb++) {
            int x = bomby.nextInt(wysokosc);
            int y = bomby.nextInt(szerokosc);
            if (plansza[x][y]) {
                liczbaBomb--;
                continue;
            }
            plansza[x][y] = true;

        }
        return plansza;
    }
}
