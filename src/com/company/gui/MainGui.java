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

            }
        });

        forest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(0,2));

        JLabel pokemonIcon = new JLabel("");
        JLabel pokemonStatus = new JLabel("There is nothing... pls add some pokemon");
        Icon img = new ImageIcon(getClass().getResource("./image_files/Nothing.png"));
        pokemonIcon.setIcon(img);

        center.add(pokemonIcon);
        center.add(pokemonStatus);

        c.add(center, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }


}
