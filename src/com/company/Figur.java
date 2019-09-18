package com.company;

public abstract class Figur {
    protected Punkt startpunkt; //implementation av aggregat    //figur BESTÅR AV Punkt

    //konstruktor
    public Figur() {
        startpunkt = new Punkt();
        System.out.println("spårutskrift i Figur defaultkonstruktor");
    }

    public Figur(int x, int y) {
        startpunkt = new Punkt(x, y);
        System.out.println("spårutskrift i Figur konstruktor(int x, int y)");
    }

    public Figur(Punkt p) {
        startpunkt = new Punkt(p);  //startpunkt = p;
        System.out.println("spårutskrift i Figur konstruktor(Punkt p)");
    }

    void setStartpunkt(Punkt p) {
        startpunkt.setX(p.getX()); //ändra startpunkts X till objektet p (av klassen Punkt)s X
        startpunkt.setY(p.getY()); //ändra startpunkts Y till objektet p (av klassen Punkt)s Y
    }

    public Punkt getStartpunkt() {
        return startpunkt;
    }

    void printInfo() {
        System.out.print("figur har ");
        startpunkt.printInfo();
    }
}
