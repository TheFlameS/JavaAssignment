package com.company;

import com.company.pokemonLis.Bruxish;
import com.company.pokemonLis.Gardevoir;
import com.company.pokemonLis.Litwick;

import java.util.Scanner;

public class CommandParser {
    // Scanner run feed add from user

    private PokemonFarm pokemonFarm;
    private Scanner scanner;
    private boolean isRunning;

    public CommandParser(PokemonFarm pokemonFarm) {
        this.pokemonFarm = pokemonFarm;
        scanner = new Scanner(System.in);
        isRunning = false;
    }

    public void run(){
        isRunning = true;
        String command;
        while (isRunning){
            command = scanner.next();
            if(command.equals("quit")){
                isRunning = false;
            }
            else if(command.equals("add")){
                this.addPokemon();
            }
            else if(command.equals("list")){
                this.listPokemons();
            }
            else if(command.equals("feed")){
                this.feedPokemons();
            }
            else if(command.equals("exercise")){
                this.exercise();
            }

        }
    }

    private void addPokemon(){
        scanner.nextLine();
        //Input type name weight length;
        System.out.print("Input type, name, weight, length respectively: ");
        String pokemonType = this.scanner.next();
        String name = this.scanner.next();
        float weight = this.scanner.nextFloat();
        float stepLength = this.scanner.nextFloat();

        if(pokemonType.equals("Bruxish")){
            Bruxish bruxish = new Bruxish(name,weight,stepLength);
            pokemonFarm.addPokemon(bruxish);
        }
        else if(pokemonType.equals("Litwick")){
            Litwick litwick = new Litwick(name,weight,stepLength);
            pokemonFarm.addPokemon(litwick);
        }
        else if(pokemonType.equals("Gardevoir")){
            Gardevoir gardevoir = new Gardevoir(name,weight,stepLength);
            pokemonFarm.addPokemon(gardevoir);
        }
    }
    private void listPokemons(){
        System.out.println("==========================================");
        System.out.println("Pokemon List");
        System.out.println("==========================================");
        this.pokemonFarm.list();
        System.out.println("==========================================");
    }

    private void feedPokemons(){
        System.out.print("Which pokemon do you want to feed? ");
        String name = this.scanner.next();
        this.pokemonFarm.feed(name);
        System.out.println("done eating!");
    }

    private void exercise(){
        System.out.print("Choose pokemon? and how long? ");
        String name = this.scanner.next();
        int time = this.scanner.nextInt();
        this.pokemonFarm.walk(name, time);
        System.out.println("done~");
    }
}
