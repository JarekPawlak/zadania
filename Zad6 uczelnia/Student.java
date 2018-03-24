package com.company.Zad6;

public class Student extends Osoba {
    private int rokStudiow;
    private Uczelnia uczelnia;

    public Student(String imie, int wiek, int rokStudiow, Uczelnia uczelnia) {
        super(imie, wiek);
        this.rokStudiow = rokStudiow;
        this.uczelnia = uczelnia;
    }
    public Student (Osoba osoba, int rokStudiow, Uczelnia uczelnia){
        super(osoba.imie, osoba.wiek);
        this.rokStudiow=rokStudiow;
        this.uczelnia=uczelnia;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rokStudiow=" + rokStudiow +
                ", uczelnia=" + uczelnia +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
