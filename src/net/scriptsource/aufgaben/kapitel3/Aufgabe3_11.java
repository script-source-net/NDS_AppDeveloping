package net.scriptsource.aufgaben.kapitel3;

public class Aufgabe3_11 {
    public static void main(String[] args) {
        int a = 1, b=2, c=3,d=4;

        System.out.println(++a);            // 2
        System.out.println(a);              // 2
        System.out.println(b++);            // 2
        System.out.println(b);              // 3
        System.out.println((++c)+(++c));    // 4 + 5
        System.out.println(c);              // 5
        System.out.println((d++)+(d++));    // 4 + 5
        System.out.println(d);              // 6
        a=5;
        System.out.println(++a*2);
        a=5;
        System.out.println(a++*2);
        System.out.println(a);
    }
}
