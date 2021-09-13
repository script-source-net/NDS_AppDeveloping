package net.scriptsource.aufgaben;

public class Aufgabe3_13 {
    public static void main(String[] args) {
        double s,x1,x2,x3,x4,x5,x6,y1,y2,y3,y4,y5,y6;
        x1=1e20;
        x2=1223;
        x3=1e18;
        x4=1e15;
        x5=3;
        x6=-1e12;
        y1=1e20;
        y2=2;
        y3=-1e22;
        y4=1e13;
        y5=2111;
        y6=1e16;
        s = x1;
        System.out.println(s);
        s = x1*y1 + x2*y2 + x3*y3 + x4*y4 + x5*y5 + x6*y6;
        System.out.println("s = " + s);
    }

}
