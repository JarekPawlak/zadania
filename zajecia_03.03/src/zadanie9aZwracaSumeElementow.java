import java.util.Scanner;

public class zadanie9aZwracaSumeElementow {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj min: ");
        int min = klawiatura.nextInt();
        System.out.println("Podaj max: ");
        int max = klawiatura.nextInt();
        int suma = policz(min, max);
        System.out.println(suma);
    }

    private static int policz(int min, int max) {
        int suma = 0;
        for (int i = min; i <=max ; i++) {
           suma = suma+i;
           }
           return suma;

    }

}
