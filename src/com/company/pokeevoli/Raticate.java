package com.company.pokeevoli;

import com.company.wildpokemo.Rattata;

public class Raticate extends Rattata{

    public Raticate(String name, float weight, float stepLength) {
        super(name, weight, stepLength);
    }

    @Override
    public void eat() {
        this.weight += (gainingWeightStep/2) ;
    }

    public void skillTailWhip(){
        System.out.println("Use Tail Whip");
    }

}
