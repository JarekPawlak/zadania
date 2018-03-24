package com.company.zadanie5;

public class Main {
    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Bolek", "Lolek", 500, 40, false);
        Pracownik pracownik2 = new Pracownik("Lola", "Kowalska", 2000, 20, true);
        Pracownik mojWlasnyPracownik = new Pracownik("Bartek", "Lisiecki", 4000, 50, false);
//        Pracownik pracownik3 = new Pracownik();
//        pracownik3.wczytajPracownika();


//
Firma mojaFirma = new Firma();
mojaFirma.dodajPracownika(pracownik);
//mojaFirma.dodajPracownika(pracownik2);
//mojaFirma.dodajPracownika(mojWlasnyPracownik);
mojaFirma.wyswietleniListyPracownikow();
//        System.out.println();
//        System.out.println("Najlepiej zarabia: ");
//        mojaFirma.najlepiejOplacany().imieINazwisko();
//        System.out.println();
//        System.out.println("Podwyżka:");
//mojaFirma.ktoDostaniePremie(10);
//mojaFirma.wyswietleniListyPracownikow();
//        System.out.println();
//        System.out.println("Najnizej oplacany pracownik: ");
//        mojaFirma.najnizszaKrajowa(1200);
//       mojaFirma.wyswietleniListyPracownikow();


    }
}
