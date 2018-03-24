/*
Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca sumę wszystkich elementów
 */
public class TablicaSUma {
    public static void main(String[] args) {
        int tablica[] = new int[]{3, 6, 9, 2, 89};
        System.out.println(zwracaSumeWartosci(tablica));

    }

    private static int zwracaSumeWartosci(int[] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma = suma+tablica[i];
        }
        return suma;
    }
}
