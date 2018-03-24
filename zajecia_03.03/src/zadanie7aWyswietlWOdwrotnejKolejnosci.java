//public class Zadanie7a {
    //metoda w któej petlą wyświetlisz wszsytkie liczby od 9 do 0 ( tj. w kolejnosci odwrotnej)
//9,8,7,6,5,4,3,2,1,0

import java.util.Scanner;

    public class zadanie7aWyswietlWOdwrotnejKolejnosci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj zakres: ");
            int limit = scanner.nextInt();
            Kolejnosc(limit);

        }

        private static void Kolejnosc(int limit) {
            for (int i= 0 ; i <=limit; i++) {
                System.out.print(i+",");

            }
        }
    }

