package com.company.wildpokemo;

import com.company.Pokemon;

public class Nidoran extends Pokemon {

    public Nidoran(String name, float weight, float stepLength) {
        super(name, weight, stepLength, 3f, new String[] {"Poison"});
    }

    public void skillPoisonJab(){
        System.out.println("Use Poison Jab");
    }
}
