package agh.po.animals;

public class Dog extends Animal {
    public Dog(String imie){
        this.name = imie;
        this.legs = 4;
    }

    @Override
    String getDescription(){
        return "Pies " + name + ", nogi: " + legs;
    }

    @Override
    void makeSound(){
        System.out.println("Hau Hau");
    }
}
