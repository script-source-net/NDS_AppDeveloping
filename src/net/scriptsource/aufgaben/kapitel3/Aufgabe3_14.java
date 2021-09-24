package net.scriptsource.aufgaben.kapitel3;

import java.util.Scanner;

public class Aufgabe3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.141592;
        double u, h;
        System.out.println("Bitte Umfang eingeben: ");
        u = sc.nextDouble();
        System.out.println("Bitte Höhe der Dose eingeben: ");
        h = sc.nextDouble();
        double dBoden = (u/PI);
        double fBoden = PI *((dBoden/2)*(dBoden/2));
        double fMantel = u*h;
        double fGesamt = 2*fBoden+fMantel;
        double v = fBoden*h;
        System.out.printf("Der Durchmesser der Dose ist %.2fcm^2\n", dBoden);
        System.out.printf("Die Fläche eines Dosenbodens beträgt %.2fcm^2\n",fBoden);
        System.out.printf("Die Fläche des Mantels ist %.2fcm^2\n", fMantel);
        System.out.printf("Die Gesamtfläche der Dose beträgt %.2fcm^2\n",fGesamt);
        System.out.printf("Das Volumen dieser Dose ist %.2fcm^3\n", v);


    }
}
