package net.scriptsource.aufgaben;

public class Aufgabe3_18 {
    public static void main(String[] args) {
        // for Schleife rechnet von 0 zu 100 und bei 74 gibt es einen Abbruch
        for(int i = 0;i<100;i++){
            if(i==74) break;            //Abbruch bei i==74
            if(i % 9 != 0) continue;    //Wenn i % 9 nicht Rest 0 ergibt wird die nächste Anweisung übersprungen
            System.out.println(i);
        }
        // while Schlaufe rechnet von 0 beginnend mit i++ iterierend um 1 unendlich weiter
        int i = 0;
        while (true){
            i++;
            int j = i*30;           //jedes i wird mit 30 multipliziert und in j geschrieben
            if(j == 1260) break;    //wenn j == 1260 Schlaufe abbrechen und verlassen
            if(j%10 != 0) continue; //solange j%10 nicht 0 ergibt wird die nächste Anweisung überprungen
            System.out.println(i);  //1260*30==42 der printOut gibt 41 weil i++ noch nicht iteriert wurde
        }
    }
}
