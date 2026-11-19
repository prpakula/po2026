package agh.po.symulator;

public class Silnik extends Komponent{
    protected int maxobroty;
    protected int obroty;

    public Silnik(String nazwa, double waga, double cena){
        super(nazwa,waga,cena);
        this.maxobroty = maxobroty;
        this.obroty = 0;
    }

    public void uruchom(){
        if(obroty == 0){
            this.obroty = 800;
        } else {
            this.obroty = obroty;
        }
    }

    public void zatrzymaj(){
        this.obroty = 0;
    }

    public  void  zmniejjszObroty(){
        if(obroty >= 1200){
            this.obroty -= 500;
        }
    }

    public void zwiekszObroty(){
        if(obroty > 0 && obroty+500<=maxobroty){
            this.obroty += 500;
        }
    }



}
