package com.company.Zad6;
/*
*ZADANIE #6*
Utwórz klasę `Osoba`, która zawiera pola `imie`, `wiek`.
Utwórz klasę `Student` (z dodatkowymi polami jak
`Uczelnia` i `rokStudiow`) oraz
`Wykladowca` (z polami `Uczelnia`).
Utwórz klasę `Uczelnia` (z polami `nazwa` i `adres`)
 */

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Michał", 23);
        Uczelnia uczelnia1 =
                new Uczelnia("uniwerek", "pomorska");
        Student student1 =
                new Student("Adam", 22, 3, uczelnia1);
        Wykladowca wykladowca1=
                new Wykladowca("mirek",45);
        System.out.println(wykladowca1);
        wykladowca1.setUczelnia(uczelnia1);
        System.out.println(wykladowca1);
        Student student2=
                new Student(osoba1,2,uczelnia1);
//        System.out.println(student2);
//        System.out.println(student1);
    }

}
