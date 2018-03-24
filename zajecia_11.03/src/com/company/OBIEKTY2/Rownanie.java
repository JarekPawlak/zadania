package com.company.OBIEKTY2;
/*
Utwórz klasę `Rownanie` służącą do policzenia równania `a^2 + b^3 + c^4`.
Klasa powinna zawierać:
>*pola:*
>`a`, `b`, `c`
>
>*kostruktory:*
>* bezparametrowy
>* 3-parametrowy
>
>*metody:*
>* liczaca wartość równania
>* przyjmującą liczbę a następnie zwracająca informację (`boolean`) czy wartość równania przekroczyła podaną liczbą (jako parametr)
 */
public class Rownanie {
   private int a;
    private int b;
    private int c;

    Rownanie(){


    }

    public void setB(int b) {//metoda ktora modyfikuje parametr b

        this.b = b;
    }

    public Rownanie(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {

        return a;
    }

    public int getB() {

        return b;
    }

    public int getC() {

        return c;
    }

    public double wykonajRownanie() {
        return Math.pow(a,2)+Math.pow(b,3)+Math.pow(c,4);

    }
 public boolean porownajWartosci(int wartoscWskazanaPrzezUzytkownika) {
     return wykonajRownanie() > wartoscWskazanaPrzezUzytkownika;//zwroci true lub false bez koniecznosci uzywania if

     //        if(wykonajRownanie()>wartoscWskazanaPrzezUzytkownika){// zamiast tego można użyć jednej linijki kodu
//            return true;
//        }
//        return false;
// }
 }
}
