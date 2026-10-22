package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Integer> lista1 = new ArrayList<>();
        int liczba;

        for(int i=1;i<7;i++){
            liczba = rand.nextInt(49)+1;
            if(lista1.contains(liczba)){
                i--;
                continue;
            } else{
                lista1.add(liczba);
            }
        }

        System.out.println("Wylosowane liczby: " + lista1);

       ArrayList<Integer> lista2 = new ArrayList<>();
       for(String arg : args) {
            lista2.add(Integer.parseInt(arg));
       }

       System.out.println("Wypisz typy po spacji: " + lista2);

        lista2.retainAll(lista1);
        System.out.println("Trafiłeś: " + lista2);
        System.out.println("A liczba trafów to: " + lista2.size());

        System.out.println("Start losowania");
        boolean trafienie = false;
        long liczbaLosowan = 0;
        long czasStart = System.currentTimeMillis();
        int nowaLiczba;

        while(!trafienie){
            liczbaLosowan++;
            ArrayList<Integer>nowaLista = new ArrayList<>();
            for(int i=1;i<7;i++){
                nowaLiczba = rand.nextInt(49)+1;
                if(nowaLista.contains(nowaLiczba)){
                    i--;
                } else{
                    nowaLista.add(nowaLiczba);
                }
            }
            if(nowaLista.containsAll(lista1)){
                trafienie = true;
            }

        }
        long czasStop = System.currentTimeMillis();
        long czasLacznie = czasStop - czasStart;
        System.out.println("Czas Losowania: " + czasLacznie);
        System.out.println("A liczba losowań: " + liczbaLosowan);

        }


}

