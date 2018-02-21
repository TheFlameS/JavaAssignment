package com.company.pokemonLis;

import com.company.Pokemon;

public class Skiddo extends Pokemon {

    public Skiddo(String name, float weight, float stepLength){
        super(name, weight, stepLength, 3f, new String[] {"Grass"});
    }

    public void skillVineWhip(){
        System.out.println("Use Vine Whip");
    }
}
