//metoda w któej petlą wyświetlisz wszsytkie liczby od 9 do 0 ( tj. w kolejnosci odwrotnej)
//9,8,7,6,5,4,3,2,1,0

import java.util.Scanner;

public class zadanie7WyswietlWOdwrotnejKolejnosci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres: ");
        int i = scanner.nextInt();
        odwrotnaKolejnosc(i);

    }

    private static void odwrotnaKolejnosc(int i) {
        for ( ; i >=0; i--) {
            System.out.print(i+",");

        }
    }
}
