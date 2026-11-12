package agh.po.animals;

public class Snake extends Animal{

    public Snake (String imie){
        this.name = imie;
        this.legs=0;
    }

    @Override
    String getDescription(){
        return "";
    }
}
