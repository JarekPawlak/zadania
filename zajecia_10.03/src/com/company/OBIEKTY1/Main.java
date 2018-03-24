package com.company.OBIEKTY1;

/*
Utwórz klasę `Address` (`Adres`) posiadającą
*pola reprezentujące:*
* ulicę
* numer domu
* numer mieszkania
* kod pocztowy
* miasto

*następujące kostruktory:*
* bezparametrowy
* 3-parametrowy (przyjmujący pierwsze trzy pola)
* 5-parametrowy (przyjmujący wszystkie pola)

*metody zwracające:*
* pełen adres
* ulicę (wraz z numerami)
 */
public class Main {
    public static void main(String[] args) {
   Adres trzyParametryAdres=new Adres(
           "Inowroclawska",
           9,
           195 );

   Adres piecParametryAdres=new Adres(
           "Inowroclawska",
           9,
           195,
           "91-033",
           "Lodz");

   Adres miastoAdres=new Adres("Lodz");
   Adres nrDomuAdres=new Adres (34);


        System.out.println(trzyParametryAdres.pelenAdres());
        System.out.println(piecParametryAdres.pelenAdres());
        System.out.println(miastoAdres.pelenAdres());
        System.out.println(miastoAdres.pelenAdres());
   }
   }

