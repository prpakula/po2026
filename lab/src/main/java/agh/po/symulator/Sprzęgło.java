package agh.po.symulator;

public class Sprzęgło extends Komponent{
    protected boolean stanSprzegla;

    public Sprzęgło(String nazwa, double waga, double cena){

        super(nazwa,waga,cena);
        this.stanSprzegla = false;
    }

    public void wcisnij(){
        this.stanSprzegla = true;
    }

    public void zwolnij(){
        this.stanSprzegla = false;
    }

    public boolean getStanSprzegla(){
        return stanSprzegla;
    }
}
