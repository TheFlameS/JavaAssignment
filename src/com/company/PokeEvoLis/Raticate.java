package com.company.PokeEvoLis;

import com.company.wildPokemon.Rattata;

public class Raticate extends Rattata{

    public Raticate(String name, float weight, float stepLength) {
        super(name, weight, stepLength);
    }

    public void skillTailWhip(){
        System.out.println("Use Tail Whip");
    }

}
