package net.imparando;

import javax.sound.sampled.Port;

public class PortaCD {
    private CD[] contenitore;
    private int num_max;
    private int CD_inseriti;

    private PortaCD(int n){
        num_max = n;
        contenitore = new CD[num_max];
        CD_inseriti = 0;
    }

    private CD getCD(int posizione){
        if (posizione < 0 || posizione >= num_max)
            return null;
        return contenitore[posizione];
    }

    private boolean setCD(int posizione, CD a){
        if (posizione < 0 || posizione >= num_max)
            return false;
        if (contenitore[posizione] == null) {
            contenitore[posizione] = a;
            CD_inseriti++;
            return true;
        }
        return false;
    }

    private boolean killCD(int posizione){
        if (posizione < 0 || posizione >= num_max)
            return false;
        if (contenitore[posizione] != null)
            CD_inseriti--;
        contenitore[posizione] = null;
        return true;
    }

}
