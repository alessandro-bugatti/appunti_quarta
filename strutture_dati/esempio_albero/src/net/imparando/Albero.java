package net.imparando;

import java.util.Iterator;

public class Albero {
    private Nodo root;
    private int quanti;

    /**
     * Costruttore comodo perchè impedisce che la radice
     * sia null
     * @param n
     */
    public Albero(int n) {
        root = new Nodo(n);
        quanti = 1;
    }

    private Nodo cercaNodo(Nodo attuale, int n){
        if(attuale.getInfo() == n)
            return attuale;
        Nodo trovato = null;
        Iterator<Nodo> iter = attuale.getIteratoreFigli();
        while(iter.hasNext()){
            trovato = cercaNodo(iter.next(), n);
            if (trovato != null)
                break;
        }
        return trovato;
    }
    /**
     *
     * @param dove Valore del nodo a cui deve essere aggiunto
     *             un nuovo figlio
     * @param n IL valore contenuto nel nuovo figlio da aggiungere
     * @return Vero se è possibile, falso altrimenti (perchè dove non
     * esiste nell'albero)
     */
    public boolean aggiungi(int dove, int n){
        Nodo cercato = cercaNodo(root, dove);
        if (cercato == null)
            return false;
        cercato.addFiglio(n);
        quanti++;
        return true;
    }
}
