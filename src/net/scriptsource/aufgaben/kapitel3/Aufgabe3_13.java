package net.scriptsource.aufgaben.kapitel3;

public class Aufgabe3_13 {
    public static void main(String[] args) {
        double s,x1,x2,x3,x4,x5,x6,y1,y2,y3,y4,y5,y6;
        x1=1e20;
        x2=1223;
        x3=1e18;
        x4=1e15;
        x5=3.0;
        x6=-1e12;
        y1=1e20;
        y2=2.0;
        y3=-1e22;
        y4=1e13;
        y5=2111.0;
        y6=1e16;
        s = x1;
        System.out.println(s);
        s = x1*y1 + x2*y2 + x3*y3 + x4*y4 + x5*y5 + x6*y6;
        System.out.println("s = " + s);

        double x=192119201, y=35675640;
        s=(1.0/107751)*(1682*x*(y*y*y*y)+(3*(x*x*x)+29*x*(y*y)-2*(x*x*x*x*x)+832));
        System.out.print("s = " +s);
    }

}
