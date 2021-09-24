package net.scriptsource.aufgaben.kapitel4;

public class Adresse {
    private String name;
    private String preName;
    private String street;
    private int houseNumber;
    private String town;
    private int postalcode;
    private String mail;
    private String commentary;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public Adresse setName(String name) {
        this.name = name;
        return this;
    }

    public String getPreName() {
        return preName;
    }

    public Adresse setPreName(String preName) {
        this.preName = preName;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Adresse setStreet(String street) {
        this.street = street;
        return this;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Adresse setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public String getTown() {
        return town;
    }

    public Adresse setTown(String town) {
        this.town = town;
        return this;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public Adresse setPostalcode(int postalcode) {
        this.postalcode = postalcode;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public Adresse setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Adresse setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getCommentary() {
        return commentary;
    }

    public Adresse setCommentary(String commentary) {
        this.commentary = commentary;
        return this;
    }
}
