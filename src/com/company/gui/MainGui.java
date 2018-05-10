package com.company.gui;

import javax.swing.*;
import java.awt.*;

public class MainGui extends JFrame{
    public MainGui (){
        super("Pokemon");

        Container c = getContentPane();
        c.setLayout(new GridLayout(2,2));

        JPanel jPanel = new JPanel();
        jPanel.setLayout();

        JLabel jLabel = new JLabel("Something");

        c.add(jLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
