package net.imparando.codicefiscale;

public class CodiceFiscale {
    private String cognome;
    private String nome;

    public CodiceFiscale(String cognome, String nome){
        this.cognome = cognome;
        this.nome = nome;
    }

    private String codificaCognome(){
        return "" + cognome.charAt(0) + cognome.charAt(2) + cognome.charAt(4);
    }

    String calcola(){
        return codificaCognome();
    }

}
