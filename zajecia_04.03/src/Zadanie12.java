/**
 * Utwórz metodę, która przyjmuje trzy parametry - tablicę oraz dwie liczby.
 * Metoda ma zwrócić nową tablicę do której na wybranej pozycji (drugi parametr) wstawi nowy element (trzeci parametr).
 * > Dla `([1, 2, 3, 4, 5], 2, 77)`
 * > powinno zwrócić `[1, 2, 77, 3, 4, 5]`
 */

public class Zadanie12 {
    public static void main(String[] args) {
        int tablica[] = new int[]{1, 5, 7, 90, 98};
        wyswietlTablice(tablica);
        wyswietlTablice(podstawLiczbe(tablica, 3, 12));
    }

    private static void wyswietlTablice(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ",");
        }
        System.out.println();
    }

    private static int [] podstawLiczbe(int[] tablica, int indeks, int liczba) {
        int licznik = 0;
        int nowaTablica[] = new int[tablica.length + 1]; // ma byc dluzsza o jedno miejsce niz tablica pierwsza
        for (int i = 0; i < tablica.length; i++) {
            if (indeks == i) {
                nowaTablica[licznik] = liczba;

                licznik++;
            }
             nowaTablica[licznik]=tablica[i];
            licznik++;
                }
                return nowaTablica;
            }
        }