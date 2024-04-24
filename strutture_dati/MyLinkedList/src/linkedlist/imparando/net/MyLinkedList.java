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

        }
        return false;
    }

    public int size() {
        return n_items;
    }

    public boolean remove(){
        return false;
    }

    public boolean remove(int index){
        return false;
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
