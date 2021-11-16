package net.imparando;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Operazione implements Serializable {
    private double ammontare;
    private String descrizione;
    private LocalDateTime timestamp;

    public Operazione(double ammontare, String descrizione)
    {
        this.ammontare = ammontare;
        this.descrizione = descrizione;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Operazione{" +
                "ammontare=" + ammontare +
                ", descrizione='" + descrizione + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public double getAmmontare() {
        return this.ammontare;
    }
}
