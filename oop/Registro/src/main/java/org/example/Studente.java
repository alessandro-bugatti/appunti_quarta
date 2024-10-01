package org.example;

/*
Versione con tutto pubblico

public class Studente {
    String nome;
    String cognome;
    float altezza;
    float peso;
}
*/

/*
Versione con attributi privati
 */
public class Studente {
    private String nome;
    private String cognome;
    private float altezza;
    private float peso;

    //Attributo costante poichè compare la parola final
    //Attributo statico poiché compare la parola static: vuole
    //dire che ne esiste un solo esemplare a livello della classe
    //e che tutti gli oggetti riferiscono a quell'unica istanza
    private final static float ALTO = 180.0f;

    public Studente(){

    }

    public Studente(String nome, String cognome, float altezza, float peso) {
        this.nome = nome;
        this.cognome = cognome;
        this.setAltezza(altezza);
        this.peso = peso;
    }

    public void setAltezza(float altezza){
        if (altezza < 0){
            altezza = - altezza;
        }
        this.altezza = altezza;
    }

    public float getAltezza(){
        return this.altezza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString(){
        String s;
        s = "Nome: " + this.nome;
        s += "\nCognome: " + this.cognome;
        return s;
    }

    //Metodi richiesti per esercizio
    public String valutaAltezza(){

        if (this.altezza > ALTO)
            return "Alto";
        return "";
    }

    public float getBMI(){
        return this.peso / (float) Math.pow(this.altezza, 2);
    }
}
