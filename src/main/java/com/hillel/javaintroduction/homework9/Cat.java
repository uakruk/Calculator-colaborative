package com.hillel.javaintroduction.homework9;

public class Cat extends Animal {
    private String boss;

    public void pissToShoes() {

        System.out.println("Pee-pee, boss.");
    }

    @Override
    public void eat() {
        System.out.println("I'm cat and I'm eating");
    }

    public void eat(String what) {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "boss='" + boss + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }
}
