/*
 * "Grundkurs Programmieren in Java"
 * 2001-2018, Carl Hanser Verlag
 * Demo-programm zu den IOTools (Version 2018 ff)
 * (c) 2018 D. Ratz
 *
 */
import net.scriptsource.Prog1Tools.IOTools;
public class IOToolsDemo {
  public static void main (String[] args) {  
    // int-Eingabe mit separatem Prompt
    System.out.print("i = "); 
    int i = IOTools.readInt();
                              
    // Vereinfachte int-Eingabe mit Prompt
    int k = IOTools.readInt("k = ");

    // double-Eingabe mit Prompt
    double d = IOTools.readDouble("d = ");

    // char-Eingabe mit Prompt
    char c = IOTools.readChar("c = ");

    // boolean-Eingabe mit Prompt
    boolean b = IOTools.readBoolean("b = ");

    // Testausgaben
    System.out.println("Eingelesene Werte");
    System.out.println("i = " + i);
    System.out.println("k = " + k);
    System.out.println("d = " + d);
    System.out.println("c = " + c);
    System.out.println("b = " + b);
  }
}
