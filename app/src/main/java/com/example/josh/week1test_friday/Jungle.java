package com.example.josh.week1test_friday;

import java.util.ArrayList;

public class Jungle {

    static ArrayList<Animal> animals = new ArrayList();

    public static void main(String[] args) {
        animals.add(new Tiger());
        animals.add(new Monkey());
        animals.add(new Snake());

        allEat();
        allEat();
        allEat();
        allEat();
        soundOff();
    }

    public Jungle(){

    }

    public static void soundOff(){
        for(Animal i : animals){
            i.sound();
        }
    }

    public static void allEat(){
        for(Animal i : animals){
            i.eat("food");
        }
    }
}
