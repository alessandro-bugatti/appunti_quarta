package net.imparando;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cerchio c = new Cerchio(5,7.8f, "giallo", 12.3f);
        System.out.println(c);
        c.sposta(1,1);
        System.out.println(c);
        System.out.println(c.getPerimetro());
        Rettangolo r = new Rettangolo(2,3,"rosso", 2, 3);
        System.out.println(r);
        System.out.println(r.getPerimetro());
        //Inizia il codice polimorfico
        ArrayList<Figura> figure = new ArrayList<>();
        figure.add(c);
        figure.add(r);
        Quadrato q = new Quadrato(2.3f, 3.4f, "verde", 10.0f);
        figure.add(q);
        for (Figura f: figure
             ) {
            System.out.println(f);
            System.out.println("Perimetro: " + f.getPerimetro());
            System.out.println("Area: " + f.getArea());
        }
        //Riferimento e oggetto dello stesso tipo
        Rettangolo rettangolo = new Rettangolo(2.3f, 4.4f, "giallo",2.3f,6.7f);
        Cerchio cerchio = new Cerchio(4.5f, 8.9f, "arancione", 1.1f);
        //Riferimento della classe superiore (padre) e oggetto della classe inferiore (figlio)
        //Up-casting è sempre implicito e sempre possibile
        Figura figuraRettangolare = new Rettangolo(2.3f, 5.4f, "blu",2.3f,6.7f);
        Figura figuraRotonda = new Cerchio(4.6f, 8.9f, "viola", 1.1f);
        Figura figuraRettangolare2 = (Figura) rettangolo;
        Figura figuraRotonda2 = cerchio;
        figuraRettangolare2.sposta(4.5f, 6.5f);
        //Down-casting può essere possibile o no ed è necessariamente esplicito
        Rettangolo rettangolo2 = (Rettangolo) figuraRettangolare2; //Corretto sia in compilazione che in runtime
        rettangolo2.sposta(3.4f,1f);
        System.out.println(rettangolo2.getPerimetro());
        Cerchio cerchio2 = (Cerchio) figuraRotonda2;
        //System.out.println(cerchio.getPerimetro());
        //Rettangolo rettangolo3 = (Rettangolo) figuraRotonda2; //Corretto in compilazione
        //System.out.println(rettangolo3.getPerimetro()); //Errore in runtime
        Figura figuraMisteriosa;
        int n = (int)(Math.random()*2) + 1;
        if (n == 1){
            figuraMisteriosa = new Rettangolo(2.3f, 5.4f, "blu",2.3f,6.7f);
        }
        else{
            figuraMisteriosa = new Cerchio(4.6f, 8.9f, "viola", 1.1f);
        }
        System.out.println(figuraMisteriosa);



    }
}