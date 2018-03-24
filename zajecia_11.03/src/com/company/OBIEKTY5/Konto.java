package com.company.OBIEKTY5;

/**
 * Utwórz klasę `Konto` służącą do odbsługi rachunku bankowego
 * pola:*
 * stan konta
 * właściciel konta
 * <p>
 * metody:*
 * umożliwiające wpłacanie na rachunek
 * umożliwiające wypłacanie z rachunku
 * pobranie numeru konta (edited)
 */
public class Konto {
    private int stanKonta; //deklarujemy prywatne pola
    private String wlascicielKonta;

    private static int liczbaRachunkowWBanku = 0; //pole statyczne jest inne od reszty
    //pole statyczne nie jest cechą konta, jest związane z klasą a nie z obiektem.
    private int nrRachunku;

    public Konto(int stanKonta, String wlascicielKonta) {
        //stworzyliśmy kontstruktora który zapisuje wartości jakie wpadły doń
        this.stanKonta = stanKonta;
        this.wlascicielKonta = wlascicielKonta;

        liczbaRachunkowWBanku++;
        //jest zwiększana za każdym razem jak tworzymy nowy obiekt tej klasy
        //liczbaRachunkowWBanku jest italic bo jest static
        nrRachunku = liczbaRachunkowWBanku; //przypisujemy wartość statica
        //mając obiekt mogę korzystać ze statycznych.
    }

    void wplataNaRachunek(int kwotaWplacana) {
        stanKonta += kwotaWplacana;
        //zwiększamy wartość pola o przekazaną wartość kwotaWplacana
    }

    void wyswietlStanKonta() {
        System.out.println("Twój stan konta: " + stanKonta + " Numer rachunku: " + nrRachunku);
    } //musimy + aby zrobił się String ze String+int

    void wyplataZRachunku(int kwotaWyplacana) {
        if (kwotaWyplacana >= stanKonta) {

            System.out.println("Zbyt mało na rachunku ");
        } else {
            stanKonta -= kwotaWyplacana;
        }
    }


}
