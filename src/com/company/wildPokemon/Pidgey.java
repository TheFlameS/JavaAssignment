package com.company.wildPokemon;

import com.company.Pokemon;

public class Pidgey extends Pokemon {

    private double mood;

    public Pidgey(String name, float weight, float stepLength, float gainingWeightStep, String[] types) {
        super(name, weight, stepLength, gainingWeightStep, types);
        mood = Math.random();
    }

    public double getMood() {
        return mood;
    }

    public void skillQuickAtk(){
        System.out.println("Use Quick Attack");
    }
}
