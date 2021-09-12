package net.scriptsource.lektion3;

public class Array {
    /*
    Array ist eine Sammlung gleicher Datentypen mit Referenz auf einen bestimmten Speicher
    Arrays sind indizierte Listen von referenzierten Daten gleicher Datentypen

     */
    public static void main (String[] args){
        String[] days ={"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
        for(int i = 0; i< days.length; i++){
            System.out.println(days[i]);
        }
        System.out.println("*******");
        for (String e : days) {
            System.out.println(e);
        }
        System.out.println("*******");

    }
}
