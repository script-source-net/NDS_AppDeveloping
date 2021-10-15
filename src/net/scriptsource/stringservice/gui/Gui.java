package net.scriptsource.stringservice.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui extends JFrame{
    private JButton ok_btn;
    private JTextField txt_field;

    public Gui(){
        this.setTitle("Mein Fenster");
        this.setSize(300,300);
        this.setLayout(new GridLayout(0,2));

        this.ok_btn = new JButton("OK");
        this.ok_btn.addActionListener((ActionEvent e)-> txt_field.setText("OK"));
        this.txt_field = new JTextField();


        this.add(this.txt_field);
        this.add(this.ok_btn);

        this.setVisible(true);

    }
}
