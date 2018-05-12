package com.company.gui;

import com.company.Bag;
import com.company.Forest;
import com.company.Pokemon;
import com.company.PokemonFarm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui extends JFrame {

    private PokemonFarm pokemonFarm;
    private Forest forest;
    private Bag bag;

    public MainGui (PokemonFarm pokemonFarm){
        super("Pokemon");

        this.pokemonFarm = pokemonFarm;

        //GUI
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        //Top Menu Section
        JPanel jPanelTopMenu = new JPanel();
        jPanelTopMenu.setLayout(new FlowLayout());

        JButton farm = new JButton("Farm");
        JButton forest = new JButton("Forest");

        jPanelTopMenu.add(farm);
        jPanelTopMenu.add(forest);

        farm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Just press 'List' if you want to see your pokemon that you have");
            }
        });

        forest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ForestGui(pokemonFarm);
            }
        });

        c.add(jPanelTopMenu, BorderLayout.PAGE_START);

        //Bottom Btn Section
        JPanel jPanelBottomBtn = new JPanel();
        jPanelBottomBtn.setLayout(new FlowLayout());

        JButton list = new JButton("List");
        JButton add = new JButton("Add");
        JButton feed = new JButton("Feed");

        jPanelBottomBtn.add(list);
        jPanelBottomBtn.add(add);
        jPanelBottomBtn.add(feed);

        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddGui(pokemonFarm);
            }
        });

        feed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        c.add(jPanelBottomBtn, BorderLayout.PAGE_END);

        //center
        JLabel pokemonIcon = new JLabel("");
        Icon img = new ImageIcon(getClass().getResource("./image_files/Start.png"));
        pokemonIcon.setIcon(img);


        c.add(pokemonIcon, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }


}
