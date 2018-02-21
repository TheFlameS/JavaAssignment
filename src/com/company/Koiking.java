package com.company;

public class Koiking {

    private float steplenght;
    private int step;
    private String name;
    private int weight;

    public Koiking(String name) {
        this.steplenght = (int)((Math.random()*10)+1);
        this.step = 0;
        this.weight = (int) (Math.random()*100);
        this.name = name;
    }

    public void shout() {
        System.out.print("Boo Boo");
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public float getDistance() {
        return step * steplenght;
    }

    public void swim(int step) {
        this.step += 3*step;
        if(this.weight > 2)this.weight -= 2;
    }

    public void jump(int step){
        this.step += step;
        if(this.weight > 1)this.weight -= 1;
    }


}
