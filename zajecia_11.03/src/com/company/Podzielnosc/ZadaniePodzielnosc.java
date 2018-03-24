package com.company.Podzielnosc;
/*
Utwórz klasę Podzielnosc przyjmujacą w konstruktorze liczbę do sprawdzenia.
Liczba powinna być przechowywana w formie tablicy wartości typu int (czyli liczba 1234 ma zostać zamieniona na tablicę [1, 2, 3, 4]).

By konwertować liczbę na wartości, możesz najpier zamieniać liczbę na tablicę napisów (drugia linia),
a następnię pętlą rzutować każdy ze znaków na liczbę (czyli napis "5" na liczbę 5):

int x = 1234567;
String[] tablicaNapisow = Integer.toString(x).split("");
int[] tablicaLiczb = new int[tablicaNapisow.length];

for (int i = 0; i < tablicaLiczb.length; i++) {
   tablicaLiczb[i] = Integer.parseInt(tablicaNapisow[i]);
}


Klasa Powinna posiadać metody umożliwiające sprawdzenie podzielności w zakresie od 1 do 10;
Czyli powinna posiadać metody (zwracające boolean!):

podzielnaPrzez1()
podzielnaPrzez2()
podzielnaPrzez3()
. . .
podzielnaPrzez9()
podzielnaPrzez10()



Przetestuj działanie w nowej klasie. Na przykład uruchom pętlę od 10 do 40 i dla każdej liczby wyświetl podzielność w formie:

10 -> 1, 2, 5, 10
11 -> 1, 11
12 -> 1, 2, 3, 4, 6, 12
13 -> 1, 13
14 -> 1, 2, 7, 14
...
 */
import java.util.Scanner;

public class ZadaniePodzielnosc {
    public ZadaniePodzielnosc() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe i sprawdzę czy jest podzielna przez 2: ");
        int a = scanner.nextInt();
        boolean wynik = sprawdzPodzielnosc2(a);
        System.out.println(wynik);

    }

    private static boolean sprawdzPodzielnosc2(int a) {
        if (a % 2 == 0) {
            return true;
        } else{
            return false;
        }
    }

//
//    int x = 1234567;
//    String[] tablicaNapisow = Integer.toString(x).split("");
//    int[] tablicaLiczb = new int[tablicaNapisow.length];
//
//for (int i = 0; i < tablicaLiczb.length; i++) {
//        tablicaLiczb[i] = Integer.parseInt(tablicaNapisow[i]);
    }


