package net.imparando;

public class Main {

    public static void main(String[] args) {
//        Punto a, b, c; //a e b sono riferimenti a istanze (oggetti) della classe Punto
//        a = new Punto(-2, 3);
//        b = new Punto(5, 7);
//        /*c = a.medio(b); //calcola il punto medio tra a e b
//        System.out.println(c);
//        System.out.println(a.getX());
//        System.out.println(a.getY());
//        //a = new Punto( 8, a.getY());
//        a.setX(8);
//        double d = a.distanza(b);
//        System.out.println("La distanza vale: " + d);
//        */
////        System.out.println(a.getX());
////        System.out.println(a.getY());
////        a.setX(2);
////        a.setX(-2);
////        System.out.println(a.getX());
////        double distanza = a.distanzaOrigine();
////        System.out.println(distanza);
//        Angolo alfa = new Angolo();
//        Angolo beta = new Angolo(1);
//        Angolo gamma = new Angolo(10);
//
//
//        //Per verificare la correttezza delle operazioni
//        //di conversione tra radianti e gradi
//        //si veda https://www.periodni.com/it/convertitore_angolo.html
//        double valore = alfa.getRadianti();
//        System.out.println(valore);
//        System.out.println(beta.getRadianti());
//        //System.out.println(gamma.getRadianti());
//        System.out.println(beta);
//        System.out.println(gamma);
//        Angolo delta = beta.somma(gamma);
//        System.out.println(delta);
//        Angolo iota = new Angolo(270, 15, 12);
//        Angolo mu = new Angolo(359, 59, 59);
//        System.out.println("Iota: " + iota);
//        System.out.println("Mu: " + mu.convertiInStringa("Gradi"));
        /* La riga qua sotto si legge
        La variabile a è un'istanza della classe Punto e in
        particolare è una variabile locale del metodo main
        della classe Main
         */
        Punto a = new Punto(0,0);
        Punto b = a;
        if (b == a)
            System.out.println("I due punti coincidono");
        else
            System.out.println("I due punti si trovano in posti differenti");
        a.setX(1);
        //Cosa viene stampato qua? Perchè?
        System.out.println(b.getX());
        b.setX(12);
        //Cosa viene stampato qua? Perchè?
        System.out.println(a.getX());
        a = new Punto(2, 2);
        //Cosa viene stampato qua? Perchè?
        System.out.println(b.getX());
        b.setX(3);
        //Cosa viene stampato qua? Perchè?
        System.out.println(a.getX());
        System.out.println(b.getX());
        /*
        Attenzione: non è la stessa cosa di
        f = b;
        dove invece ci sarebbe un solo oggetto
        riferito sia da b che da f
         */
        Punto f = new Punto(b);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println("Utilizzando ==");
        if (b == f)
            System.out.println("I due punti coincidono");
        else
            System.out.println("I due punti si trovano in posti differenti");
        System.out.println("Utilizzando equals");
        if (b.equals(f))
            System.out.println("I due punti coincidono");
        else
            System.out.println("I due punti si trovano in posti differenti");
        if (b.equals(b))
            System.out.println("I due punti coincidono");
        else
            System.out.println("I due punti si trovano in posti differenti");
        f.setX(999);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        /**
         * Il metodo equals serve a confrontare due oggetti
         * per verificare se sono uguali secondo la logica
         * di business
         */
        Segmento seg;
        seg = new Segmento(new Punto(0,2), new  Punto(3,4));
        Segmento seg2;
        seg2 = new Segmento(new Punto(3,4), new  Punto(0,2));
        if (seg.equals(seg2) == true)
            System.out.println("I due segmenti sono uguali");




    }
}
