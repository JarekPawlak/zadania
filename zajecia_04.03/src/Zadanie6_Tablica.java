/*

 */


public class Zadanie6_Tablica {
    public static void main(String[] args) {
        int [] tablica = new int[]{1,2,3,4,5,6};
        tablica[2]=444;// bierze wartosc z 3 pozycji
        System.out.println("Element 3:" +tablica[2]);// 2 bo java liczy od zera
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ",");
        }
    }


}
