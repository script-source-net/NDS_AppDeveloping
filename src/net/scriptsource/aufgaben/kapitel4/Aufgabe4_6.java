package net.scriptsource.aufgaben.kapitel4;

import net.scriptsource.aufgaben.kapitel4.Adresse;

import java.util.Scanner;

public class Aufgabe4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wieviele Adressen werden erfasst?");
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
            System.out.println("1 -> Adressen erfassen");
            System.out.println("2 -> Adresse im Speicher anpassen");
            System.out.println("3 -> Adressausgabe");
            //System.out.println("4 -> Aktuelle Adresse wechseln");
            System.out.println("4 -> Programm beenden");
            System.out.println("Ihre Wahl: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    for (int i = 0; i < adressen.length; i++) {
                        System.out.println("----------------------------");
                        System.out.println("**** Eingabe Adresse " + (i+1) + " ****");
                        System.out.println("----------------------------");
                        System.out.println("Name: ");
                        adressen[i].setName(sc.next());
                        System.out.println("Vorname: ");
                        adressen[i].setPreName(sc.next());
                        System.out.println("Strasse: ");
                        adressen[i].setStreet(sc.next());
                        System.out.println("Hausnummer: ");
                        adressen[i].setHouseNumber(sc.nextInt());
                        System.out.println("Wohnort: ");
                        adressen[i].setTown(sc.next());
                        System.out.println("Postleitzahl: ");
                        adressen[i].setPostalcode(sc.nextInt());
                        System.out.println("E-Mail: ");
                        adressen[i].setMail(sc.next());
                        System.out.println("Telefonnummer: ");
                        adressen[i].setPhoneNumber(sc.nextInt());
                        System.out.println("Kommentar: ");
                        adressen[i].setCommentary(sc.next());
                    }
                    break;
                case 2:
                    System.out.println("Welche Adresse soll verändert werden?");
                    int index = sc.nextInt();

                    if(index >= 0 && index < adressen.length){
                        adr = adressen[index-1];
                    } else {
                        System.out.println("Eingabefehler!");
                    }
                    boolean changeAdresse = false;
                    while (!changeAdresse) {
                        System.out.println("----------------------------");
                        System.out.println("**** Anpassen Adresse " + (index) + " ****");
                        System.out.println("----------------------------");
                        String adresse = "Wählen unten die Option aus:" +
                                "\n1 --> Name/Vorname: " + adr.getName() + " " + adr.getPreName() +
                                "\n2 --> Strasse/Nr.: " + adr.getStreet() + " " + adr.getHouseNumber() +
                                "\n3 --> PLZ/Ort: " + adr.getPostalcode() + " " + adr.getTown() +
                                "\n4 --> E-Mail: " + adr.getMail() +
                                "\n5 --> Telefon: " + adr.getPhoneNumber() +
                                "\n6 --> Kommentar: " + adr.getCommentary() +
                                "\n7 --> Hauptmenu";
                        System.out.println(adresse);
                        int changeIndex = sc.nextInt();
                        switch (changeIndex) {
                            case 1 -> {
                                System.out.println("Name: " + adr.getName());
                                adr.setName(sc.next());
                                System.out.println("Vorname: " + adr.getPreName());
                                adr.setPreName(sc.next());
                            }
                            case 2 -> {
                                System.out.println("Strasse: " + adr.getStreet());
                                adr.setStreet(sc.next());
                                System.out.println("Hausnummer: " + adr.getHouseNumber());
                                adr.setHouseNumber(sc.nextInt());
                            }
                            case 3 -> {
                                System.out.println("Postleitzahl: " + adr.getPostalcode());
                                adr.setPostalcode(sc.nextInt());
                                System.out.println("Wohnort: " + adr.getTown());
                                adr.setTown(sc.next());
                            }
                            case 4 -> {
                                System.out.println("E-Mail: " + adr.getMail());
                                adr.setMail(sc.next());
                            }
                            case 5 -> {
                                System.out.println("Telefonnummer: " + adr.getPhoneNumber());
                                adr.setPhoneNumber(sc.nextInt());
                            }
                            case 6 -> {
                                System.out.println("Kommentar: " + adr.getCommentary());
                                adr.setCommentary(sc.next());
                            }
                            case 7 -> changeAdresse = true;
                            default -> System.out.println("Eingabefehler");
                        }
                    }
                    break;
                case 3:
                    for(int i = 0; i < adressen.length;i++) {
                        System.out.println("\n*********** Datensatz: " + (i+1) + " ***********");
                        System.out.println(adressen[i].getName() + " " + adressen[i].getPreName());
                        System.out.println(adressen[i].getStreet() + " " + adressen[i].getHouseNumber());
                        System.out.println(adressen[i].getPostalcode() + " " + adressen[i].getTown());
                        System.out.println("E-Mail: " + adressen[i].getMail());
                        System.out.println("Telefon: " + adressen[i].getPhoneNumber());
                        System.out.println("Kommentar: " + adressen[i].getCommentary());
                    }
                    break;
                /*case 4:
                    System.out.println("Welche Adresse soll verändert werden?");
                    int index = sc.nextInt();

                    if(index >= 0 && index < adressen.length){
                        adr = adressen[index];
                    } else {
                        System.out.println("Eingabefehler!");
                    }
                    break;

                 */
                case 4:
                    finish = true;
                    break;
                default:
                    System.out.println("Eingabefehler!");
            }
        }

    }
}
