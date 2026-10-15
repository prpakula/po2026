package agh.po.lab2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Integer> lista1 = new ArrayList<>();
        int liczba;

        for(int i=1;i<7;i++){
            liczba = rand.nextInt(50)+1;
            if(lista1.contains(liczba)){
                i--;
                continue;
            } else{
                lista1.add(liczba);
            }
        }

        System.out.println(lista1);
        System.out.println('Wypisz 6 liczb od 1 do 49 po spacji');

       ArrayList<Integer> lista2 = new ArrayList<>();

       while(int i<7){
           lista2.add()

        }

    }
}

