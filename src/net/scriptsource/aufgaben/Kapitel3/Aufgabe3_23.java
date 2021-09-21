package net.scriptsource.aufgaben.Kapitel3;
import net.scriptsource.Prog1Tools.IOTools;

public class Aufgabe3_23 {

    public static void main(String [] args) {
            double a, b, c, d, e;
            a = IOTools.readDouble("a = ");
            b = IOTools.readDouble("b = ");
            c = IOTools.readDouble("c = ");
            d = IOTools.readDouble("d = ");
            if (b>a & c>a & d>a & c>b & d>b & d>a & d>c) {
                e = d;
            } else if (b>a & c>a & c>b) {
                e = c;
            } else if(b>a) {
                e = b;
            } else {
                e = a;
            }
            System.out.println("e = " + e);
    }
}
