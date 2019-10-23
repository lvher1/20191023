package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Listenerbtn implements ActionListener{
    @Override

    public void actionPerformed(ActionEvent e) {
        JButton button =(JButton)e.getSource();
        button.setText("Clicked");
    }
}


public class AddFrame extends JFrame {
    public AddFrame (){
        //program name
        setTitle("xxx program");
        //program GUI's size
        setSize(500,500);

        //set layout

        //set when you clicked x button in right upside
        JButton button = new JButton("button");
        button.addActionListener(new Listenerbtn());
        JCheckBox ckbox = new JCheckBox("checkbox");
        JSlider slider = new JSlider();
        JTextField tf = new JTextField("input text",20);


        this.setLayout(new FlowLayout());

        this.setLayout(new FlowLayout());
        //add component object
        this.add(button);
        this.add(ckbox);
        this.add(slider);
        this.add(tf);
        setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}

