package com.company.gui;

import com.company.PokemonFarm;
import com.company.pokemonli.Bruxish;
import com.company.pokemonli.Gardevoir;
import com.company.pokemonli.Litwick;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGui extends JFrame {

    private String[] pokemonList = {"Bruxish",
                                    "Litwick",
                                    "Gardevoir"};
    private PokemonFarm pokemonFarm;

    public AddGui(PokemonFarm pokemonFarm) {
        super("Adding");

        this.pokemonFarm = pokemonFarm;

        Container c = getContentPane();
        c.setLayout(new GridLayout(0,2));

        JComboBox choosePokemon = new JComboBox(pokemonList);

        //pokemon type, name, weight, length
        JLabel typeLabel = new JLabel("Type : ",10);
        JLabel nameLabel = new JLabel("Name : ",10);
        JLabel weightLabel = new JLabel("Weight : ",10);
        JLabel lengthLabel = new JLabel("Length : ",10);

        //input type, name, weight, length
        //JPanel choose type
        JPanel choose = new JPanel();
        choose.setLayout(new FlowLayout());

        choose.add(choosePokemon);
        choose.add(typeLabel);

        JTextField nameFeild = new JTextField(10);
        JTextField weightFeild = new JTextField(10);
        JTextField lengthFeild = new JTextField(10);



        //button
        JButton add = new JButton("Add");
        JButton cancel = new JButton("cancel");

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type = (String) choosePokemon.getSelectedItem();
                String name = nameFeild.getText();
                float weight = Float.parseFloat(weightFeild.getText());
                float length = Float.parseFloat(lengthFeild.getText());

                if(type.equals("Bruxish")){
                    Bruxish bruxish = new Bruxish(name,weight,length);
                    pokemonFarm.addPokemon(bruxish);
                }
                else if(type.equals("Litwick")){
                    Litwick litwick = new Litwick(name,weight,length);
                    pokemonFarm.addPokemon(litwick);
                }
                else if(type.equals("Gardevoir")){
                    Gardevoir gardevoir = new Gardevoir(name,weight,length);
                    pokemonFarm.addPokemon(gardevoir);
                }

                setVisible(false);
            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        choosePokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = (String) choosePokemon.getSelectedItem();
                switch (msg){
                    case "Bruxish": typeLabel.setText("You choose Bruxish");break;
                    case "Litwick": typeLabel.setText("You choose Litwick");break;
                    case "Gardevoir": typeLabel.setText("You choose Gardevoir");break;
                }

            }
        });



        c.add(typeLabel);
        c.add(choose);
        c.add(nameLabel);
        c.add(nameFeild);
        c.add(weightLabel);
        c.add(weightFeild);
        c.add(lengthLabel);
        c.add(lengthFeild);
        c.add(add);
        c.add(cancel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

}
