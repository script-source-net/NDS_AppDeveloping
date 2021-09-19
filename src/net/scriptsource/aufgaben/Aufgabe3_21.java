package net.scriptsource.aufgaben;

public class Aufgabe3_21 {
    public static void main(String[] args) {
        int i, j;                                       //i wird vor der Schlaufe deklariert
        for(i=0; i<=10;i++){                            //1 Schlaufendurchlauf
            System.out.println("A1: i = " + i);         //0
            i = 5;                                      //i bekommt 5 zugewiesen
            System.out.println("A2: i = " + i);         //5
            for (i=7; i<20;i++){                        //5 Schlaufendurchläufe --> Schlaufe solange i<20 ausführen
                System.out.println("B1: i = " +i);      //7,10,13,16,19
                i = i + 2;                              //i wir um 2 erhöht
                System.out.println("B2: i = " + i);      //9,12,15,18,21 --> Schlaufe wird beendet und erste Schlaufe ist auch beendet
            }
        }
    }
}
