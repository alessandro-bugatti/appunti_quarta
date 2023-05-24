package net.imparando;

public class Persona implements Comparable{
    String nome;
    String cognome;
    String indirizzo;
    String telefono;

    @Override
    public String toString() {
        return nome + " " + cognome +
                " " + indirizzo + " " + telefono;
    }



    public int compareTo(Object o) {
        Persona p = (Persona)o;
        return this.cognome.compareTo(p.cognome);
    }

}
