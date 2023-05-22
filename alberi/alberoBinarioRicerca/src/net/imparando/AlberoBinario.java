package net.imparando;


import java.util.Iterator;

/**
 * Classe di riferimento per gli alberi binari di ricerca
 * 2022-04-03T20:55:51+02:00
 */
public class AlberoBinario {
    private Nodo root;
    private int quanti;

    public AlberoBinario(int n) {
        root = new Nodo(n);
        quanti++;
    }

    private void addR(Nodo attuale, int n){
        if (n < attuale.info){
            if (attuale.sinistro != null)
                addR(attuale.sinistro, n);
            else
                attuale.sinistro = new Nodo(n);
        }
        if (n > attuale.info){
            if (attuale.destro != null)
                addR(attuale.destro, n);
            else
                attuale.destro = new Nodo(n);
        }
    }


    public void add(int n){
        addR(root, n);
        quanti++;
    }

    private void visitaAnticipataR(Nodo attuale){
        System.out.print(attuale.info + " ");
        if (attuale.sinistro != null)
            visitaAnticipataR(attuale.sinistro);
        if (attuale.destro!=null)
            visitaAnticipataR(attuale.destro);
    }

    public void visitaAnticipata(){
        visitaAnticipataR(root);
        System.out.println();

    }

    private void visitaPosticipataR(Nodo attuale){
        if (attuale.sinistro != null)
            visitaPosticipataR(attuale.sinistro);
        if (attuale.destro!=null)
            visitaPosticipataR(attuale.destro);
        System.out.print(attuale.info + " ");
    }

    public void visitaPosticipata(){
        visitaPosticipataR(root);
        System.out.println();

    }
    private void visitaInOrderR(Nodo attuale){
        if (attuale.sinistro != null)
            visitaInOrderR(attuale.sinistro);
        System.out.print(attuale.info + " ");
        if (attuale.destro!=null)
            visitaInOrderR(attuale.destro);
    }
    public void visitaInOrder(){
        visitaInOrderR(root);
        System.out.println();

    }

    private boolean ricercaR(Nodo attuale, int n){
        if (attuale == null) return false;
        if (n == attuale.info) return true;
        if (n < attuale.info){
            return ricercaR(attuale.sinistro, n);
        }
        else{
            return ricercaR(attuale.destro, n);
        }

    }

    public boolean ricerca(int n){
        return  ricercaR(root, n);
    }

    public int quantiMinori(int n){
        return quantiMinoriR(root, n);
    }
    private int quantiMinoriR(Nodo attuale, int n  ){
        if (attuale == null) return 0;

        if (attuale.info < n){
            return 1 + quantiMinoriR(attuale.sinistro, n) + quantiMinoriR(attuale.destro, n);
        }
        else{
            return quantiMinoriR(attuale.sinistro, n );
        }
    }
}
