package net.imparando;

import net.imparando.alberibinari.AlberoBinario;

public class Main {

    public static void main(String[] args) {
	    AlberoBinario a = new AlberoBinario(42);
        a.aggiungiElemento(27);
        a.aggiungiElemento(13);
        a.aggiungiElemento(31);
        a.aggiungiElemento(2);
        a.aggiungiElemento(21);
        a.aggiungiElemento(71);
        a.aggiungiElemento(50);
        a.aggiungiElemento(84);

        a.aggiungiElemento(48);
        a.aggiungiElemento(62);
        a.aggiungiElemento(87);
        a.visitaSimmetrica();

        System.out.println("Ricerca 48: " + a.ricerca(48));
        System.out.println("Ricerca 71: " + a.ricerca(71));
        System.out.println("Ricerca 100: " + a.ricerca(100));

        System.out.println("Massimo: " + a.massimo());
    }
}
