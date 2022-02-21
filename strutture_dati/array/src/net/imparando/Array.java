package net.imparando;

import java.util.Arrays;

public class Array {
    private int v[];
    private int quanti;
    private int dimensione;

    public Array() {
        //Array(16);
        dimensione = 16;
        v = new int[dimensione];
        quanti = 0;
    }

    public Array(int dimensione) {
        this.dimensione = dimensione;
        v = new int[dimensione];
        quanti = 0;
    }

    private void raddoppia(){
        dimensione *= 2;
        int temp[] = new int[dimensione];
        for (int i = 0; i < quanti; i++) {
            temp[i] = v[i];
        }
        v = temp;
    }


    public void add(int a){
        if (quanti == dimensione) {
            raddoppia();
        }
        v[quanti] = a;
        quanti++;
    }

    public void addInTesta(int a){
        if (quanti == dimensione) {
            raddoppia();
        }
        //Sposta gli elementi per far spazio all'inserimento
        for (int i = quanti; i > 0; i--) {
            v[i] = v[i - 1];
        }
        v[0] = a;
        quanti++;
    }
    @Override
    public String toString() {
        String s = "";
        s += "Array{" +
                "quanti=" + quanti +
                ", dimensione=" + dimensione +
                "}[ ";
        for (int i = 0; i < quanti; i++) {
            s += v[i] + " ";

        }
        return s + "]";
    }

    public int getDimensione() {
        return dimensione;
    }

    /**
     * Ritorna l'elemento in posizione pos
     * @param pos
     * @return
     */
    int getItem(int pos){
        return v[pos];
    }
}
