
import java.util.Arrays;

/**
 * Utwórz metodę, która przyjmuje dwie tablice. Metoda ma zwrócić sumę podanych tablic.
 * To znaczy element na pozycji `0` z pierwszej tablicy, dodajemy do elementu na pozycji `0`
 * z drugiej tablicy. Tablice mają być tych samych długości.
 * >`[1,  2,  3,  4]`
 * >`[5,  6,  7,  8]`
 * >`[6,  8, 10, 11]`
 */

class Zad14c {
    public static void main(String[] args) {
        int[] pierwsza = new int[]{2, 3, 4, 6};
        int[] druga = new int[]{9, 2, 7, 6, 1};
        System.out.println(Arrays.toString(policzSume(druga, pierwsza)));

    }

    private static int[] dopasujRozmiarDoNowejTablicyDluzsza(int[] pierwsza, int[] druga) {
        if (pierwsza.length > druga.length) {
            return new int[pierwsza.length];
        } else {
            return new int[druga.length];
        }
    }

    private static int[] policzSume(int[] pierwsza, int[] druga) {
        int[] dluzsza = zwrocDluzszaTablice(pierwsza, druga);
        int[] krotsza = zwrocKrotszaTablice(pierwsza, druga);
        int[] trzecia = new int[dluzsza.length];
        int liczbdoprzeniesienia = 0;
        int suma = 0;
        int i = dluzsza.length - 1;
        int j = krotsza.length - 1;
        for (; i >= 0; i--, j--) {
            if (j >= 0) {
                suma = dluzsza[i] + krotsza[j] + liczbdoprzeniesienia;
            } else {
                suma = dluzsza[i] + liczbdoprzeniesienia;
            }
            liczbdoprzeniesienia = 0;
            if (suma >= 10) {
                liczbdoprzeniesienia = suma / 10;
            }
            trzecia[i] = suma % 10;
        }
        if (liczbdoprzeniesienia > 0) {
            int[] wiekszaTablica = new int[trzecia.length + 1];
            wiekszaTablica[0] = liczbdoprzeniesienia;
            for (int z = 1; z < wiekszaTablica.length; z++) {
                wiekszaTablica[z] = trzecia[z - 1];
            }
            return wiekszaTablica;
        }
        return trzecia;
    }

    private static int[] zwrocKrotszaTablice(int[] pierwsza, int[] druga) {
        return pierwsza.length < druga.length ? pierwsza : druga;
    }

    private static int[] zwrocDluzszaTablice(int[] pierwsza, int[] druga) {
        return pierwsza.length > druga.length ? pierwsza : druga;
    }

}