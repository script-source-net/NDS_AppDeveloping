package net.scriptsource.aufgaben.kapitel3;

public class Aufgabe3_19 {
    public static void main(String[] args) {
        //for Schleife berechnet den Wert von 1/((2*i))+1
        int n = 10;
        System.out.println("FOR");
        for(int i=0;i<2*n;i++){
            System.out.println(1.0/(2*(double)i+1.0));  //Parse des INT auf double für die Berechnung
        }
        System.out.println("WHILE");
        int i=0;
        //while Schleife
        while (i<2*n){
            System.out.println(1.0/(2*(double)i+1.0));
            i++;
        }
        System.out.println("DO-WHILE");
        //do-while Schleife
        i=0;
        do {
            System.out.println(1.0/(2*(double)i+1.0));
            i++;
        }while (i<2*n);

    }
}
