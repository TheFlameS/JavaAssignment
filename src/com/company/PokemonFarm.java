package com.company;

import com.company.pokemonli.Bruxish;
import com.company.pokemonli.Gardevoir;
import com.company.pokemonli.Litwick;

import java.util.ArrayList;

public class PokemonFarm {

    private ArrayList<Pokemon> pokemons;

    public PokemonFarm(){
        pokemons = new ArrayList<Pokemon>();
        pokemons.add(new Bruxish("first", 888, 10));
        pokemons.add(new Litwick("second", 999, 11));
        pokemons.add(new Gardevoir("third", 101010, 12));
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

    public int getPokemonAmount(){
        return pokemons.size();
    }

    public String getPokemonName(int i){
        return pokemons.get(i).getName();
    }

    public Pokemon getPokemon(String name){
        Pokemon now = null;
        for(Pokemon pokemon: pokemons){
            if (pokemon.getName().equals(name)){
                return pokemon;
            }
        }
        return now;
    }
}
