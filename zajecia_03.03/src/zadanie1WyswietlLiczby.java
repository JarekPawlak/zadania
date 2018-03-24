/*
Utwórz metodę, w której pętlą (typu FOR) wyświetlisz wszystkie liczby od 0 do 18 (włącznie).

0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18
 */
public class zadanie1WyswietlLiczby {
    public static void main(String[] args) {
        petla();
            }
    private static void petla(){
//        int numer = 1;
        for (int numer = 0; numer<=18; numer++){
//            numer++;
            System.out.print(numer + ",");

        }
    }
}
