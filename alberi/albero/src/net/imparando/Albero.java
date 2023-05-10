package net.imparando;

import java.util.Iterator;
import java.util.LinkedList;

public class Albero {
    private Nodo root;
    private int quanti;

    /**
     * Crea un albero alla cui radice si trova un nodo che contiene il valore n
     * @param n
     */
    public Albero(int n) {
        root = new Nodo(n);
        quanti++;
    }

    private Nodo cercaNodo(Nodo attuale, int n){
        if (attuale.getInfo() == n)
            return attuale;
        Nodo temp = null;
        Iterator<Nodo> i = attuale.getIteratoreFigli();
        while (i.hasNext()){
            temp = cercaNodo(i.next(), n);
            if (temp != null)
                break;
        }
        return temp;
    }

    public boolean aggiungiFiglio(int dove, int n){
        Nodo padre = cercaNodo(root, dove);
        if (padre == null){
            return false;
        }
        //Problema: bisogna cercare la presenza di valori
        //già inseriti oppure no? A seconda della risposta a questa domanda
        //il codice è diverso, noi al momento permettiamo duplicati
        //ragionare sulle conseguenze
        padre.aggiungiFiglio(n);
        quanti++;
        return true;
    }

    private void visitaAnticipataR(Nodo n)
    {
        System.out.print(n.getInfo() + " -> " );
        Iterator<Nodo> i = n.getIteratoreFigli();
        while(i.hasNext()){
            visitaAnticipataR(i.next());
        }
    }

    public void visitaAnticipata()
    {
        visitaAnticipataR(root);
        System.out.println( "end");
    }

    private void visitaPosticipataR(Nodo n)
    {
        Iterator<Nodo> i = n.getIteratoreFigli();
        while(i.hasNext()){
            visitaAnticipataR(i.next());
        }
        System.out.print(n.getInfo() + " -> ");
    }

    public void visitaPosticipata()
    {
        visitaPosticipataR(root);
        System.out.println("end");
    }

    public int size(){
        return quanti;
    }

    public boolean empty(){
        return quanti == 0;
    }

    private int massimoR(Nodo nodo){
        int max = nodo.getInfo();
        Iterator <Nodo> i = nodo.getIteratoreFigli();
        while (i.hasNext()){
            //Attenzione: non funziona!
            //if (massimoR(i.next()) > max)
            //    max = massimoR(i.next());
            max = Math.max(max, massimoR(i.next()));
        }
        return max;
    }

    public int massimo(){
        return massimoR(root);
    }

    private int profonditaR(Nodo nodo, int num, int p){
        if (nodo.getInfo() == num)
            return p;
        Iterator <Nodo> i = nodo.getIteratoreFigli();
        while (i.hasNext()){

            profonditaR(i.next(),num, p+1);
        }

    }
    public int profondita(int n){
        return profonditaR(root,n);
    }

}
