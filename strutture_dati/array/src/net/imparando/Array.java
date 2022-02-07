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

    public void add(int a){
        if (quanti == dimensione) {
            dimensione++;
            int temp[] = new int[dimensione];
            for (int i = 0; i < quanti; i++) {
                temp[i] = v[i];
            }
            v = temp;
        }

        v[quanti] = a;
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
}
