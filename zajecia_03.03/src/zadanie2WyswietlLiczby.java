import com.sun.org.apache.xpath.internal.SourceTree;
/*
Utwórz metodę, w której pętlą wyświetlisz wszystkie liczby od 0 do wartości podanej przez użytkownika
(przekazywanej jako parametr do tej metody)

gdy użytkownik poda 3 wyświetl 0, 1, 2, 3

gdy użytkownik poda 9 wyświetl 0, 1, 2, 3, 4, 5, 6, 7, 8, 9

gdy użytkownik poda 18 wyświetl 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18
 */
import java.util.Scanner;

public class zadanie2WyswietlLiczby {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę: ");
//        int liczba = scanner.nextInt ();
//
//wyswietl(liczba);
//    }
//    private static void wyswietl(int liczba) {
//        for (int i = 0; i <= liczba; i++) {
//            System.out.print(i);
Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
int liczba = scanner.nextInt();
scanner.nextLine();
String separator = scanner.nextLine();
wypiszLiczby(liczba, separator);

        System.out.println();
     wypiszLiczby(liczba);
            }

    private static void wypiszLiczby(int liczba) {
        String domyslnySeparator = ",";
        wypiszLiczby(liczba,domyslnySeparator);
    }

    private static void wypiszLiczby(int max, String separator) {
        for (int liczba = 0; liczba <= max; liczba++) {
            System.out.print(liczba+separator);

        }

    }
}
