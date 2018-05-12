package com.company.gui;

import com.company.Bag;
import com.company.Forest;
import com.company.Pokemon;
import com.company.PokemonFarm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForestGui extends JFrame {

    private Bag bag;
    private Forest forest;
    private PokemonFarm pokemonFarm;
    private String[] ballList = {"Pokeball",
                                 "Greatball",
                                 "Ultraball"};

    private Pokemon wild;

    public ForestGui(PokemonFarm pokemonFarm) {
        this.bag = new Bag();
        this.forest = new Forest();
        this.pokemonFarm = pokemonFarm;

        Container c = getContentPane();
        c.setLayout(new GridLayout(0,1));

        JLabel pokemonIcon = new JLabel();
        pokemonIcon.setHorizontalAlignment(JLabel.CENTER);
        Icon img = new ImageIcon(getClass().getResource("./image_files/Finding.png"));
        pokemonIcon.setIcon(img);

        c.add(pokemonIcon);

        JPanel commandBtn = new JPanel();
        commandBtn.setLayout(new FlowLayout());

        JButton find = new JButton("Find");
        JButton catchPokemon = new JButton("Catch");
        JButton back = new JButton("Back to farm");

        JComboBox chooseBall = new JComboBox(ballList);

        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                forest.randomPokemon();

                int wildNo = forest.getPokemonNo();
                wild = forest.getWild();

                JOptionPane.showMessageDialog(null, "Found Something!!!");

                if(wildNo == 1){
                    pokemonIcon.setIcon(new ImageIcon(getClass().getResource("./image_files/Pidgey.png")));
                }
                else if(wildNo == 2){
                    pokemonIcon.setIcon(new ImageIcon(getClass().getResource("./image_files/Rattata.png")));
                }
                else if(wildNo == 3){
                    pokemonIcon.setIcon(new ImageIcon(getClass().getResource("./image_files/Nidoran.png")));
                }
            }
        });

        catchPokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bag.useBall((String) chooseBall.getSelectedItem(),forest.getWild());


            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pokemonFarm.transfer(bag.getPokemons());
                setVisible(false);
            }
        });

        commandBtn.add(find);
        commandBtn.add(chooseBall);
        commandBtn.add(catchPokemon);
        commandBtn.add(back);

        c.add(commandBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
