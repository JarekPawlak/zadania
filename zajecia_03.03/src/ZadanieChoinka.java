//Utwórz metodę, która przyjmuje jeden parametr (który jest liczbą wierszy ) oraz wyświetla “choinkę”
//        > Dla `4` wyświetli:
//        >
//        1
//        12
//        123
//        1234
//        ```
//        >
//        > Dla `6` wyświetli:
//        >
//        1
//        12
//        123
//        1234
//        12345
//        123456```
public class ZadanieChoinka {

    public static void main(String[] args) {
        int wiersze = 4;
        choinka(wiersze);

    }

    private static void choinka(int wiersze) {
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
        System.out.println();
    }
}
}