package com.company.pokeevoli;

import com.company.wildpokemo.Pidgey;

public class Pidgeot extends Pidgey {

    private double mood;

    public Pidgeot(String name, float weight, float stepLength, float gainingWeightStep, String[] types) {
        super(name, weight, stepLength, gainingWeightStep, types);
        mood = Math.random();
    }

    @Override
    public double getMood() {
        return mood;
    }

    public void skillWhirlwind(){
        System.out.println("Use Whirlwind");
    }


}
