import java.util.Arrays;

import static java.lang.System.*;

/*
Utwórz metodę, która zwraca tablicę o podanym rozmiarze wypełnioną kolejnymi wartościami:

Dla 4 zwróci: [0, 1, 2, 3]

Dla 8 zwróci: [0, 1, 2, 3, 4, 5, 6, 7]
 */
public class TablicaWyswietl {
    public static void main(String[] args) {
        int tablica[] = new int[9];


        wypelnijTablice(tablica);
        out.println(Arrays.toString(tablica));

    }

    private static int[] wypelnijTablice(int[] tablica) {

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i;
        }
        return tablica;

    }
}
