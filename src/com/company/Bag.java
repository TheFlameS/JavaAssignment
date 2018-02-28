package com.company;

import java.util.ArrayList;

public class Bag {
    private ArrayList <Pokemon> Pokemons;


    public Bag() {
        this.Pokemons = new ArrayList<Pokemon>();
    }

    public void pickBall(String choose) {
        if(choose.equals("pokeball")){

        }
        else if(choose.equals("greatball")){

        }
        else if(choose.equals("ultraball")){

        }
    }

    public void add(Pokemon pokemon){
        Pokemons.add(pokemon);
    }
}
