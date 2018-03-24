import java.util.Arrays;

/**
 * Utwórz metodę, która przyjmuje dwa parametry - tablicę oraz liczbę.
 * Metoda ma usunąć z podanej tablicy element o wybranym indeksie i zwrócić nową tablicę.
 * > Dla `([1, 2, 3, 4, 5],  2)`
 * > zwróci `[1, 2, 4, 5]`
 */

public class Zadanie13 {
    public static void main(String[] args) {
        int[] tablica = new int[5];
        tablica[0] = -12;
        tablica[1] = 22;
        tablica[2] = 8;
        tablica[3] = 5;
        tablica[4] = 0;

        int liczba = 3;
        usunElement(tablica, liczba);
        System.out.println(Arrays.toString(usunElement(tablica, liczba)));
    }

    private static int[]usunElement(int[] tablica, int liczba) {
        int[] mniejszaTablica = new int[tablica.length - 1];// ma byc krotsza o jedno miejsce niz tablica pierwsza
        int licznik = 0;
        for (int i = 0; i < mniejszaTablica.length; i++) {
            if (liczba == i) {
                licznik++;
            }
            mniejszaTablica[i] = tablica[licznik];
            licznik++;
        }
        return mniejszaTablica;
    }
}