/*
Utwórz klasę Konwerter zawierająca metody umozliwiające konwertowanie:

podanej temperatury w stopniach Celsiusza na Fahrenheita
podanej temperatury w stopniach Fahrenheita na Celsiusza
podanej prędkośc w stopniach km/h (kilometrów na godzinę) na mph s(mil na godzinę)
podanej temperatury w stopniach km/h (kilometrów na godzinę) na m/s (metrów na sekundę)
podanej ilości minut na liczbę pełnych kwadransów (np. 45 -> 3, 59 -> 3)
*
DODAJ CONAJMNIEJ TRZY WŁASNE METODY PRZELICZAJĄCE WARTOŚCI
 */
package com.company.Zadanie9Konwerter;

public class Konwerter {
//    private double tempC, tempF;
//    private int predkoscKmh, predkoscMph;
//
    Konwerter() {

    }

    public double celNaFahr(int tempC) {
        return (tempC * 1.8) + 32;
    }

    public double fahrNaCel(int tempF) {
        return (tempF - 32) / 1.8;
    }

    public double kiloNaMile(int predkoscKmh) {
        return predkoscKmh / 1.61;
    }

    public double mileNaKilo(int predkoscMph) {
        return predkoscMph * 1.61;
    }

    public int pelneKwadranse(int minuty) {
        return minuty / 15;
    }

    public int pelneKwadranse(int godzina, int minuty) {
        return ((60 * godzina) + minuty) / 15;
    }

    public int zamienNaSekundy(int minuty) {
        return minuty * 60;
    }

    public int zamienNaSekundy(int godzina, int minuty) {
        return (60 * godzina + minuty) * 60;
    }

    public void obliczBmi(int waga, double wzrostCm) {
        double bmi = waga / ((wzrostCm * wzrostCm) / 10000);
        if (bmi < 18.5) {
            System.out.println("masz niedowagę, zaczniej więcej jeść, BMI: " + bmi);
        } else if (bmi < 24.9) {
            System.out.println("Twoja waga miesci się w normie, wszystko OK, BMI: " + bmi);
        } else if (bmi < 29.9) {
            System.out.println("lekka nadwaga, zalecana lekka korekta diety, BMI: " + bmi);
        } else {
            System.out.println("duża otyłość, czas na radyklane kroki BMI : " + bmi);
        }
    }
}