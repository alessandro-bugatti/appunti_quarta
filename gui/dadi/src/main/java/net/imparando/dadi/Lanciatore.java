package net.imparando.dadi;

public class Lanciatore {
    final int n_dadi;

    Lanciatore(int n_dadi){
        this.n_dadi = n_dadi;
    }

    int lancia(){
        int totale = 0;
        for (int i = 0; i < n_dadi; i++) {
            totale += (Math.random() * 6) + 1;
        }
        return totale;
    }
}
