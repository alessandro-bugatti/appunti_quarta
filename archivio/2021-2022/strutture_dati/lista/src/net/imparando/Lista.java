package net.imparando;

public class Lista {
    //Riferimento al primo nodo della lista
    private Nodo head;
    private int quanti;


    public Lista() {
        this.head = null;
    }

    public void add(int a){
        Nodo n = new Nodo(a);
        n.setNext(head);
        head = n;
        quanti++;
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

    /**
     * Ritorna l'elemento in posizione pos
     * @param pos
     * @return
     */
    int getItem(int pos){
        Nodo temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
        }
        return temp.getInfo();
    }

    public int getDimensione(){
        return quanti;
    }


}
