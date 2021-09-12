package net.scriptsource.lektion3;
import net.scriptsource.Prog1Tools.IOTools;

public class TerminKalenderMain {

    public static void main(String[] args) {
        String[] termine = new String[24];
        String[] days = new String[7];
        Integer[] weeks = new Integer[52];
        String[] months = new String[12];

        boolean add = true;

        while (add){
            int stunde = IOTools.readInteger("Stunde?");
            String beschreibung = IOTools.readString("Beschreibung?");
            termine[stunde]=beschreibung;
            add = IOTools.readBoolean("Wollen sie einen neuen Termin erfassen?");
        }

        for (int std = 0; std < termine.length; std++) {
            System.out.println(std + " " + termine[std]);
        }

    }
}
