package net.scriptsource.kapitel4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Testings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie viele Zahlen?");
        int n=sc.nextInt();

        int[] werte1 = new int[n];
        for(int i=0;i<werte1.length;i++){
            System.out.println("Zahl Nr. "+i+":");
            werte1[i]=sc.nextInt();
        }

        int werte2[]=new int[werte1.length];
        for(int i=0;i<werte2.length;i++){
            werte2[i]=2*werte1[i];
        }

        for(int i=0;i<n;i++){
            System.out.println("Die Zahl " + werte1[i] + " ergibt verdoppelt " +
                    werte2[i]);
        }

    }
}
