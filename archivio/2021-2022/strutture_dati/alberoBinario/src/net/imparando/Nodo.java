package net.imparando;

public class Nodo {
    private int info;
    private Nodo sinistro, destro;

    public Nodo(int info) {
        this.info = info;
        sinistro = destro = null;
    }

    public int getInfo() {
        return info;
    }

    public Nodo getSinistro(){
        return sinistro;
    }

    public Nodo getDestro(){
        return destro;
    }

    public void aggiungiDestro(int n){
        destro = new Nodo(n);
    }

    public void aggiungiSinistro(int n){
        sinistro = new Nodo(n);
    }
}
