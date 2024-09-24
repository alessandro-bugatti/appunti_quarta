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

    public void setAltezza(float altezza){
        if (altezza < 0){
            altezza = - altezza;
        }
        this.altezza = altezza;
    }

    public float getAltezza(){
        return this.altezza;
    }
}
