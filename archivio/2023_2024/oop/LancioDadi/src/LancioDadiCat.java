public class LancioDadiCat {
    private int[] valori;
    final static int MAX_DADI = 5;
    private int n_dadi;
    private int somma;

    public LancioDadiCat(int n){
        this.n_dadi = n;
        if (this.n_dadi < 1 || this.n_dadi > MAX_DADI)
            this.n_dadi = 1;
        valori = new int[MAX_DADI];
        this.somma = 0;
        for (int i = 0; i < this.n_dadi; i++) {
            valori[i] = (int)(Math.random() * 6) + 1;
            this.somma += valori[i];
        }
    }

    public int getSomma(){
        return somma;
    }

    public int[] getValori(){
        int [] temp;
        temp = new int[MAX_DADI];
        for (int i = 0; i < MAX_DADI; i++) {
            temp[i] = this.valori[i];
        }
        return temp;
    }


}
