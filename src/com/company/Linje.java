package com.company;

public class Linje extends Figur {
    private Punkt slutpunkt;
    //defaultkonstruktor
    public Linje(){
        slutpunkt = new Punkt();
        System.out.println("spårutskrift i Linje defaultkonstruktor");
    }
    /*
    superklassen figur består av en punkt. denna klass har en punkt till, som heter slutpunkt.
    ett objekt av denna klass består av två punkter: en ärvd och en specifik för denna klass.
     */
    public Linje(Punkt start, Punkt stopp){
        super(start);
        slutpunkt = new Punkt(stopp);
        System.out.println("spårutskrift i Linje konstruktor(Punkt start, Punkt stopp");
    }
    public Linje(int x1, int y1, int x2,int y2){
        super(x1,y1);
        slutpunkt = new Punkt(x2,y2);
        System.out.println("spårutskrift i Linje konstruktor(int x1, int y1, int x2, int y2)");
    }

    public void setLinje(Punkt p){

    }
    public Punkt getLinje(){
        return slutpunkt;
    }

    @Override
    public void printInfo(){
        System.out.print("Linje med slut");
        slutpunkt.printInfo();
        super.printInfo();
    }
}
