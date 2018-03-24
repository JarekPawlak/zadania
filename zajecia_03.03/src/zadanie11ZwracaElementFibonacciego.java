//Utwórz metodę, do której przekazujesz jeden parametr (7) i zwracasz wybrany element Fibonacciego:
//        > dla `7` zwróci `13` bo `1, 1, 2, 3, 5, 8, 13`
//        >
//        > dla `13` zwróci `233` bo `1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233`
public class zadanie11ZwracaElementFibonacciego {
    public static void main(String[] args) {
        System.out.println(ciag(false, 7));
        System.out.println(ciag(7));

    }

    private static int ciag(int poszukiwanyElement) {
        return ciag(false, poszukiwanyElement);

    }

    private static int ciag(boolean print, int poszukiwanyElement) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < poszukiwanyElement; i++) { // java liczy od O czyli 0,1,2,3,4,5,6 czy 6 bo to jest 7 element
            b += a; // inaczej b=b+a czytaj: "b zwieksz o a"
            a = b - a;
            if (print) {

                System.out.println("a = " + a + "  b=" + b);
            }
        }
            return a;
        }
    }


