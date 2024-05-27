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
            return aggiungiElementoR(attuale.dx, n);
        }
        else {
            return aggiungiElementoR(attuale.sx, n);
        }
    }

    public boolean aggiungiElemento(int n){
        return aggiungiElementoR(root, n);
    }

    private boolean ricercaR(Nodo attuale, int n){
        return false;
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
        return 42;
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
