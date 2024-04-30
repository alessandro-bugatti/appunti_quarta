package linkedlist.imparando.net;

public class MyLinkedList {

    private Nodo head;
    private int n_items;

    public MyLinkedList()
    {
        head = null;
        n_items = 0;
    }

    public boolean add(int n){
        head = new Nodo(n, head);

        /*
        Nodo nodo = new Nodo(n);
        nodo.next = head;
        head = nodo;
        */

        this.n_items++;
        return true;
    }

    public boolean add(int index, int n){
        if (index < 0 || index > this.n_items)
            return false;
        if (index == 0){
            return this.add(n);
        }
        Nodo nodo;
        nodo = head;
        for (int i = 0; i < index - 1; i++) {
            nodo = nodo.next;
        }
        Nodo nuovo = new Nodo(n,nodo.next);
        nodo.next = nuovo;
        this.n_items++;
        return true;
    }

    public int size() {
        return n_items;
    }

    public boolean remove(){
        if (this.n_items == 0)
            return false;
        head = head.next;
        this.n_items--;
        return true;
    }

    public boolean remove(int index){
        if (index < 0 || index >= this.n_items){
            return false;
        }
        if (index == 0){
            return remove();
        }
        Nodo n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        //Nodo dopo = n.next;
        //n.next = dopo.next;
        n.next = n.next.next;
        this.n_items--;
        return true;
    }

    @Override
    public String toString(){
        String s = "[";
        Nodo n;
        n = head;
        while(n != null){
            s += n.info + ", ";
            n = n.next;
        }

        return s.substring(0, s.length() - 2) + "]";
    }

}
