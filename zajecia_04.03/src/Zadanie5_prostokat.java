/*Utwórz metodę, która wyświetli prostokąt o podanych wymiarach (użytkownik podaje  jego wymiary jako parametry)
        ```XXXXXXXXXX
        X        X
        X        X
        XXXXXXXXXX```
*/
package com.company;

public class Zadanie5_prostokat {
    public static void main(String[] args) {
        narysujProstokat(4, 15);
    }

    private static void narysujPodstawe(int szerokosc) {
        int licznik = 0;
        String znak = "x";
        while (licznik < szerokosc) {
            System.out.print(znak + " ");
            licznik++;
        }
        System.out.println();
    }

    private static void narysujProstokat(int wysokosc, int szerokosc) {
        narysujPodstawe(szerokosc);
        narysujSrodek(wysokosc, szerokosc);
        narysujPodstawe(szerokosc);
    }

    private static void narysujSrodek(int wysokosc, int szerokosc) {
        String znak = "x";
        int licznik = 0;
        while (licznik < wysokosc - 2) {
            int nowyLicznik = 0;
            System.out.print(znak);
            while (nowyLicznik < szerokosc - 2) {
                System.out.print("  ");
                nowyLicznik++;
            }
            System.out.println(" " + znak);
            licznik++;
        }
    }
}