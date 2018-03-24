import java.util.Arrays;

/**
 * Utwórz metodę, która przyjmuje dwie tablice. Metoda ma zwrócić sumę podanych tablic.
 * To znaczy element na pozycji `0` z pierwszej tablicy, dodajemy do elementu na pozycji `0` z drugiej tablicy.
 * sumowanie w słupku.
 * Tablice mają być tych samych długości.

 */

public class Zadanie14a {
    public static void main(String[] args) {
        int[] tablicaA = new int[]{9, 8, 9, 4};
        int[] tablicaB = new int[]{5, 5, 4, 8};
        sumujTablice(tablicaA, tablicaB);
        System.out.println(Arrays.toString(sumujTablice(tablicaA, tablicaB)));

    }

    private static int[] sumujTablice(int[] tablicaA, int[] tablicaB) {

        int[] nowaTablica = new int[tablicaA.length];
        int liczbaDoPrzeniesienia = 0;

        for (int i = tablicaA.length - 1; i >= 0; i--) {
            int suma = tablicaA[i] + tablicaB[i] + liczbaDoPrzeniesienia;
            if (suma >= 10) {
                liczbaDoPrzeniesienia = 1;
            }
            nowaTablica[i] = suma % 10;

        }
        if (liczbaDoPrzeniesienia > 0) {
            int[] wiekszaTablica = new int[nowaTablica.length + 1];
            wiekszaTablica[0] = liczbaDoPrzeniesienia;
            for (int i = 1; i < wiekszaTablica.length; i++) {
                wiekszaTablica[i] = nowaTablica[i - 1];

            }
            return wiekszaTablica;
        }

        return nowaTablica;

    }
}


