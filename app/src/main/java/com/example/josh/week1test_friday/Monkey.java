package com.example.josh.week1test_friday;

public class Monkey extends Animal {

    @Override
    public void eat(String food) {
        this.setEnergy(this.getEnergy()+2);
    }

    @Override
    public void sound() {
        this.setEnergy(this.getEnergy()-4);
        System.out.println(this.getEnergy() + " Ooo ooo");
    }

    public void play(){
        if(this.getEnergy()>8){
            System.out.println("Oooo Oooo Oooo");
        }
        else{
            System.out.println("Monkey is too tired.");
        }
    }
}
