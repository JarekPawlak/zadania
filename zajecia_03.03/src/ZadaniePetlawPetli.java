////metoda, ktora przyjmuje dwa parametry bokow prostokata, i wyswietla kwadrat
//public class ZadaniePetlawPetli {
//    public static void main(String[] args) {
//        prostokat(4,5);
//    }
//
//    private static void prostokat(int wysokosc, int szerokosc){
//        for (int i = 0; i < wysokosc; i++) {
//            for (int j = 0; j < szerokosc; j++) {
//                System.out.print("x");
//            }
//            System.out.println();
//        }
//    }
//}
//
//Utwórz metodę, która przyjmuje jeden parametr (który jest liczbą wierszy ) oraz wyświetla “choinkę”
//        > Dla `4` wyświetli:
//        >
//        ```1
//        12
//        123
//        1234
//        ```
//        >
//        > Dla `6` wyświetli:
//        >
//        ```1
//        12
//        123
//        1234
//        12345
//        123456```public class ZadaniePetlawPetli {

public class ZadaniePetlawPetli {

    public static void main(String[] args) {
        prostokat(5,3,"/");
        prostokat(5,7);

    }

    private static void prostokat(int wysokosc, int szerokosc){
        prostokat(wysokosc,szerokosc,"x");
    }
    private static void prostokat(int wysokosc, int szerokosc,String znak) {
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}