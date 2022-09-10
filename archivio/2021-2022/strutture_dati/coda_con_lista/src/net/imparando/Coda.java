package net.imparando;

public class Coda {
    private Nodo head;
    private Nodo tail;
    private int quanti;

    public Coda(){
        head = null;
        tail = null;
        quanti = 0;
    }

    //Inserimento in coda alla lista
    public void push(int n){
        Nodo temp = new Nodo(n);
        if (quanti == 0){
            head = temp;
            tail = temp;
        }
        else {
            tail.setNext(temp);
            tail = temp;
        }
        quanti++;
    }

    public int pop(){
        if (quanti == 0)
            return -1; //Non sarebbe la cosa ideale
        int info = head.getInfo();
        head = head.getNext();
        quanti--;
        return info;
    }

    public boolean empty()
    {
        return quanti == 0;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Coda {" +
                "quanti=" + quanti +
                "}[ ";
        Nodo temp = head;
        while(temp != null){
            s += temp.getInfo() + " ";
            temp = temp.getNext();
        }
        return s + "]";
    }
}
