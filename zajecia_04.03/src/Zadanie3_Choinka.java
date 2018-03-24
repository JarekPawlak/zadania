/*Utwórz metodę, która przyjmuje jeden parametr (który jest liczbą wierszy ) oraz wyświetla “choinkę” nie przerywając numerowania
        > Dla `4` wyświetli:
        >
        1
        2 3
        4 5 6
        7 8 9 10
        ```
        >
        > Dla `6` wyświetli:
        >
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        16 17 18 19 20 21```
*/
public class Zadanie3_Choinka {
    public static void main(String[] args) {
        choinka(6);

    }

    private static void choinka(int wysokosc) {
        int licznikKolumny = 0;
        int rosnacaLiczba = 1;

        while (licznikKolumny <= wysokosc) {
          int licznikWiersze=0;
            while (licznikWiersze < licznikKolumny) {
                System.out.print("\t" + rosnacaLiczba);
                rosnacaLiczba++;
                licznikWiersze++;
            }
            System.out.println();
            licznikKolumny++;
        }

    }
}