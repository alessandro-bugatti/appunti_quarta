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
    public boolean aggiungiFiglio(int dove, int n){
        Nodo cercato = cercaNodo(root, dove);
        if (cercato == null)
            return false;
        cercato.addFiglio(n);
        quanti++;
        return true;
    }

    private void visitaAnticipataR(Nodo attuale){
        System.out.print(attuale.getInfo() + " -> ");
        Iterator<Nodo> iter = attuale.getIteratoreFigli();
        while(iter.hasNext()){
            visitaAnticipataR(iter.next());
        }
    }

    public void visitaAnticipata(){
        visitaAnticipataR(root);
        System.out.println("end");
    }

    private void visitaPosticipataR(Nodo attuale){
        Iterator<Nodo> iter = attuale.getIteratoreFigli();
        while(iter.hasNext()){
            visitaPosticipataR(iter.next());
        }
        System.out.print(attuale.getInfo() + " -> ");
    }

    public void visitaPosticipata(){
        visitaPosticipataR(root);
        System.out.println("end");
    }

    public int size(){
        return quanti;
    }

    private int sizeR(Nodo attuale){
        int somma = 1;
        Iterator<Nodo> iter = attuale.getIteratoreFigli();
        while(iter.hasNext()){
            int n = sizeR(iter.next());
            somma += n;
        }
        return somma;
    }

    public int sizeRicorsiva(){
        return sizeR(root);
    }
}
