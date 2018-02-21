package com.company;

import java.util.Random;

public class Bag {
    Random rand;
    int ballNo;

    public Bag() {
        this.rand = new Random();
    }

    public int pickBall() {
        this.ballNo = rand.nextInt(3) + 1;
        return ballNo;
    }
}
