package com.company.wildpokemo;

import com.company.Pokemon;

public class Pidgey extends Pokemon {

    public Pidgey(String name, float weight, float stepLength) {
        super(name, weight, stepLength, 1f, new String[] {"Flying"});
    }

    public void skillQuickAtk(){
        System.out.println("Use Quick Attack");
    }
}
