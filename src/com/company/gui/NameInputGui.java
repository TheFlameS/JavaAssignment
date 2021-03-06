package com.company.gui;

import com.company.Pokemon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameInputGui extends JFrame {

    private String pokemonName;
    private JTextField input;

    public NameInputGui(Pokemon wild) {

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
                wild.setName(input.getText());
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

    private void setPokemonName(){

    }

    public String getPokemonName() {
        return pokemonName;
    }
}
