package net.imparando;

public class AlberoBinarioRicerca {
    private Nodo root;
    private int quanti;

    public AlberoBinarioRicerca(int n){
        root = new Nodo(n);
        quanti = 1;
    }

    private boolean ricercaR(Nodo attuale, int cercato){
        if (attuale.getInfo() == cercato)
            return true;
        //Il numero cercato è minore del nodo attuale
        if (cercato < attuale.getInfo()){
            if (attuale.getSinistro() != null)
                return ricercaR(attuale.getSinistro(), cercato);
            else
                return false;
        }
        //Il numero cercato è minore del nodo attuale
        else{
            if (attuale.getDestro() != null)
                return ricercaR(attuale.getDestro(), cercato);
            else
                return false;
        }
    }

    public boolean ricerca(int cercato){
        return ricercaR(root, cercato);
    }

    private void aggiungiNodoR(Nodo attuale, int n){
        //Questo impedisce l'inserimento di nodi duplicati
        if (attuale.getInfo() == n)
            return;
        //Scendo a sinistra
        if (n < attuale.getInfo()){
            if (attuale.getSinistro() != null)
                aggiungiNodoR(attuale.getSinistro(), n);
            else{
                attuale.aggiungiSinistro(n);
                quanti++;
                return;
            }
        }
        //Scendo a sinistra
        if (n > attuale.getInfo()){
            if (attuale.getDestro() != null)
                aggiungiNodoR(attuale.getDestro(), n);
            else{
                attuale.aggiungiDestro(n);
                quanti++;
                return;
            }
        }
    }

    public void aggiungiNodo(int n){
        aggiungiNodoR(root, n);
    }

    private void visitaInOrdineR(Nodo attuale){
        if (attuale == null)
            return;
        visitaInOrdineR(attuale.getSinistro());
        System.out.print(attuale.getInfo() + " -> ");
        visitaInOrdineR(attuale.getDestro());
    }

    public void visitaInOrdine(){
        visitaInOrdineR(root);
        System.out.println("end");
    }
    public int size(){
        return  quanti;
    }
}
