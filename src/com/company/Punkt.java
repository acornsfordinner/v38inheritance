package com.company;

public class Punkt {
    private int x;
    private int y;

    public Punkt() { //defaultkonstruktor
        x = 0;
        y = 0;
        System.out.println("spårutskrift i Punkt defaultkonstruktor");
    }

    public Punkt(int x, int y) {
        setX(x);
        setY(y);
        System.out.println("spårutskrift i Punkt konstruktor(int x, int y)");
    }
    public Punkt(Punkt p){
        setX(p.x);          //setX(p.getX);
        setY(p.getY());     //setY(p.y);
        System.out.println("spårutskrift i Punkt konstruktor(Punkt p)");
    }


    public void setX(int x) {
        if (x >= 0)
            this.x = x;
        else this.x = 0;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        if (y >= 0)
            this.y = y;
        else this.y = 0;
    }

    public int getY() {
        return y;
    }

    public void printInfo() {
        System.out.printf("punkt på plats X = %d\tY = %d ", x, y);
    }
}
