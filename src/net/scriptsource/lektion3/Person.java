package net.scriptsource.lektion3;

public class Person {
    private int age;
    private String name;
    private String prename;
    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPrename() {
        return prename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    @Override
    public String toString(){
        return "Person{" +
                "\n Vorname: " + prename +
                "\n Nachname: " + name +
                "\n Alter: " + age + "\n}";
    }

    public void printMe(){
        System.out.println("Vorname: " + prename + " Name: " + name + " Alter " + age );
    }

    public double bmi(double height, double weight){
        return (getWeight() / (getHeight()*getHeight()));
    }

}
