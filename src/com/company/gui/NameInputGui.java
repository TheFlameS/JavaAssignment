package com.company.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameInputGui extends JFrame {

    private String pokemonName;
    private JTextField input;

    public NameInputGui(String name) {

        this.pokemonName = name;

        //Set container
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //Components
        JLabel nameLabel = new JLabel("Name : ");
        input = new JTextField(10);
        JButton ok = new JButton("OK");

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pokemonName = input.getText();
                setVisible(false);
            }
        });

        c.add(nameLabel);
        c.add(input);
        c.add(ok);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

}
