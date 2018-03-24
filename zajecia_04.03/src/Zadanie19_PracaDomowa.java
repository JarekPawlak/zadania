/*
Utwórz metodę, która przyjmuje dwie tablice.
Metoda ma zwrócić informację, czy przekazane tablice są takie same.
 */
public class Zadanie19_PracaDomowa {

    public static void main(String[] args) {
        int tablica[] = new int[4];
        tablica[0]=1;
        tablica[1]=3;
        tablica[2]=4;
        tablica[3]=8;

        int drugaTablica[] = new int[]{1, 3, 4, 5};

//        if (tablica.length != drugaTablica.length) {
//            System.out.println("Tablice nie są równe!");
//        } else {
            porownanieTablic(tablica, drugaTablica);
        }
    //}

    private static boolean porownanieTablic(int[] tablica, int[] drugaTablica) {

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] != drugaTablica[i]) {
                System.out.println("tablice nie są takie same");
                return false;
            }
        }
        System.out.println("Tablice są takie same");

        return false;
    }
}