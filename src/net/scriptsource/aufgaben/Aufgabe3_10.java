package net.scriptsource.aufgaben;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aufgabe3_10 {
    public static void main(String[] args) {
        String name, prename, date = "05.04.1976";
        long tDiff = 0;
        Date dateNow = new Date();
        Date birthDay = new Date();
        SimpleDateFormat sDate = new SimpleDateFormat("dd.MM.yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie ist ihr Nachname?");
        name=sc.next();
        System.out.println("Wie ist ihr Vorname?");
        prename=sc.next();
        System.out.println("Wann sind Sie geboren? [dd.mm.yyyy]");
        date = sc.next();
        try{        //Calculating the days of birthday until today
            birthDay =sDate.parse(date);
            tDiff = ((dateNow.getTime()-birthDay.getTime())/(1000*60*60*24))%365;
        } catch (ParseException excep){
            excep.printStackTrace();
        }
        System.out.println("Hallo " + prename + " " + name +
                ".\nHeute haben wir den " + sDate.format(dateNow) +
                ".\nDu wurdest vor " + tDiff + " Tagen am "+
                "\n" + sDate.format(birthDay) + " geboren!");
    }
}
