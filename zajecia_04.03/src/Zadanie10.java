import java.util.Arrays;

/**
 * Utwórz metodę, która jako parametr przyjmuje tablicę
 * i *zwraca nową tablicę* z liczbami w odwrotnej kolejności.

 */


public class Zadanie10 {
    public static void main(String[] args) {
        int [] tablica = new int [] {1,2,3,73};
        System.out.println(Arrays.toString(zwracaTablice(tablica)));

    }

    private static int [] zwracaTablice(int[] tablica) {
        int [] nowaTablica = new int [tablica.length];
        for (int i = 0; i < tablica.length; i++) {
            nowaTablica[i]=tablica[tablica.length-i-1];
        }
        return nowaTablica;
    }
}
