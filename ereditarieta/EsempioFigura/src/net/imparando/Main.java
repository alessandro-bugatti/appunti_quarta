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
    }
}