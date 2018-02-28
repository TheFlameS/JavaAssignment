package com.company.pokeevoli;

import com.company.pokemonli.Skiddo;

public class Gogoat extends Skiddo {

    public Gogoat(String name, float weight, float stepLength) {
        super(name, weight, stepLength);
    }

    @Override
    public void eat() {
        this.weight += (gainingWeightStep/2) ;
    }

    public void skill(){
        System.out.println("Use ");
    }
}
