/*Utworz metode ktora bedzie wczytywała liczby od uzytkownika do momentu podania liczby ujemnej a nastepnie wyswietli sume
oraz srednia wszystkich podanych liczb (bez uwzglednienia tej ujemnej).*/

import java.util.Scanner;

class Zadanie1_zliczanieLiczb {
    public static void main(String[] args) {
        System.out.print("Podaj liczbe: ");
        zliczanieLiczb();
    }

    private static void zliczanieLiczb() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int ostatniaWartoscZeScanera;
        double licznik =0;

        while (true) {
            ostatniaWartoscZeScanera = scanner.nextInt();
                        if (ostatniaWartoscZeScanera<0){
                            break;
                        }
            suma = suma +ostatniaWartoscZeScanera;
        licznik++; //albo: licznik+=1;
        }
        System.out.println("Twoja średnia: "+suma/licznik);
        System.out.println("Twoja suma: "+suma);
    }
}
