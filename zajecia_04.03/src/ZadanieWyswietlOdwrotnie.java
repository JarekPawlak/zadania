/*
Utwórz metodę, w której pętlą wyświetlisz wszystkie liczby od liczby przekazanej jako parametr do 0 (tj. w kolejności malejącej).

Dla 9 wyświetli 9, 8, 7, 6, 5, 4, 3, 2, 1, 0

Dla 4 wyświetli 4, 3, 2, 1, 0
 */
public class ZadanieWyswietlOdwrotnie {
    public static void main(String[] args) {
        int liczba = 9;
        wyswietlOdwrotnie(liczba);

    }

    private static void wyswietlOdwrotnie(int liczba) {
        for (int i = liczba; i >=0; i--) {
            System.out.print(i+",");
        }
    }
}
