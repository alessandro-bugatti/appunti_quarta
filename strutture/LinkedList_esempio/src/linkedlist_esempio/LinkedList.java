/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_esempio;

/**
 *
 * @author Alessandro Bugatti
 */
public class LinkedList {

    private Nodo testa;
    private int n_elementi;

    public LinkedList() {
        this.testa = null;
        this.n_elementi = 0;
    }

    public boolean add(int n) {
        Nodo temp = new Nodo(n);
        temp.next = testa;
        testa = temp;
        n_elementi++;
        return true;
    }

    public boolean add(int pos, int n) {
        if (pos < 0 || pos > n_elementi) {
            return false;
        }
        if (pos == 0) {
            return add(n);
        }
        Nodo temp = testa;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        Nodo nuovo = new Nodo(n);
        nuovo.next = temp.next;
        temp.next = nuovo;
        n_elementi++;
        return false;
    }

    boolean addAll(LinkedList l) {
        Nodo temp = l.testa;
        for (int i = 0; i < l.size(); i++) {
            this.add(temp.info);
            temp = temp.next;
        }
        /*Nodo temp = l.testa;
        while (temp.next != null)
            temp = temp.next;
        temp.next = this.testa; 
        this.testa = l.testa;*/
        this.n_elementi += l.n_elementi;
        return true;
    }

    boolean contains(int i) {
        /*
        if (n_elementi == 0) {
            return false;
        }*/
        Nodo temp = this.testa;
        while (temp != null) {
            if (temp.info == i) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    boolean containsAll(LinkedList l)
    {
        int uguali = 0;
        Nodo temp = l.testa;
        for (int i = 0; i < l.size(); i++){
            if(this.contains(temp.info))
                uguali++;
            temp = temp.next;
        }
        if(uguali == l.n_elementi){
            return true;
        }
        return false;
    }
    
    public boolean remove() {
        if (n_elementi == 0) {
            return false;
        }
        testa = testa.next;
        n_elementi--;
        return true;
    }
    
    //Il parametro valore rappresenta il valore da eliminare
    //e non la sua posizione
    public boolean remove(int valore) {
        
        return true;
    }
    
    public boolean removeAll(LinkedList l) {
        Nodo temp = l.testa;
        for (int i = 0; i < l.size(); i++) {
            if (this.contains(temp.info)) {
                this.remove(temp.info);
            }
        }
    }

    public boolean retainAll(LinkedList l) {
        
    }
    
    void clear() {
        testa = null;
        n_elementi = 0;
    }

    boolean isEmpty() {
        if (n_elementi == 0) {
            return true;
        }
        return false;
    }

    int size() {
        return n_elementi;
    }

    @Override
    public String toString() {
        String s = "";
        Nodo temp = testa;
        while (temp != null) {
            s += temp.info + " -> ";
            temp = temp.next;
        }
        return "LinkedList{" + s + "null}";
    }

}
