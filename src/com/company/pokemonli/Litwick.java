package com.company.pokemonli;

import com.company.Pokemon;

public class Litwick extends Pokemon {

    public Litwick(String name, float weight, float stepLength){
        super(name, weight, stepLength, 0.6f, new String[] {"Ghost"});
    }

    //Skill
    public void skillFlashFire(){
        System.out.println("Use Flash Fire");
    }
}
