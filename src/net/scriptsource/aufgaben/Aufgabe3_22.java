package net.scriptsource.aufgaben;

public class Aufgabe3_22 {
    public static void main(String[] args) {
        int x=0, y=4;

        if(x < 5){
            if(x<0) {
                System.out.println("x < 0");
            }
        }else{
            System.out.println("x >= 5");
        }

        if (x > 0) {
            System.out.println("ok! x > 0");
            System.out.println("1/x = " + (double)(1/x));
        }

        if(x > 0) {
            System.out.println("1/x = " + (double) (1 / x));
        }

        if (y > x) {
            int temp = x;
            x = y;
            y = temp;
        }
        System.out.println("x = " + x + "      y = " + y);
    }
}
