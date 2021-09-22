package net.scriptsource.aufgaben.kapitel4;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie viele Zahlen willst du sortieren?");
        int count = sc.nextInt();
        int[] zahl = new int[count];
        for(int i = 0; i<zahl.length;i++){
            System.out.println("Zahl " + (i+1) + " eingeben");
            zahl[i]=sc.nextInt();
        }
        Arrays.sort(zahl);
        for (int i=0;i<zahl.length;i++){
            System.out.println((i+1)+". Zahl: "+zahl[i]);
        }
    }
}
