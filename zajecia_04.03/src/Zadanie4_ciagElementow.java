/*Utwórz metodę, która przyjmuje dwa parametry oraz *wyświetla* ciąg elementów.
Pierwszy parametr metody określa wyświetlany element, a drugi parametr liczbę wystąpień,
        > Dla `9, 5` wyświetli: `9 99 999 9999 99999`
        >
        > dla `3, 3` wyświetli: `3 33 333`
        >
        > dla `8 4` wyświetli: `8 88 888 8888`
        */
public class Zadanie4_ciagElementow {
    public static void main(String[] args) {
        wyswietl(9, 5);

    }

    private static void wyswietl(int liczba, int ileRazy) {
        int licznik=0;
        while (licznik<ileRazy) {// wyswietla piec 9 bo zaczyna liczyc od 0
            int licznikWewnatrzGrupy=0;
            while(licznikWewnatrzGrupy<=licznik) {// ta petla odpowiada za ilosc elementow (9) w grupie
                System.out.print(liczba);
                licznikWewnatrzGrupy++;
            }
            System.out.print("_");
            licznik++;
        }
    }
}
