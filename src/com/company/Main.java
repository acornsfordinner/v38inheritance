package com.company;

public class Main {

    public static void main(String[] args) {
        /*Cirkel rund = new Cirkel(9,43,5);
        rund.printInfo();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Cirkel c = new Cirkel();
        c.printInfo();

        /*Figur blob = new Figur(25,70);
	    Rektangel ruta = new Rektangel(125,300);
	    Cirkel rund = new Cirkel(100,50,5);
	    ruta.printInfo();
	    System.out.println("\n\n");
        rund.printInfo();
        blob.printInfo();
        System.out.println("\n\n");

        Punkt utan = new Punkt();
        */
        /*
        System.out.println();
        utan.printInfo();
        System.out.println();
        med.printInfo();
        System.out.println();
        utan.setX(4);
        utan.setY(24);
        utan.printInfo();
        */
        /*
        Rektangel ruta = new Rektangel(100,100,200,200);
        ruta.printInfo();*/

        Linje line1 = new Linje();
        line1.printInfo();
        System.out.println();
        System.out.println();
        Punkt start = new Punkt(23,53);
        Punkt stopp = new Punkt(34,55);
        System.out.println();
        System.out.println();
        Linje line2 = new Linje(start, stopp);
        line2.printInfo();
        System.out.println();
        System.out.println();
        Linje line3 = new Linje(12,43,55,66);
        line3.printInfo();
        System.out.println();


    }
}
