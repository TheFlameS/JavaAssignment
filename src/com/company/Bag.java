package com.company;

import com.company.Item.Greatball;
import com.company.Item.Pokeball;
import com.company.Item.Ultraball;
import com.company.gui.NameInputGui;

import java.util.ArrayList;
import java.util.Scanner;

public class Bag {
    private ArrayList <Pokemon> pokemons;
    private boolean success;
    private Scanner sc;

    public Bag() {
        this.pokemons = new ArrayList<Pokemon>();
        sc = new Scanner(System.in);
    }

    public void useBall(String choose, Pokemon wild) {

        String name = "";
        if(choose.equals("Pokeball")){
            Pokeball pokeball = new Pokeball();
            success = pokeball.catchPokemon(wild.getMood());
        }
        else if(choose.equals("Greatball")){
            Greatball greatball = new Greatball();
            success = greatball.catchPokemon(wild.getMood());
        }
        else if(choose.equals("Ultraball")){
            Ultraball ultraball = new Ultraball();
            success = ultraball.catchPokemon(wild.getMood());
        }

        if(success){
            System.out.print("Success ! , Need the name : ");
            new NameInputGui(name);
            wild.setName(name);
            add(wild);
        }
        else {
            System.out.println("Failed, escaped...");
        }

    }

    private void add(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }
}
