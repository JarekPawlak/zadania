///utworz metode do ktorej przekazujesz dwa parametry min, max, a nastepnie wyswietlasz wszystkie liczby z podanego przedzialu

import java.util.Scanner;

public class zadanie8WyswietlZZakresuMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj min: ");
        int min = scanner.nextInt();
        System.out.println("Podaj max: ");
        int max = scanner.nextInt();
        podajPrzedzial(min, max);
//        petla(min, max);
        if(max<min){
            podajPrzedzial(max, min);
                    } else {
            podajPrzedzial(min, max);

        }
        System.out.println();
    }

//    private static void petla(int min, int max){
//        for (int i = max; i >= min; i--) {
//            System.out.print(i);
//        }
//    }
    private static void podajPrzedzial(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.print(i + ",");

        }
    }

    }


