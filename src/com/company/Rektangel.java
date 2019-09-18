package com.company;

public class Rektangel extends Figur {   //Härledd klass. behöver bara beskiva skillnaden mellan denna och dens SUPER
    private Punkt slutpunkt;

    public Rektangel() { //defaultconstruktor //AUTOMATISKT anrop till super();
        slutpunkt = new Punkt();
        System.out.println("spårutskrift i Rektangel defaultkonstruktor");
    }

    /*
    superklassen figur består av en punkt. denna klass har en punkt till, som heter slutpunkt.
    ett objekt av denna klass består av två punkter: en ärvd och en specifik för denna klass.
     */
    public Rektangel(Punkt start, Punkt stopp) { //
        super(start);
        slutpunkt = new Punkt(stopp);
        System.out.println("spårutskrift i Rektangel konstruktor(Punkt start, Punkt stopp");
    }

public Rektangel(int x1, int y1, int x2, int y2) {
        super(x1,y1);
        slutpunkt = new Punkt(x2,y2);
        System.out.println("spårutskrift i Rektangel konstruktor(int x1, int x2, int y1, int y2");
    }

    public void setSlutpunkt(Punkt p) {
        this.slutpunkt = p;
    }

    public Punkt getSlutpunkt() {
        return this.slutpunkt;
    }
    public void printInfo(){
        System.out.print("Rektangel med slutpunkt ");
        slutpunkt.printInfo();
        super.printInfo();
    }
}