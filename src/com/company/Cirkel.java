package com.company;

//härledd klass. behöver bara beskriva skillnaden mellan denna klass och dens SUPERKLASS
public class Cirkel extends Figur {
    private int radie;

    public Cirkel() {    //defaultkonstruktor // automatiskt anrop till superklassens defaultkonstruktor
        setRadie(0);
        System.out.println("spårutskrift från Cirkel defaultkonstruktor");
    }

    public Cirkel(int x, int y, int r) {
        super(x, y);        //INGET AUTOMATISKT ANROP, EFTERSOM DET STÅR SUPER(parametrar)!!! måste stå först
        setRadie(r);
        System.out.println("spårutskrift från Cirkel konstruktor(int x, int y, int r)");
    }

    public Cirkel(Punkt p, int r) {
        super(p);
        setRadie(r);
        System.out.println("spårutskrift i Cirkel konstruktor(Punkt p, int r)");
    }

    public void setRadie(int radie) {
        if (radie > 0) {
            this.radie = radie;
        } else this.radie = 0;
    }

    public int getRadie() {
        return radie;
    }

    public void printInfo() {
        System.out.print("Cirkel med radie "+radie+" som ärver från ");
        super.printInfo();
    }

}
