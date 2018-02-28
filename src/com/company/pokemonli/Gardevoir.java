package com.company.pokemonli;

import com.company.Pokemon;

public class Gardevoir extends Pokemon {

    public Gardevoir(String name, float weight, float stepLength){
        super(name, weight, stepLength, 1f, new String[] {"Psychic"});
    }

    //Skill
    public void skillPhychic(){
        System.out.println("Use Phychic");
    }
}
