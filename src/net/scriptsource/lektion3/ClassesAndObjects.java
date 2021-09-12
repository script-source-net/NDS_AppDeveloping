package net.scriptsource.lektion3;
import java.util.Scanner;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        System.out.println("Name?");
        p1.setName(sc.nextLine());
        System.out.println("Vorname?");
        p1.setPrename(sc.nextLine());
        System.out.println("Alter?");
        p1.setAge(sc.nextInt());
        System.out.println("Gewicht?");
        p1.setWeight(sc.nextDouble());
        System.out.println("Grösse in m?");
        p1.setHeight(sc.nextDouble());

        System.out.println("Vorname: " + p1.getPrename() +
                "\nNachname: " + p1.getName() +
                "\nAlter: " + p1.getAge() +
                "\nBMI: " + p1.bmi(p1.getWeight(), p1.getHeight()));


        /*
        p1.setAge(45);
        p1.setName("Desax");
        p1.setPrename("Gion");

        Person p2 = new Person();
        p2.setAge(46);
        p2.setName("Fetz");
        p2.setPrename("Patrizia");

        System.out.println(p1.getPrename() + " " + p1.getName() + " " + p1.getAge());
        System.out.println(p2.getPrename() + " " + p2.getName() + " " + p2.getAge());
        System.out.println(p1);
        System.out.println(p2);
        p1.printMe();

         */
    }
}
