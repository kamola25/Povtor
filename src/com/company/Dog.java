package com.company;
public class Dog extends Animal{
    public Dog(int age, Color color, String name) {
        super(age, color, name);
    }


    @Override
    public void makeVoice() {
        super.makeVoice();

    }
    public String toString() {
        return "Animal{" +
                "\nage=" + this.getAge() +
                "\ncolor=" + this.getColor() +
                "\nname='" + this.getName() + '\'' +"}";
    }
    public String toString(String names){
     return "Название: " + this.getName()
     + "\nВозраст: "+ this.getAge();
    }
    public String toString(int age){
        if (age<=0){
            String a = "Это не животное!";
            return  a;
        }else{
            String b = "Данному животному: "+ this.getAge() +" года";
            return b;
        }
    }


}
