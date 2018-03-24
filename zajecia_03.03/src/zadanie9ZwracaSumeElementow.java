//metoda do ktorej przekazujesz jeden parametr i zwraca sume wszystkich elementow od 1 do podanej liczby.
// Dla 3 zwroci 1+2+3=6

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class zadanie9ZwracaSumeElementow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        System.out.println(sumaElementow(liczba));
    }

    private static int sumaElementow(int liczba) {
        int suma = 0;
        for (int licznik = 0; licznik <= liczba; licznik++) {
            suma = suma + licznik;
            System.out.print(licznik+ "+");
        }
        System.out.println("\b");
        return suma;

    }
    }
