package com.company.pokeevoli;

import com.company.wildpokemo.Pidgey;

public class Pidgeot extends Pidgey {

    public Pidgeot(String name, float weight, float stepLength, float gainingWeightStep, String[] types) {
        super(name, weight, stepLength);
        mood = Math.random();
    }

    @Override
    public void eat() {
        this.weight += (gainingWeightStep/2) ;
    }

    public void skillWhirlwind(){
        System.out.println("Use Whirlwind");
    }

}
