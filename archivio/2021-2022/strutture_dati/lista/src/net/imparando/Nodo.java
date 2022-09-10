package net.imparando;

public class Nodo {
    //Parte informativa, che può essere qualsiasi cosa,
    //un Punto, UN ContoCorrente, una Carta da gioco, ecc.
    //nel nostro caso usiamo un intero che è la cosa più semplice
    //possibile
    private int info;
    //Riferimento al Nodo successivo
    private Nodo next;

    public Nodo(int info) {
        this.info = info;
        this.next = null;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getNext() {
        return next;
    }

    public int getInfo() {
        return info;
    }
}
