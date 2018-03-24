public class ZadanieTablica {
    public static void main(String[] args) {
        int tablica[] = new int[]{3,6,10,2,8};

        System.out.print("[");
        wyswietlTablice (tablica);
        System.out.println("]");

    }

    private static void wyswietlTablice(int[] tablica) {

        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i]+",");

        }
    }
}