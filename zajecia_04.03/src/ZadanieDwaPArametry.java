/*
Utwórz metodę, do której przekazujesz dwa parametry (np min i max) a następnie wyswietlasz wszystkie liczby z podanego przedziału

Dla 1, 5 wyświetli 1, 2, 3, 4, 5

Dla 18, 22 wyświetli 18, 19, 20, 21, 22
 */
public class ZadanieDwaPArametry {
    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        wyswietlZPrzedzialu(min,max);

    }

    private static void wyswietlZPrzedzialu(int min, int max) {
        for (int i = min; i <=max ; i++) {
            System.out.print(i+",");

        }
        System.out.println("\n dupa");
    }
}
