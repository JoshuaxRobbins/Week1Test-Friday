package com.example.josh.week1test_friday;

public class Tiger extends Animal {

    @Override
    public void sleep() {
        this.setEnergy(this.getEnergy() + 5);
    }

    @Override
    public void eat(String food) {
        if(!food.equals("grain")){
            this.setEnergy(this.getEnergy()+5);
        }
    }

    @Override
    public void sound() {
        super.sound();
        System.out.print(" Roar");
        System.out.println();
    }
}
