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
        a.visitaInOrdine();
        System.out.println(a.ricerca(45));
        System.out.println(a.ricerca(84));
        System.out.println(a.massimo());
        System.out.println(a.minimo());
        System.out.println(a.lunghezzaPercorso(13, 84));
        System.out.println(a.lunghezzaPercorso(50, 87));
        System.out.println(a.lunghezzaPercorso(42, 87));
        System.out.println(a.lunghezzaPercorso(21, 48));
    }
}
