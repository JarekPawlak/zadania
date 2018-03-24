///*
//Utwórz metodę, do której przekazujesz jeden parametr i zwraca sumę wszystkich elementów od 1 do podanej liczby
//
//dla 3 zwróci 1 + 2 + 3 = 6
//
//dla 5 zwróci 15 bo 1 + 2 + 3 + 4 + 5 = 15
//
//dla 11 zwróci 66 bo 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 = 66
// */
public class ForZwracaWartosc {
    public static void main(String[] args) {
        int liczba = 5;
        zwracaSume(liczba);
        System.out.println(zwracaSume(liczba));
    }

    private static int zwracaSume(int liczba) {
        int suma = 0;
        for (int i = 1; i <= liczba; i++) {
            suma = suma + i;
            System.out.printf(i + "+");
        }
//        System.out.println("\b");
        return suma;
//        System.out.println("=");
//        System.out.print(suma);
//    }
    }
}


