package com.company.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui extends JFrame{
    public MainGui (){
        super("Pokemon");

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        //Top Menu Section
        JPanel jPanelTopMenu = new JPanel();
        jPanelTopMenu.setLayout(new FlowLayout());

        JRadioButton farm = new JRadioButton("Farm");
        JRadioButton forest = new JRadioButton("Forest");

        jPanelTopMenu.add(farm);
        jPanelTopMenu.add(forest);

        farm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Blah");
            }
        });

        forest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Blah");
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
                System.out.println("Blah");
            }
        });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Blah");
            }
        });

        feed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Blah");
            }
        });

        c.add(jPanelBottomBtn, BorderLayout.PAGE_END);

        //center
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(0,2));

        JLabel pokemonIcon = new JLabel("");
        JLabel pokemonStatus = new JLabel("There is nothing...");
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
