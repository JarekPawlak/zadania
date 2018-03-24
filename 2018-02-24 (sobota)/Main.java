package pl.maciejczapla;

public class Main {

    /**
     * "Główna" metoda naszej klasy
     * Od metody main rozpoczyna się wykonywanie kodu naszego programu.
     */
    public static void main(String[] args) {
        showMyName();
        myFavouriteNumber();
        new Number();
        specialChars();
        specialChars2();
        quiz();
        myName();

//////////////////////////////////////////

        int powResult = pow(2);
        System.out.println(powResult);

        System.out.println(pow(3));

////////////////////////////////////////

        int addingResult = add(10, 20);
        System.out.println(addingResult);

        System.out.println(add(10, 20));

//////////////////////////////////////////

        // metoda nic nie zwraca, ale wyświetla wewnątrz siebie
        calculate(9, 3);

//////////////////////////////////////////

        boolean checkingResult = checkIfGreat(151);
        System.out.println(checkingResult);

        System.out.println(checkIfGreat(2));

//////////////////////////////////////////

//        System.out.println(czyParzysta(2));

        int liczba = 11;
        boolean wynik = czyParzysta(liczba);
        System.out.println(wynik);
    }

    /**
     * Zwrócenie informacji (w postaci wartości logicznej)
     * czy przekazana liczba jest parzysta
     */
    private static boolean czyParzysta(int liczba) {
//        return  liczba %2 ==0;

        if (liczba % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Zwrócenie informacji (w postaci wartości logicznej)
     * czy przekazany parametr (typu int) jest większy od 20
     */
    private static boolean checkIfGreat(int number) {
        if (number >= 20) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Wyświetlenie (bez zwracania!) czterech działań
     * wykonanych na przekazanych parametrach
     */
    private static void calculate(int a, int b) {
        System.out.printf("%s + %s = %s\n", a, b, a + b);
        System.out.printf("%s - %s = %s\n", a, b, a - b);
        System.out.printf("%s * %s = %s\n", a, b, a * b);
        System.out.printf("%s / %s = %s\n", a, b, a / b);
    }

    /**
     * Zwrócenie sumy przekazanych (dwóch) parametrów
     */
    private static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    /**
     * Zwrócenie trzeciej potęgi liczby (przekazanego parametru)
     */
    private static int pow(int number) {
        return number * number * number;
    }

    /**
     * Wyświetlenie zawartości zmiennej
     */
    private static void myName() {
        String imie = "Maciej";
        System.out.println(imie);
    }

    /**
     * Kolejność wykonywania działań
     */
    private static void quiz() {
        // 21
        System.out.println(1 + 1 + "1");
        // 111
        System.out.println("1" + 1 + 1);
        // 12
        System.out.println("1" + (1 + 1));
    }

    /**
     * Wyświetlenie napisu na konsoli, który zawiera znaki specjalne
     */
    private static void specialChars2() {
        System.out.println("Mam na imie \"Maciej\", a mój pies nazywa się \\ Azor \\");
    }

    /**
     * Przetestowanie działanie znaków specjalnych
     * wewnątrz napisów: \b, \t, \n
     */
    private static void specialChars() {
        System.out.println("Ala ma \n ko\bta");
    }

    /**
     * Wyświetlenie napisu na konsoli, w dwóch liniach
     */
    private static void showMyName() {
        System.out.println("Maciej ąęść");
        System.out.println("Maciej");
    }

    /**
     * Metoda wyświetlająca napis oraz liczbę (w jednym wyrażeniu)
     */
    private static void myFavouriteNumber() {
        System.out.println("My favourite number: " + 256);
    }

    /**
     * Wyświetlenie zakresu wybranych zakresów liczbowych (byte, short, int, long)
     */
    private static void numberRanges() {
        System.out.println("Najmniejsza wartość typu BYTE to: " + Byte.MIN_VALUE);
        System.out.println("Największa wartość typu BYTE to: " + Byte.MAX_VALUE);

        System.out.println("Najmniejsza wartość typu SHORT to: " + Short.MIN_VALUE);
        System.out.println("Największa wartość typu SHORT to: " + Short.MAX_VALUE);

        System.out.println("Najmniejsza wartość typu INT to: " + Integer.MIN_VALUE);
        System.out.println("Największa wartość typu INT to: " + Integer.MAX_VALUE);

        System.out.println("Najmniejsza wartość typu LONG to: " + Long.MIN_VALUE);
        System.out.println("Największa wartość typu LONG to: " + Long.MAX_VALUE);
    }
}