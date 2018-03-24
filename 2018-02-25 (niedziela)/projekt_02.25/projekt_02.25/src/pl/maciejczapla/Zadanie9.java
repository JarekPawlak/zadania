package pl.maciejczapla;

import java.util.Scanner;

/**
 * Utwórz metodę, do której przekazujesz liczbę,
 * która jest numerem dnia tygodnia, a program
 * powinien wyświetlić nazwę tego dnia.
 */
public class Zadanie9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer dnia tygodnia: ");
        int numerDniaTygodnia = scanner.nextInt();

        switch (numerDniaTygodnia) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;


            default:
                System.out.println("Błedny numer dnia tygodnia!");
        }

    }

}
