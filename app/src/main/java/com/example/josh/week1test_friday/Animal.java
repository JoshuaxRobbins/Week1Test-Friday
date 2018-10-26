package com.example.josh.week1test_friday;

public class Animal {

    private int energy;
    private static int group;

    public Animal(){
        energy = 0;
        group++;
    }

    public Animal(int energy){
        this.energy = energy;
        group++;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public static void setGroup(int group) {
        Animal.group = group;
    }

    public static int getGroup() {
        return group;
    }

    public void sound(){
        energy -= 3;
        System.out.print(energy);
    }
    public void eat(String food){
        energy+=5;
    }
    public void sleep(){
        energy+=10;
    }
}
