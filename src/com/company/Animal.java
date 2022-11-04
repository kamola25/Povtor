package com.company;
public abstract class Animal {
    private int age;
    private Color color;
    private String name;



    public Animal(int age, Color color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;

    }public void makeVoice(){

    }
}
