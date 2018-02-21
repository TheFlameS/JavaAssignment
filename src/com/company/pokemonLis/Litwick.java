package com.company.pokemonLis;

import com.company.Pokemon;

public class Litwick extends Pokemon {

    public Litwick(String name, float weight, float stepLength){
        super(name, weight, stepLength, 1f, new String[] {"Ghost"});
    }

    //Skill
    public void skillFlashFire(){
        System.out.println("Use Flash Fire");
    }
}
