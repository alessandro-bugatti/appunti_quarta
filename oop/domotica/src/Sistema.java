public class Sistema {
    private Lampadina[] lampadine;

    private int n_lampadine;

    private int max_lampadine;

    /**
     * Costruttore vuoto che crea un sistema che può
     * contenere fino a 100 lampadine, attualmente senza lampadine
     */
    public Sistema(){
        this.max_lampadine = 100;
        this.lampadine = new Lampadina[this.max_lampadine];
        this.n_lampadine = 0;
    }

    public Sistema(int max_lampadine){
        this.max_lampadine = max_lampadine;
        if (this.max_lampadine <= 1 || this.max_lampadine > 1000)
            this.max_lampadine = 100;
        this.lampadine = new Lampadina[this.max_lampadine];
        this.n_lampadine = 0;
    }

    public boolean aggiungiLampadina(Lampadina l){
        if (this.n_lampadine == this.max_lampadine)
            return false;
        this.lampadine[this.n_lampadine] = l;
        this.n_lampadine++;
        return true;
    }

}
