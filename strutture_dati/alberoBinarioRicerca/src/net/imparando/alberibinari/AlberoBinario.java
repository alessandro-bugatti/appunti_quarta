package net.imparando.alberibinari;


/**
 * Classe di riferimento per gli alberi binari di ricerca
 * 2022-04-03T20:55:51+02:00
 */
public class AlberoBinario {
    private Nodo root;
    int quanti;

    public AlberoBinario(int n) {
        root = new Nodo(n);
        quanti++;
    }

    private boolean aggiungiElementoR(Nodo attuale, int n){
        if (attuale.info == n)
            return false;
        if(n > attuale.info){
            if(attuale.dx == null){
                attuale.dx = new Nodo(n);
                return true;
            }
            return aggiungiElementoR(attuale.dx, n);
        }
        else {
            if(attuale.sx == null){
                attuale.sx = new Nodo(n);
                return true;
            }
            return aggiungiElementoR(attuale.sx, n);
        }
    }

    public boolean aggiungiElemento(int n){
        return aggiungiElementoR(root, n);
    }

    private void visitaSimmetricaR(Nodo attuale){
        if (attuale == null)
            return;
        visitaSimmetricaR(attuale.sx);
        System.out.print(attuale.info + " -> ");
        visitaSimmetricaR(attuale.dx);
    }

    public void visitaSimmetrica(){
        visitaSimmetricaR(root);
        System.out.println("end");
    }

    private boolean ricercaR(Nodo attuale, int n){
        if (attuale == null)
            return false;
        if (attuale.info == n)
            return true;
        if(n > attuale.info){
            return ricercaR(attuale.dx, n);
        }
        else{
            return ricercaR(attuale.sx, n);
        }

    }

    public boolean ricerca(int n){
        return ricercaR(root, n);
    }

    private void visitaInOrdineR(Nodo attuale){

    }

    public void visitaInOrdine()
    {
        visitaInOrdineR(root);
        System.out.println("end");
    }

    /*
    Metodi aggiuntivi per esercizi
     */

    public int massimo()
    {
        return massimoR(root);
    }

    private int massimoR(Nodo attuale) {
        if (attuale.dx == null)
            return attuale.info;
        return massimoR(attuale.dx);
    }

    public int minimo(){
        return minimoR(root);
    }

    private int minimoR(Nodo attuale) {
       return 42;
    }

    /**
     * Calcolo della lunghezza del percorso tra due nodi
     * Ipotesi: i due nodi esistono sempre e il primo
     * è minore del secondo
     */

    private int profonditaR(Nodo attuale, int n, int p)
    {
        return 42;
    }

    private int lunghezzaPercorsoR (Nodo attuale, int primo, int secondo)
    {
        return 42;
    }

    public int lunghezzaPercorso(int primo, int secondo){
        return lunghezzaPercorsoR(root, primo, secondo);
    }


}
