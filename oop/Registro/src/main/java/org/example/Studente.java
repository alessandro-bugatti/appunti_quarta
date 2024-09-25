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
}
