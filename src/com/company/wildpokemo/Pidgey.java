package com.company.wildpokemo;

import com.company.Pokemon;

public class Pidgey extends Pokemon {

    public Pidgey(String name, float weight, float stepLength, float gainingWeightStep, String[] types) {
        super(name, weight, stepLength, gainingWeightStep, types);
    }

    public void skillQuickAtk(){
        System.out.println("Use Quick Attack");
    }
}
