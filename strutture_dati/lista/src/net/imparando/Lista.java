package net.imparando;

public class Lista {
    //Riferimento al primo nodo della lista
    private Nodo head;

    public Lista() {
        this.head = null;
    }

    public void add(int a){
        Nodo n = new Nodo(a);
        n.setNext(head);
        head = n;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Lista{" +
                //"quanti=" + quanti +
                "}[ ";
        Nodo temp = head;
        while(temp != null){
            s += temp.getInfo() + " ";
            temp = temp.getNext();
        }

        return s + "]";

    }
}
