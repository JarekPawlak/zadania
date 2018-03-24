/*Utwórz metodę, która przyjmuje dwa parametry - tablicę oraz liczbę.
Metoda ma zwrócić informację (jako wartość logiczna) czy dana liczba znajduje się w tablicy.*/


public class Zadanie8_Tablica_wartLog {
    public static void main(String[] args) {
        int[] tablica = new int[4];// tworze zmienna typu tablicowego o rozmiarze 4
        tablica[0] = 12;//wpisuje elementy w tablicy, nadaje wartosc kolejnym , domyslna wart dla int to 0
        tablica[1] = 9;//
        tablica[2] = 20;
        tablica[3] = 2;
        System.out.println(czyLiczbaIstnieje(tablica, 7));//wyswietla zwracana wartosc z metody , czy 7 znajdueje sie w tablicy
        System.out.println(czyLiczbaIstnieje(tablica, 12));

        czyLiczbaIstnieje(tablica, 7);

    }

    private static boolean czyLiczbaIstnieje(int[] tablica, int liczba) {// zwraca wartosc typu boolean
        for (int i = 0; i < tablica.length; i++) {
            if (liczba == tablica[i]) {
                return true;
            }
        }
        return false;
    }
}
