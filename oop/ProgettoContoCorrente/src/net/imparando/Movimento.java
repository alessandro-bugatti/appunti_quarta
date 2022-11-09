package net.imparando;

import java.time.LocalDateTime;

public class Movimento {
    private String descrizione;

    private float importo;
    private LocalDateTime data;

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

    @Override
    public String toString() {
        return "Movimento{" +
                "descrizione='" + descrizione + '\'' +
                ", importo=" + importo +
                ", data=" + data +
                '}';
    }
}
