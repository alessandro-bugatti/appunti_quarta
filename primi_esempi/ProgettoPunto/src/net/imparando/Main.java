package net.imparando;

public class Main {

    public static void main(String[] args) {
	    Punto a, b, c; //a e b sono riferimenti a istanze (oggetti) della classe Punto
        a = new Punto(-2, 3);
        b = new Punto(5,7);
        /*c = a.medio(b); //calcola il punto medio tra a e b
        System.out.println(c);
        System.out.println(a.getX());
        System.out.println(a.getY());
        //a = new Punto( 8, a.getY());
        a.setX(8);
        double d = a.distanza(b);
        System.out.println("La distanza vale: " + d);
        */
        System.out.println(a.getX());
        System.out.println(a.getY());
        a.setX(2);
        a.setX(-2);
        System.out.println(a.getX());
        double distanza = a.distanzaOrigine();
        System.out.println(distanza);

    }
}
