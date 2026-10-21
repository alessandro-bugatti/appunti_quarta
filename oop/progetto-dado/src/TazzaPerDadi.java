public class TazzaPerDadi {
    private int nDadi;
    private Dado[] dadi;
    private int maxDadi;

    public TazzaPerDadi(int N){
        //Indica quanti dadi vogliamo
        this.nDadi = 0;
        this.maxDadi = N;
        //Crea il vettore, ma vuoto
        this.dadi = new Dado[this.maxDadi];
    }

    public TazzaPerDadi(int N, int F){
        this.nDadi = N;
        this.maxDadi = N;
        this.dadi = new Dado[this.nDadi];
        for (int i = 0; i < N; i++) {
            this.dadi[i] = new Dado(F);
        }
    }
    public boolean add(Dado d){
        if(this.maxDadi == this.nDadi)  {
            return false;
        }
        this.dadi[this.nDadi] = d;
        this.nDadi++;
        return true;
    }

    public int lancia(){
        int somma = 0;
        for (int i = 0; i < this.nDadi; i++) {
            somma += this.dadi[i].lancia();
        }
        return somma;
    }

    public int getMinimo(){
        return this.nDadi;
    }

    public int getMassimo(){
        //Questa formula funziona solo se i dadi hanno tutti lo stesso numero di facce
        //return this.nDadi * this.dadi[0].getFacce();
        int massimo = 0;
        for (int i = 0; i < this.nDadi; i++) {
            massimo += this.dadi[i].getFacce();
        }
        return massimo;
    }
    public int quanti(){
        return this.nDadi;
    }
    public int size(){
        return maxDadi;

    }
    public boolean isEmpty(){
        return this.nDadi == 0;
    }

    @Override
    public String toString(){
        String s;
        s = "Numero massimo dei Dadi: " + this.maxDadi + "\n";
        s += "Dadi attualmente contenuti: " + this.nDadi + "\n";
        s += "Lista dei dadi: \n";
        for (int i = 0; i < this.nDadi; i++) {
            s += "- dado da " + this.dadi[i].getFacce() + "\n";
        }
        return s;
    }
}
