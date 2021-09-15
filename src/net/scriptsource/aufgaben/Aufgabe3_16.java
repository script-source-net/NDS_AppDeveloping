package net.scriptsource.aufgaben;

public class Aufgabe3_16 {
    public static void main(String[] args) {
        int i = 20;
        while(i>0){
            System.out.println(i);
            i-=2;
        }
        System.out.println("*************");

        //for Schleife git dieselbe Ausgabe wie die while Schleife
        for (i = 20; i > 0; i-=2){
            System.out.println(i);
        }
    }
}
