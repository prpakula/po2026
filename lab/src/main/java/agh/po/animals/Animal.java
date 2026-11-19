package agh.po.animals;

public abstract class Animal {
    public String name;
    public int legs;

    abstract String getDescription();

    public int getLegs(){

        return legs;
    }
    abstract void makeSound();

}
