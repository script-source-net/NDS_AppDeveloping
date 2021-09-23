package net.scriptsource.aufgaben.kapitel4;

import net.scriptsource.aufgaben.kapitel4.Adresse;

import java.util.Scanner;

public class Aufgabe4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wieviele Adressen sollen erstellt werden?");
        Adresse[] adressen = new Adresse[sc.nextInt()];
        Adresse adr;
        boolean finish = false;
        for (int i = 0;i < adressen.length; i++){
            adressen[i] = new Adresse();
        }
        adr = adressen[0];

        System.out.println("================");
        System.out.println("Adressverwaltung");
        System.out.println("================");

        while (!finish){
            System.out.println(" ");
            System.out.println("1 -> Adresseingabe");
            System.out.println("2 -> Adressausgabe");
            System.out.println("3 -> Aktuelle Adresse wechseln");
            System.out.println("4 -> Programm beenden");
            System.out.println("Ihre Wahl: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Name: ");
                    adr.setName(sc.next());
                    System.out.println("Vorname: ");
                    adr.setPreName(sc.next());
                    System.out.println("Strasse: ");
                    adr.setStreet(sc.next());
                    System.out.println("Hausnummer: ");
                    adr.setHouseNumber(sc.nextInt());
                    System.out.println("Wohnort: ");
                    adr.setTown(sc.next());
                    System.out.println("Postleitzahl: ");
                    adr.setPostalcode(sc.nextInt());
                    System.out.println("E-Mail: ");
                    adr.setMail(sc.next());
                    System.out.println("Telefonnummer: ");
                    adr.setPhoneNumber(sc.nextInt());
                    System.out.println("Kommentar: ");
                    adr.setCommentary(sc.next());
                    break;
                case 2:
                    for(int i = 0; i < adressen.length;i++) {
                        System.out.println("*********** Datensatz: " + i + " ***********");
                        System.out.println(adressen[i].getName());
                        System.out.println(adressen[i].getStreet() + " " + adressen[i].getHouseNumber());
                        System.out.println(adressen[i].getPostalcode() + " " + adressen[i].getTown());
                        System.out.println("E-Mail: " + adressen[i].getMail());
                        System.out.println("Telefon: " + adressen[i].getPhoneNumber());
                        System.out.println("Kommentar: " + adressen[i].getCommentary());
                    }
                    break;
                case 3:
                    System.out.println("Welche Adresse soll verändert werden?");
                    int index = sc.nextInt();

                    if(index >= 0 && index < adressen.length){
                        adr = adressen[index];
                    } else {
                        System.out.println("Eingabefehler!");
                    }
                    break;
                case 4:
                    finish = true;
                    break;
                default:
                    System.out.println("Eingabefehler!");
            }
        }

    }
}
