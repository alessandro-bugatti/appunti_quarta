package net.imparando;


import java.util.Iterator;

/**
 * Classe di riferimento per gli alberi binari di ricerca
 * 2022-04-03T20:55:51+02:00
 */
public class AlberoBinario {
    private Nodo root;
    private int quanti;

    public AlberoBinario(Persona persona) {
        root = new Nodo(persona);
        quanti++;
    }

    private void addR(Nodo attuale, Persona persona){
        if (attuale.persona.compareTo(persona) > 0){
            if (attuale.sinistro != null)
                addR(attuale.sinistro, persona);
            else
                attuale.sinistro = new Nodo(persona);
        }
        if (attuale.persona.compareTo(persona) < 0){
            if (attuale.destro != null)
                addR(attuale.destro, persona);
            else
                attuale.destro = new Nodo(persona);
        }
    }


    public void add(Persona persona){
        addR(root, persona);
        quanti++;
    }

    private void visitaInOrderR(Nodo attuale){
        if (attuale.sinistro != null)
            visitaInOrderR(attuale.sinistro);
        System.out.println(attuale.persona + " ");
        if (attuale.destro!=null)
            visitaInOrderR(attuale.destro);
    }
    public void visitaInOrder(){
        visitaInOrderR(root);
        System.out.println();

    }

    private Persona ricercaR(Nodo attuale, String chiave){
        if (attuale == null) return null;
        if (chiave.equals(attuale.persona.cognome)) return attuale.persona;
        if (chiave.compareTo(attuale.persona.cognome) < 0){
            return ricercaR(attuale.sinistro, chiave);
        }
        else{
            return ricercaR(attuale.destro, chiave);
        }
    }

    public Persona ricerca(String chiave){
        return ricercaR(root, chiave);
    }

}
