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
            pokemonNameList[i] = pokemonFarm.getPokemonName(i);
        }

        //Top section
        JPanel infoComm = new JPanel();
        infoComm.setLayout(new FlowLayout());

        JComboBox pokemonList = new JComboBox(pokemonNameList);

        JButton status = new JButton("Status");
        JButton feed = new JButton("Feed");
        JButton back = new JButton("Back");

        //Picture and status
        Icon img = new ImageIcon(getClass().getResource("./image_files/Nothing.png"));
        JLabel pic = new JLabel();
        pic.setIcon(img);

        //Panel info
        JPanel info = new JPanel();
        info.setLayout(new GridLayout(0,1));

        JLabel nameInfo = new JLabel("There's nothing");
        JLabel typeInfo = new JLabel("");
        JLabel weightInfo = new JLabel("");
        JLabel stepLengthInfo = new JLabel("");
        JLabel stepInfo = new JLabel("");

        info.add(nameInfo);
        info.add(typeInfo);
        info.add(weightInfo);
        info.add(stepLengthInfo);
        info.add(stepInfo);

        status.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = (String) pokemonList.getSelectedItem();
                Pokemon present = pokemonFarm.getPokemon(name);
                pic.setIcon(new ImageIcon(getClass().getResource("./image_files/" + present.getClass().getSimpleName() + ".png")));
                nameInfo.setText("Name : " + present.getName());
                typeInfo.setText("Type : " + present.getTypes());
                weightInfo.setText("Weight : " + present.getWeight());
                stepLengthInfo.setText("Step length : " + present.getStepLength());
                stepInfo.setText("Step today : " + present.getStep());
            }
        });

        feed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = (String) pokemonList.getSelectedItem();
                Pokemon present = pokemonFarm.getPokemon(name);
                present.eat();
                weightInfo.setText("Weight : " + present.getWeight());
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JPanel picAndStats = new JPanel();
        picAndStats.setLayout(new GridLayout(0,2));

        picAndStats.add(pic);
        picAndStats.add(info);

        infoComm.add(pokemonList);
        infoComm.add(status);
        infoComm.add(feed);
        infoComm.add(back);

        c.add(infoComm);
        c.add(picAndStats);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
