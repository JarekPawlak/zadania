package com.company.Zadanie9Konwerter;

public class MainKonwerter {
    public static void main(String[] args) {
        Konwerter konwerter = new Konwerter();
        konwerter.celNaFahr(25);
//        System.out.println("podana wartosc w stC wynosi w stF: "+ konwerter.celNaFahr(100));
//        System.out.println(konwerter.fahrNaCel(212));
//
//        System.out.println(konwerter.kiloNaMile(120));
//        System.out.println(konwerter.mileNaKilo(80));
//
//        System.out.println(konwerter.pelneKwadranse(45));
//        System.out.println(konwerter.pelneKwadranse(59));
        System.out.println(konwerter.pelneKwadranse(60));
//        System.out.println(konwerter.pelneKwadranse(10,25));
//        System.out.println(konwerter.zamienNaSekundy(50));
//        System.out.println(konwerter.zamienNaSekundy(10,10));
        konwerter.obliczBmi(72, 170);
    }
}
