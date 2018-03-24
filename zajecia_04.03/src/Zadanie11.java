/**
 * Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca nową tablicę
 * z liczbami w odwrotnej kolejności.
 * *Nie wolno utworzyć nowej tablicy - należy pracować na tej wejściowej.*
 */
public class Zadanie11 {

    public static void main(String[] args) {
        int[] tablica = new int[]{4, 7, 12, -8, 3, 6};
        wyswietlTablice(tablica);
        wyswietlTablice(zwracaTablice(tablica));
    }

    private static void wyswietlTablice(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ",  ");
        }
        System.out.println();
    }

    private static int[] zwracaTablice(int[] tablica) {

        for (int i = 0; i < tablica.length / 2; i++) {
            int tymczasowa = tablica[i];
            tablica[i] = tablica[tablica.length - i - 1];
            tablica[tablica.length - i - 1] = tymczasowa;

        }
        return tablica;
    }
}
