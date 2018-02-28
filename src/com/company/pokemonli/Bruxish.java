package com.company.pokemonli;

import com.company.Pokemon;

public class Bruxish extends Pokemon {

    public Bruxish(String name, float weight, float stepLength){
        super(name, weight, stepLength, 2.2f, new String[] {"Water"});
    }

    //Skill
    public void skillStrongJaw(){
        System.out.println("Use Strong Jaw");
    }
}
