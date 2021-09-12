package net.scriptsource.lektion3;
import java.util.Scanner;

public class PersonFactoryUebung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anzahl;

        System.out.println("Anzahl Personen?");
        anzahl = sc.nextInt();
        Person[] personen = new Person[anzahl];
        for(int i = 0; i< anzahl;i++){
            Person p = new Person();
            System.out.println("Name:Vorname:Alter");
            String input = sc.nextLine();
            String[] pinput = input.split(":");
            p.setName(pinput[0]);
            p.setPrename(pinput[1]);
            p.setAge(Integer.parseInt(pinput[2]));

            personen[i]=p;
        }
        for (int i = 0; i< personen.length;i++){
            System.out.println(personen);
        }

        System.out.println("Na");


    }
}
