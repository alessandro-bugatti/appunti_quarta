package net.imparando;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Movimento implements Serializable {
    private String descrizione;

    private float importo;
    private LocalDateTime data;

    private boolean buonFine;

    public Movimento(String descrizione, float importo, LocalDateTime data) {
        this.descrizione = descrizione;
        this.importo = importo;
        this.data = data;
    }

    public Movimento(String descrizione, float importo){
        this.descrizione = descrizione;
        this.importo = importo;
        this.data = LocalDateTime.now();
    }


    public float getImporto() {
        return importo;
    }

    public boolean valido(){
        return buonFine;
    }

    public void setBuonFine(){
        this.buonFine = true;
    }

    @Override
    public String toString() {
        return "Movimento{" +
                "descrizione='" + descrizione + '\'' +
                ", importo=" + importo +
                ", data=" + data +
                '}';
    }
}
