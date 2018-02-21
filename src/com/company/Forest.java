package com.company;

import com.company.wildPokemon.Pidgey;

import java.util.Random;

public class Forest {
    Random random;
    int pokemonNo;

    public Forest() {
        this.random = new Random();
        pokemonNo = 0;
    }

    public int randomPokemon(){
        pokemonNo = random.nextInt();
    }

    
}
