package net.scriptsource.aufgaben;

public class Aufgabe3_11 {
    public static void main(String[] args) {
        int a = 1, b=2, c=3,d=4;

        System.out.println(++a);            // 2
        System.out.println(a);              // 2
        System.out.println(b++);            // 2 ist bereits schon auf 2 iteriert
        System.out.println(b);              // 3 wird beim direkten Variablenaufruf iteriert
        System.out.println((++c)+(++c));    // 4 + 5
        System.out.println(c);              // 5 wird beim nächsten Variablenaufruf iteriert
        System.out.println((d++)+(d++));    // 4 + 5
        System.out.println(d);              // 6 wird weiter iteriert
    }
}
