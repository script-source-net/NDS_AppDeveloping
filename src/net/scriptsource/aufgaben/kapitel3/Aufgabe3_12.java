package net.scriptsource.aufgaben.kapitel3;

public class Aufgabe3_12 {
    public static void main(String[] args) {
        System.out.println("Dies " + "ist " + "ein " + "Concat String"); // Hier werden verschiedene Strings zusammen ausgegeben
        System.out.println("2"+"3"); //Hiermit werden 2 und 3 zusammengenommen, als StringConcat
        double x = 1.0, y = 2.5;
        System.out.println(x/y);
        System.out.println("x/y=" + x/y);
        System.out.println(x+y);
        System.out.println("x+y="+(x+y));
        System.out.println(x-y);
        System.out.println("x-y="+(x-y));
        System.out.println(1+2+3+4);
        System.out.println(1+2+3+"4");
        System.out.println("1"+(2+3+4));
        System.out.println("Hilfe" + true + 3);
        System.out.println(true + (3 + "Hilfe"));
    }
}
