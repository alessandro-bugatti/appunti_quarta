package net.imparando;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    Persona p = new Persona();
        p.cognome = "Male";
        p.nome = "Bugo";
        p.indirizzo = "Via Monti 4";
        p.telefono = "333";
        AlberoBinario a = new AlberoBinario(p);
        Persona p2 = new Persona();
        p2.cognome = "Zutti";
        p2.nome = "Tugo";
        p2.indirizzo = "Via Monti 14";
        p2.telefono = "444";

        Persona p3 = new Persona();
        p3.cognome = "Ale";
        p3.nome = "Sago";
        p3.indirizzo = "Via Bini 4";
        p3.telefono = "555";

        a.add(p2);
        a.add(p3);

        a.visitaInOrder();

        System.out.println(a.ricerca("Ale"));

    }
}
