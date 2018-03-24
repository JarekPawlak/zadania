public class TabliczkaMnozeniaWlasna {
    public static void main(String[] args) {
        int liczba=3;
        wyswietlTabliczke(liczba);
    }

    private static void wyswietlTabliczke(int liczba) {
        for (int i = 1; i <= liczba ; i++) {
            for (int j = 1; j <= liczba; j++) {
                System.out.print(i*j +"\t");
            }
            System.out.println();
        }
    }
}
