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
//        System.out.println(a.getX());
//        System.out.println(a.getY());
//        a.setX(2);
//        a.setX(-2);
//        System.out.println(a.getX());
//        double distanza = a.distanzaOrigine();
//        System.out.println(distanza);
        Angolo alfa = new Angolo();
        Angolo beta = new Angolo(1);
        Angolo gamma = new Angolo(10);

        //Per verificare la correttezza delle operazioni
        //di conversione tra radianti e gradi
        //si veda https://www.periodni.com/it/convertitore_angolo.html
        double valore = alfa.getRadianti();
        System.out.println(valore);
        System.out.println(beta.getRadianti());
        //System.out.println(gamma.getRadianti());
        System.out.println(beta);
        System.out.println(gamma);
        Angolo delta = beta.somma(gamma);
        System.out.println(delta);
    }
}
