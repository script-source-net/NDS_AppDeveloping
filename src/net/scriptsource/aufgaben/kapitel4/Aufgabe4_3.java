package net.scriptsource.aufgaben.kapitel4;

import net.scriptsource.lektion3.TerminKalenderMain;

import java.util.Scanner;

public class Aufgabe4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int year, month, day, hour;
        int help;
        boolean finish = false;
        boolean switchYear = false;
        String[][][][] termine = new String[10][12][][];
        for(year=0; year<termine.length;year++){
            for(month=0;month<termine[year].length;month++){
                if(year+2000 % 4 == 0){
                    switchYear = true;
                }
                if(month == 0 | month == 2 | month == 4 | month == 6 | month == 7 | month == 9 | month == 11) {
                    termine[year][month] = new String[31][24];
                }else {
                     if(switchYear != true){
                        termine[year][month] = new String[28][24];
                    } else {
                        termine[year][month] = new String[29][24];
                    }
                }
            }
        }
        for(year=0;year<termine.length;year++){
            for (month=0;month<termine[year].length;month++){
                for (day=0;day<termine[year][month].length;day++){
                    for (hour=0;hour<termine[year][month][day].length;hour++){
                        termine[year][month][day][hour] = "";
                    }
                }
            }
        }

        finish = false;
        while (!finish){
            System.out.println();
            System.out.println("1 - Neuer Eintrag");
            System.out.println("2 - Termine ausgeben");
            System.out.println("3 - Prgramm beenden");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Welches Jahr(2000-2009)?");
                    year=sc.nextInt()-2000;
                    if (year<0 || year>9){
                        System.out.println("Fehler: " + year+2000 +" ist kein zulässiges Jahr!");
                        break;
                    }
                    System.out.println("Welcher Monat (1-12)=");
                    month= sc.nextInt()-1;
                    if(month<0 || month>12){
                        System.out.println("Fehler: " + month+1 +" ist kein zulässiger Monat!");
                        break;
                    }
                    help=termine[year][month].length;
                    System.out.println("Welcher Tag (1-" + help + ")?");
                    day= sc.nextInt()-1;
                    if (day<0 || day >= help){
                        System.out.println("Fehler: " + day+1 +" ist kein zulässiger Tag!");
                        break;
                    }
                    System.out.println("Welche Stunde (0-23)?");
                    hour=sc.nextInt();
                    if (hour<0 || hour>23){
                        System.out.println("Fehler: " + hour+" ist keine zulässige Stunde!");
                        break;
                    }
                    System.out.println("Eintrag: ");
                    String input = sc.next();
                    termine[year][month][day][hour]= input;
                    break;
                case 2:
                    for (int i = 0; i<termine.length; i++){
                        for(int j = 0; j<termine[i].length; j++){
                            for(int k =0; k<termine[i][j].length;k++){
                                for(int l =0; l<termine[i][j][k].length;l++){
                                    String output = termine[i][j][k][l];
                                    if(output.equals("")){
                                        continue;
                                    } else {
                                        year = i +2000;
                                        month = j + 1;
                                        day = k + 1;
                                        hour = l;
                                        System.out.println("["+day+"."+month+"."+year+"/"+hour+":00] " + output);
                                    }

                                }
                            }
                        }
                    }
                    break;
                case 3:
                    finish = true;
                    System.out.println("ByeBye");
                    break;
                default:
                    System.out.println("Unzulässige Eingabe");
            }

        }

    }
}
