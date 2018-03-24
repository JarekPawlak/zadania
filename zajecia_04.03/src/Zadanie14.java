import java.util.Arrays;

/**
 * Utwórz metodę, która przyjmuje dwie tablice. Metoda ma zwrócić sumę podanych tablic.
 * To znaczy element na pozycji `0` z pierwszej tablicy, dodajemy do elementu na pozycji `0` z drugiej tablicy.
 * Tablice mają być tych samych długości.
 * >`[1,  2,  3,  4]`
 * >`[5,  6,  7,  8]`
 * >`[6,  8, 10, 11]`
 */

public class Zadanie14 {
    public static void main(String[] args) {
        int[] tablicaA = new int[]{1, 2, 3, 4};
        int[] tablicaB = new int[]{5, 6, 7, 8};
        sumujTablice(tablicaA, tablicaB);
        System.out.println(Arrays.toString(sumujTablice(tablicaA, tablicaB)));

    }
    //metoda tworzy nową tablicę, w której sumowane są elementy z tablicaA i tablicaB
    private static int []sumujTablice(int[] tablicaA, int[] tablicaB) {
        int[] nowaTablica = new int[tablicaA.length];
        for (int i = 0; i < tablicaA.length; i++) {
            nowaTablica[i] = tablicaA[i] + tablicaB[i];
        }
        return nowaTablica;
    }
    }
