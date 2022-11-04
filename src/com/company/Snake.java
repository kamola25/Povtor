package com.company;

public class Snake extends Reptiles{


    public Snake(int age, Color color, String name, int longReptiles) {
        super(age, color, name, longReptiles);

    } public String toString() {
        return "Reptiles{" +
                "\nage = " + this.getAge() +
                "\ncolor = " + this.getColor() +
                "\nlong = " + this.getLongReptiles() + " cm"+
                "\nname = " + this.getName()  +" }";
    }
    public String toString(String names){
        return "Имя:" + this.getName()
                + "\nВозраст:"+ this.getAge();
    }
    public boolean toString(int age){
        if (age<=0){
            System.out.println("Это не животное!");
        }else{
            System.out.println("Данному животному:"+ this.getAge() + " лет");
        }
        return true;
    }
}
