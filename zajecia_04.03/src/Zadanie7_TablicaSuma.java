/*Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca SUMĘ wszystkich elementów

        *ZADANIE #6*
        Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca ŚREDNIĄ wszystkich elementów
*/

public class Zadanie7_TablicaSuma {
    public static void main(String[] args) {
        int[] tablica = new int[]{11, -7, 23, 15, 9};
        sumaElementow(tablica);
    }

    private static void sumaElementow(int[] tablica) {
        int zbieracz = 0;         // zbieracz czyli inaczej suma
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
            zbieracz += tablica[i];  // inaczej zbieracz=zbieracz+tablica[i] lub suma=suma+tablica[i]
        }
        System.out.println("Suma: " + zbieracz);
        System.out.println("Srednia: " + zbieracz / tablica.length);
    }
}
