package agh.po.animals;

import java.util.ArrayList;
import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
       // ArrayList<Animal> list = new ArrayList<>();

        Animal[] animals = new Animal[100];
        Random rand = new Random();

        for (int i = 0; i< animals.length;i++){
            int los = rand.nextInt(3);

            if(los==0){
                animals[i] = new Dog("Pies"+i);
            } else if(los==1){
                animals[i] = new Parrot("Papuga"+i);
            }else if(los==2){
                animals[i] = new Snake("Wąż"+i);
            }


        }
        int ileNog = 0;
        for(Animal animal : animals){
            ileNog += animal.getLegs();

            System.out.println(animal.getDescription());
            animal.makeSound();
        }
        System.out.println("Suma nóg zwierząt wynosi: "+ileNog);


    }
}
