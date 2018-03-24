package pl.maciejczapla;

/**
 * Utwórz metodę, która przyjmuje dwa parametry - pierwszy to prędkość z jaką poruszał się Twój pojazd, a drugi to dopuszczalna prędkość. Metoda ma zwrocić wartość mandatu w przypadku przekroczenia dopuszczalnej prędkości. Każde przekroczenie o **rozpoczęte** 10 km/h to 100zł. Przykłady:
 */

public class Zadanie3 {

    public static void main(String[] args) {
        int liczbaDoSprawdzenia = 16;

        int wynik = sprawdzOdleglosc(liczbaDoSprawdzenia);
        System.out.println("Odchylenie od normy wynosi: " + wynik);
    }

    private static int sprawdzOdleglosc(int liczba) {
        int MIN = 11;
        int MAX = 22;

        if (liczba >= MIN && liczba <= MAX) {
            return 0;
        } else if (liczba < MIN) {
            return MIN - liczba;
        } else {
            return MAX - liczba;
        }
    }

}
