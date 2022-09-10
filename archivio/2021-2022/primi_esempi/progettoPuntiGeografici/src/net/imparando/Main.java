package net.imparando;

public class Main {

    public static void main(String[] args) {
	    PuntoGeografico a = new PuntoGeografico();
        PuntoGeografico b = new PuntoGeografico( new Angolo(45,33,34),
                new Angolo(10,12,59)
        );
        double distanza = a.distanza(b);
        System.out.println(distanza);
    }
}
