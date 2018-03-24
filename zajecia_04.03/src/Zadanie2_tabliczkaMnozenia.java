/*Utwórz metodę, która przyjmuje **jeden** parametr (który jest liczbą wierszy i kolumn)
oraz wyświetla tabliczkę mnożenia (znaki możesz oddzielać znakiem tabulacji `\t`).

        > Dla `3` wyświetli:
        >
        ```1   2   3
        2   4   6
        3   6   9
        ```
        >
        > Dla `6` wyświetli:
        >
        ```1   2   3   4   5   6
        2   4   6   8  10  12
        3   6   9  12  15  18
        4   8  12  16  20  24
        5  10  15  20  25  30
        6  12  18  24  30  36```*/


public class Zadanie2_tabliczkaMnozenia {
    public static void main(String[] args) {
        tabliczkaMnozenia(10);

    }

    private static void tabliczkaMnozenia(int rozmiar) {
        for (int i = 1; i <= rozmiar; i++) {// petla odpoaiadajaca za kolumy tabl mnozenia
            for (int j = 1; j <= rozmiar; j++) {
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }

    }
}
