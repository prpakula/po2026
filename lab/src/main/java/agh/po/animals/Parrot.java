package agh.po.animals;

public class Parrot extends Animal {

    public Parrot(String imie) {
        this.name = imie;
        this.legs = 2;
    }

    @Override
    String getDescription(){
        return "";
    }
}
