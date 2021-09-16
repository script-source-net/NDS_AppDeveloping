package net.scriptsource.aufgaben;
/*
Abfüllen eines mehrdimensionalen Arrays welches auf mehrere Reihen und Kollonen
sich pro Reihe um 1 erhöhende Kollonenzahlen beinhaltet

Beispiel:
1 2 3 4
2 3 4 5
3 4 5 6
 */
public class Aufgabe3_20 {
    public static void main(String[] args) {
        int startInner=1, endInner=9, indexRow = 0, indexColumn;
        String output;
        int[][] rows = new int[8][8];

        //Abfüllen eine Mehrdimensionalen Arrays mit Zahlen
        for(int i=1;i<9;i++){
<<<<<<< Updated upstream
            indexColumn = 0;                        //Zurücksetzen des Kollonenindexes für das Arrays
            for (int j=startInner;j<endInner;j++){  //Abfüllen der Kollone des Multidimensionalen Arrays
                //System.out.print(j + " ");
                rows[indexRow][indexColumn]+=j;     //Eintragen der Zahl auf dem Array bei Reihe und Kollonne
                indexColumn++;
            }
            startInner++;                           //Erhöhung der Startzahl für die Schleife
            endInner++;                             //Erhöhung der Endzahl für die Schleife
            indexRow++;                             //Erhöhung des Reihenindexes des Arrays
            //System.out.println("");
        }

        for(int i=0; i<rows.length;i++){            //Schleife für den Output des Mehrdimensionlen Arrays
            output="";
            for(int j=0; j<rows[i].length;j++){
                output += rows[i][j] + " ";
            }
            System.out.println(output);
        }
        System.out.println("************************");
        for (int[] innerArray:rows){
            output="";
            for(int data: innerArray){
                output+=data + " ";
=======
            for (int j =1; j<9;j++){
                System.out.print(j + " ");

>>>>>>> Stashed changes
            }
            System.out.println(output);
        }
    }

}
