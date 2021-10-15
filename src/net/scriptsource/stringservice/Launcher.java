package net.scriptsource.stringservice;

import net.scriptsource.stringservice.gui.Gui;
import net.scriptsource.stringservice.gui.StartForm;
import net.scriptsource.stringservice.sqlQueries.SQL_Queries;
import java.sql.*;


public class Launcher {
    public static void main(String[] args) {
        StartForm startForm = new StartForm();


        /*
        SQL_Queries sq = new SQL_Queries();
        String url = "jdbc:mysql://webdev.script-source.net:3306/script-source.net";
        String user = "javasql";
        String passwd = "Supersax.1Boracay.1";
        try {
            Connection con = DriverManager.getConnection(url,user,passwd);
            System.out.println("Verbindung erfolgreich");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sq.getOrder());
            while (rs.next()) {
                System.out.println(rs.getRow() + " " +
                        rs.getString(1) + " " +
                        rs.getString(2)+" " +
                        rs.getString(3)+" " +
                        rs.getString(4)+" " +
                        rs.getString(5)+" " +
                        rs.getString(6)+" " +
                        rs.getString(7)+" " +
                        rs.getString(8)+" " +
                        rs.getString(10)+" " +
                        rs.getString(9));
            }
            System.out.println(rs);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

         */
    }
}
