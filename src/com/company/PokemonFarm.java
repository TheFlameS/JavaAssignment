package com.company;

import com.company.pokemonli.Bruxish;

import java.util.ArrayList;

public class PokemonFarm {

    private ArrayList<Pokemon> pokemons;

    public PokemonFarm(){
        pokemons = new ArrayList<Pokemon>();
        pokemons.add(new Bruxish("first", 888, 10));
    }

    public void addPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    public void list(){
        for(Pokemon pokemon: pokemons){
            pokemon.print();
        }
    }

    public void feed(String pokemonName){
        if(pokemonName.equals("all")){
            for(Pokemon pokemon: pokemons){
                pokemon.eat();
            }
        }
        else {
            for(Pokemon pokemon: pokemons){
                if(pokemonName.equals(pokemon.getName())){
                    pokemon.eat();
                }
            }
        }
    }

    public void walk(String pokemonName, int time){
        if(pokemonName.equals("all")){
            for(Pokemon pokemon: pokemons){
                pokemon.walk(time);
            }
        }
        else {
            for(Pokemon pokemon: pokemons){
                if(pokemonName.equals(pokemon.getName())){
                    pokemon.walk(time);
                }
            }
        }
    }

    public void transfer(ArrayList<Pokemon> fromBag){
        for(Pokemon pokemon: fromBag){
            addPokemon(pokemon);
        }
    }


}
