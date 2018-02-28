package com.company.Item;

public class Ball {
    protected double opportunity;

    public Ball() {
        this.opportunity = 0;
    }

    public double getOpportunity() {
        return opportunity;
    }

    public boolean catchPokemon(double mood){
        if((mood * opportunity) > 0.5){
            return true;
        }
        else {
            return false;
        }
    }
}
