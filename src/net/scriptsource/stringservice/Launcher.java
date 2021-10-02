package net.scriptsource.stringservice;

import java.sql.*;

public class Launcher {
    public static void main(String[] args) {
        String url = "jdbc:mysql://webdev.script-source.net:3306/script-source.net";
        String user = "javasql";
        String passwd = "Supersax.1Boracay.1";
        try {
            Connection con = DriverManager.getConnection(url,user,passwd);
            System.out.println("Verbindung erfolgreich");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_brand");
            while (rs.next()){
                System.out.println("Saitenmarken: " + rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
