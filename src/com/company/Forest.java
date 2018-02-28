package com.company;

import java.util.Random;

public class Forest {

    private Random random;
    private int pokemonNo;


    public Forest() {
        this.random = new Random();
        pokemonNo = 0;
    }

    public int randomPokemon(){
        pokemonNo = random.nextInt();
    }


}
