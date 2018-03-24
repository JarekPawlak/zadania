package com.company;

public class wyswietlLiczby {
    public static void main(String[] args) {
        int a= 1;
        int b=100;
//        wypiszLiczby(a,b);
        System.out.println(wypiszLiczby(a,b));

    }

    private static String  wypiszLiczby(int a, int b) {
        String napis = "";
        for (int i = a; i <+ b; i++) {
napis +=i+" ";

        }
        return napis;
    }
}
