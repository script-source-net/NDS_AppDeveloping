package net.scriptsource.aufgaben.kapitel3;

import java.util.Scanner;

public class Aufgabe3_15 {
    public static void main(String[] args) {
        long t, y, d, h, m, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie eine Zahl über 1000 für die Berechnung ein:");
        t= sc.nextLong();
        do{
            y=t/(3600*24*365);
            t=t%(3600*24*365);
            d=t/(3600*24);
            t=t%(3600*24);
            h=t/(3600);
            t=t%(3600);
            m=t/60;
            t=t%60;
            s=t;
        }while (t==0);
        System.out.println("Jahre: " + y);
        System.out.println("Tage: " + d);
        System.out.println("Stunden: " + h);
        System.out.println("Minuten: " + m);
        System.out.println("Sekunden: " + s);
    }
}
