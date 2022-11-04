package com.company;

public class Reptiles extends Animal{

    private int longReptiles;

    public Reptiles(int age, Color color, String name, int longReptiles) {
        super(age, color, name);
        this.longReptiles = longReptiles;
    }

    public int getLongReptiles() {
        return longReptiles;
    }
}
