package com.company.wildPokemon;

import com.company.Pokemon;

public class Rattata extends Pokemon{

    public Rattata(String name, float weight, float stepLength){
        super(name, weight, stepLength, 1f, new String[] {"Normal"});
    }

    public void skillTackle(){
        System.out.println("Use Tackle");
    }

}
