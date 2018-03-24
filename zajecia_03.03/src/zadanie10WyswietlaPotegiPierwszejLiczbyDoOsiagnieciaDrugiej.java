/*
Utwórz metodę, do której przekazujesz dwa parametry.
Metoda ma wyświetlić wszystkie potęgi pierwszej liczby do momentu przekroczenia drugiej liczby.

dla 3, 100 wyświetli:

0 -> 1
1 -> 3
2 -> 9
3 -> 27
4 -> 81 (kolejny krok dałby 243, więc przekroczyłby 100)
dla 4, 300 wyświetli:

0 -> 1
1 -> 4
2 -> 14
3 -> 64
4 -> 256 (kolejny krok dałby 1024, więc przekroczyłby 300)
 */
import java.util.Scanner;

public class zadanie10WyswietlaPotegiPierwszejLiczbyDoOsiagnieciaDrugiej {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe1: ");
        int liczba = scanner.nextInt();
        System.out.println("Podaj liczbe2: ");
        int max = scanner.nextInt();
        potegaLiczb(liczba, max);

//        for (int i = 0, j=5; i < 10; i++, System.out.print(i));
    }

    private static void potegaLiczb(int liczba, int max) {
        int potega = 1;
        for (int i = 0; potega < max; i++) {
            System.out.println(i + " -> " + potega);
            potega *=liczba;
        }
    }
}
