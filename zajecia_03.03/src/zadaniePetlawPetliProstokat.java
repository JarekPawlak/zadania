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

public class zadaniePetlawPetliProstokat {

    public static void main(String[] args) {
        prostokat(3, 3, "x");
//        prostokat(5,7);

    }

    private static void prostokat(int wysokosc, int szerokosc) {
        prostokat(wysokosc, szerokosc, "x");
    }

    private static void prostokat(int wysokosc, int szerokosc, String znak) {
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {

                if (i == j) {
                    System.out.print("o");
                } else {
                    System.out.print(znak);
                }
            }
            System.out.println();
        }

    }
}
//public static void main(String[] args) {
//    prostokat(8,3);
//
//}
//
//    private static void prostokat(int wysokosc, int szerokosc, ) {
//        for (int i = 0; i < wysokosc; i++) {
//            for (int j = 0; j < szerokosc; j++) {
//                if(i==j) {
//                    System.out.print("o");
//                }else {
//                    System.out.print("x");
//
//
//                }
//
//            }
//            System.out.println();
//        }
//    }
//    }