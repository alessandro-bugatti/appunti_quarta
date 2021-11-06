package net.imparando;

public class Game {
    private int punteggioUno;
    private int punteggioDue;
    private boolean vantaggioUno;
    private boolean vantaggioDue;

    public Game() {
        this.punteggioUno = 0;
        this.punteggioDue = 0;
        this.vantaggioUno = false;
        this.vantaggioDue = false;
    }

    public boolean puntoGiocatoreUno()
    {
        if (this.punteggioUno == 0 ||
                this.punteggioUno == 15)
        {
            this.punteggioUno += 15;
            return false;
        }
        if (this.punteggioUno == 30)
        {
            this.punteggioUno = 40;
            return false;
        }
        //Se io giocatore uno sono a 40 e l'altro non lo è ...
        if (this.punteggioDue < 40)
            return true;
        //Se io giocatore uno sono a 40 e anche l'altro è a 40 devo
        //vedere la situazione dei vantaggi
        //Siamo a vantaggio pari, cioè entrambi sono a false
        if (this.vantaggioUno == false && this.vantaggioDue == false)
        {
            this.vantaggioUno = true;
            return false;
        }
        if (this.vantaggioUno == false && this.vantaggioDue == true)
        {
            this.vantaggioDue = false;
            return false;
        }
        return true;
    }

    public boolean puntoGiocatoreDue()
    {
        if (this.punteggioDue == 0 ||
                this.punteggioDue == 15)
        {
            this.punteggioDue += 15;
            return false;
        }
        if (this.punteggioDue == 30)
        {
            this.punteggioDue = 40;
            return false;
        }
        //Se io giocatore due sono a 40 e l'altro non lo è ...
        if (this.punteggioUno < 40)
            return true;
        //Se io giocatore due sono a 40 e anche l'altro è a 40 devo
        //vedere la situazione dei vantaggi
        //Siamo a vantaggio pari, cioè entrambi sono a false
        if (this.vantaggioUno == false && this.vantaggioDue == false)
        {
            this.vantaggioDue = true;
            return false;
        }
        if (this.vantaggioDue == false && this.vantaggioUno == true)
        {
            this.vantaggioUno = false;
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String s = "Game: ";
        if (this.punteggioUno < 40 || this.punteggioDue < 40)
            s += this.punteggioUno + " - " + this.punteggioDue;
        else if (this.vantaggioUno == false && this.vantaggioDue == false)
            s += " vantaggio pari";
        else if (this.vantaggioUno)
            s += " A - 40";
        else
            s += " 40 - A";
        return s;
    }
}
