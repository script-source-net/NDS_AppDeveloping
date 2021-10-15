package net.scriptsource.stringservice.gui;

import javax.swing.*;
import java.awt.*;

public class StartForm extends JFrame{
    private JPanel panel1;
    private JLabel lbl_CreateDriver;
    private JLabel lbl_createTeam;
    private JLabel lbl_createCar;
    private JLabel lbl_createMechanic;
    private JButton btn_createTeam;
    private JButton btn_createDriver;
    private JButton btn_createCar;
    private JButton btn_newMechanic;
    private JTextField txt_outPut;


    public StartForm(){
        this.setVisible(true);
        this.setLayout(new GridLayout(5,2));
        this.setSize(300,300);
        this.add(lbl_createCar,);
        this.add(lbl_CreateDriver);
        this.add(lbl_createTeam);
        this.add(lbl_createMechanic);
        this.add(btn_createDriver);
        this.add(btn_createCar);
        this.add(btn_createTeam);
        this.add(btn_newMechanic);
        this.add(txt_outPut);
    }
}
