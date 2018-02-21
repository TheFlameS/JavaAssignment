package com.company.pokemonLis;

import com.company.Pokemon;

public class Bruxish extends Pokemon {

    public Bruxish(String name, float weight, float stepLength){
        super(name, weight, stepLength, 1f, new String[] {"Water"});
    }

    //Skill
    public void skillStrongJaw(){
        System.out.println("Use Strong Jaw");
    }
}
