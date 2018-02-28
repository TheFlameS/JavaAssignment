package com.company;

import com.company.wildpokemo.Nidoran;
import com.company.wildpokemo.Pidgey;
import com.company.wildpokemo.Rattata;

import java.util.Random;

public class Forest {

    private Random random;
    private int pokemonNo;
    private Pokemon wild;


    public Forest() {
        this.random = new Random();
        pokemonNo = 0;
    }

    public void randomPokemon(){
        pokemonNo = random.nextInt(3)+1;
        if(pokemonNo == 1){
            wild = new Pidgey("Wild",random.nextInt(19)+1,2f);
            System.out.println("Pidgey!!");
        }
        else if(pokemonNo == 2){
            wild = new Rattata("Wild",random.nextInt(9)+1,0.7f);
            System.out.println("Rattata!!");
        }
        else if(pokemonNo == 3){
            wild = new Nidoran("Wild",random.nextInt(20)+10,1.4f);
            System.out.println("Nidoran!!");
        }
    }

    public Pokemon getWild() {
        return wild;
    }
}
