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
    public boolean remove(int e) {
        if (n_elementi == 0)
            return false;
        boolean trovato = false;
        while (testa.info == e) {
            //System.out.println("here");
            testa = testa.next;
            n_elementi--;
            trovato = true;
            if (n_elementi == 0)
                return true;
        }
        Nodo temp = testa;
        
        //Questo while permettere di attraversare la lista
        while (temp.next != null) {
            if (temp.next.info == e) {
                temp.next = temp.next.next;
                n_elementi--;
                trovato = true;
            } else {
                temp = temp.next;
            }
        }
        return trovato;
    }
    public boolean removeAll (LinkedList l) {
        Nodo temp = l.testa;
        for (int i = 0; i<l.size(); i++) {
            this.remove(temp.info);
            temp = temp.next;
        }
        return true;
    }

    public boolean retainAll(LinkedList l) {
        return true;
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
        return "[" + s + "null]";
    }

    
    public void lastFirst()
    {
        if (testa == null || n_elementi == 1)
            return;
       Nodo first = testa;
       Nodo last = testa;
       for (int i = 0; i < n_elementi - 1; i++)
           last = last.next;
       int temp;
       temp = first.info;
       first.info = last.info;
       last.info = temp;
    }
    
    public boolean isSublist(LinkedList l)
    {
        if (this.n_elementi < l.n_elementi)
            return false;
        Nodo temp = this.testa;
        while (temp != null)
        {
            Nodo temp2 = l.testa;
            Nodo temp3 = temp;
            int contatore = 0;
            while (temp3 != null && temp2 != null && temp2.info == temp3.info)
            {   
                temp2 = temp2.next;
                temp3 = temp3.next;
                contatore++;
            }
            if (contatore == l.n_elementi)
                return true;
            temp = temp.next;
        }
        return false;
        
    }
}
