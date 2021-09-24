package net.scriptsource.aufgaben.kapitel4;

import java.util.Scanner;

public class Aufgabe4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean finish = false;
        int n =0;
        do {
            System.out.println("Geben sie eine Zahl ein!");
            n = sc.nextInt();
            if (n>2){
                if(n<10){
                    if(n%2!=0){
                        finish=true;
                    } else {
                        System.out.println("Zahl ist nicht ungerade");
                    }
                }else {
                    System.out.println("Zahl ist nicht kleiner 10");
                }
            } else {
                System.out.println("Zahl ist nicht grösser 2");
            }

        } while (finish != true);


        int[][] quad = new int[n][n];
        int row = (n/2);
        int column = n/2+1;

        for (int i = 1;i < (n*n);i++){
            quad[row][column]=i;
            column = column+1;
            row=row-1;
            if (row < 0){
                row = n-1;
            }
            if (column == n){
                column = 0;
            }
            if(quad[row][column] != 0){
                row = row + 1;
                column = column + 1;
                if (row == n){
                    row = 0;
                }
                if (column == n){
                    column = 0;
                }
            }
        }
        for (int i = 0; i < quad.length;i++){
            String out = "";
            for (int j = 0; j < quad[i].length;j++){

                out += quad[i][j] + " ";
            }
            out += "\n";
            System.out.println(out);
        }

    }
}
