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
        for (Figura f: figure
             ) {
            System.out.psrintln(f);
            System.out.println("Perimetro" + f.getPerimetro());
        }
    }
}