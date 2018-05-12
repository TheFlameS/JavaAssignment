package com.company;

public class Pokemon {

    //Pokemon Superclass

    private String name;
    protected float weight;
    protected float stepLength;
    protected int step;
    protected float gainingWeightStep;
    protected String[] types;
    protected double mood;

    //Constructor
    public Pokemon(String name,
                   float weight,
                   float stepLength,
                   float gainingWeightStep,
                   String[] types){
        this.name = name;
        this.weight = weight;
        this.stepLength = stepLength;
        this.gainingWeightStep = gainingWeightStep;
        this.mood = Math.random();
        step = 0;

        if(types == null)
            this.types = new String[] {"normal"};
        else
            this.types = types;
    }

    public void walk(int stepIncrease){
        step += stepIncrease;
    }

    public void eat(){
        weight += gainingWeightStep;
    }

    public void print(){
        System.out.println("Pokemon name: " + name);
        System.out.print("        Type: ");
        for(String type: types){
            System.out.print(type+",");
        }
        System.out.println();
        System.out.println("      Weight: " + weight);
        System.out.println(" Step length: " + stepLength);
        System.out.println("  Today Step: " + step);
        System.out.println("------------------------------------------");
    }

    public String getName() {
        return name;
    }

    public double getMood() {
        return mood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printGui(){
        String typePoke = "";
        for(String type: types){
            typePoke += type+ ", ";
        }
        typePoke += "/n";

        return "Name : " + name + "/n"
                + "Type : " + typePoke + "/n"
                + "Weight : " + weight + "/n"
                + "Step length : " + stepLength + "/n"
                + "Today : " + step;
    }
}
