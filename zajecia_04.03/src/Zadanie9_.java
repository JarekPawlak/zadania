/*Utwórz metodę, która przyjmuje dwa parametry - tablicę oraz liczbę.
        Metoda ma zwrócić indeks szukanego elementu.
        Gdy dana liczba nie będzie znajdować się w tablicy,
        metoda powinna zwrócić wartość `-1`.
*/
public class Zadanie9_ {
    public static void main(String[] args) {
        int[] tablica = new int[]{1, 2, 3};
        System.out.println(zwracaIndeks(tablica,7));
        System.out.println(zwracaIndeks(tablica,1));
        System.out.println(zwracaIndeks(tablica,3));
    }

    private static int zwracaIndeks(int[] tablica, int poszukiwanaLiczba) {
        for (int i = 0; i < tablica.length; i++) {
            if (poszukiwanaLiczba == tablica[i]) {
                return i;
            }
        }
        return -1;
    }

}
