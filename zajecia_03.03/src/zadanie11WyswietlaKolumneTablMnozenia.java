import java.util.Scanner;

//utworz metode, ktora przyjmuje jeden parametr oraz wyswietla dana "kolumne tabliczki mnozenia":
//dla 15 wyswietli(!)
//15*1=15
//15*2=30
public class zadanie11WyswietlaKolumneTablMnozenia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();

        tabliczkaMnozenia(liczba, 11);
//        tabliczkaMnozenia(liczba, 15);
    }

    private static void tabliczkaMnozenia(int liczba, int mnoznik) {

        for (int i = 0; i <= mnoznik; i++) {
            System.out.printf("%s*%s=%s\n", i, liczba, i * liczba);
        }
    }
}
