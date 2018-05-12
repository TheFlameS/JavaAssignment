package com.company.gui;

import com.company.Pokemon;
import com.company.PokemonFarm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListGui extends JFrame {

    private String[] pokemonNameList;
    private String pokemonType;

    public ListGui(PokemonFarm pokemonFarm) {

        Container c = getContentPane();
        c.setLayout(new GridLayout(0,1));

        //Setting for combo box
        pokemonNameList = new String[pokemonFarm.getPokemonAmount()];

        for (int i = 0; i < pokemonFarm.getPokemonAmount(); i++) {
            if(i == 0){
                pokemonNameList[i] = "Nothing";
            }
            else {
                pokemonNameList[i] = pokemonFarm.getPokemonName(i);
            }
        }

        //Top section
        JPanel info = new JPanel();
        info.setLayout(new FlowLayout());

        JComboBox pokemonList = new JComboBox(pokemonNameList);

        JButton status = new JButton("Status");
        JButton feed = new JButton("Feed");
        JButton back = new JButton("Back");

        //Picture and status
        Icon img = new ImageIcon(getClass().getResource("./image_files/Nothing.png"));
        JLabel pic = new JLabel();
        pic.setIcon(img);

        JLabel statusInfo = new JLabel("There's nothing");

        status.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = (String) pokemonList.getSelectedItem();
                Pokemon present = pokemonFarm.getPokemon(name);

                statusInfo.setText(present.printGui());

            }
        });

        JPanel picAndStats = new JPanel();
        picAndStats.setLayout(new GridLayout(0,2));

        picAndStats.add(pic);
        picAndStats.add(statusInfo);

        info.add(pokemonList);
        info.add(status);
        info.add(feed);
        info.add(back);

        c.add(info);
        c.add(picAndStats);





        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
