package pl.maciejczapla;

import java.util.Scanner;

/**
 * Utwórz metodę, do której przekazujesz trzy parametry a ona zwróci informację czy **chociaż jeden z nich** jest większy o ponad 10 od którejś z pozostałych.
 */

public class Zadanie5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe A: ");
        int a = scanner.nextInt();

        System.out.print("Podaj liczbe B: ");
        int b = scanner.nextInt();

        System.out.print("Podaj liczbe C: ");
        int c = scanner.nextInt();

        boolean czyIstniejeNajwieksza = znajdzNajwiekszaLiczbe(a, b, c);

        System.out.println("Czy jedna z nich jest wieksza o ponad 10 od pozostałych:  "
                + czyIstniejeNajwieksza);
    }

    private static boolean znajdzNajwiekszaLiczbe(int a, int b, int c) {
        int distanse = 10;

        if (a > b + distanse
                || a > c + distanse
                || b > c + distanse
                || b > a + distanse
                || c > a + distanse
                || c > b + distanse) {

            return true;
        } else {
            return false;
        }
    }
}
