package net.imparando;

public class Match {

    private int numberOfSets;
    private Game currentGame;
    private Set currentSet;
    private int setsUno;
    private int setsDue;

    public Match(int numberOfSets) {
        this.numberOfSets = numberOfSets;
        this.setsUno = 0;
        this.setsDue = 0;
        currentGame = new Game();
        currentSet = new Set();
    }

    public boolean isFinished() {
        if (this.setsUno == numberOfSets/2 + 1 || this.setsDue == numberOfSets/2 + 1)
            return true;
        return false;
    }

    public void puntoGiocatoreUno() {
        if (currentSet.isTieBreak())
        {
            //Brutta soluzione per evitare di scrivere cose più complesse
            currentGame = new Game();
            if (currentSet.puntoGiocatoreUno() == true)
            {
                currentSet = new Set();
                this.setsUno++;
            }
            return;
        }
        boolean vittoria = currentGame.puntoGiocatoreUno();
        if (vittoria) {
                    if (currentSet.puntoGiocatoreUno() == true)
                    {
                        this.setsUno++;
                        currentSet = new Set();
                    }
                    currentGame = new Game();
                    //Aggiungo un game al set corrente
                    System.out.println("Questo game l'ha vinto il giocatore 1");
        }
    }

    public void puntoGiocatoreDue() {
        if (currentSet.isTieBreak())
        {
            //Brutta soluzione per evitare di scrivere cose più complesse
            currentGame = new Game();
            if (currentSet.puntoGiocatoreDue() == true)
            {
                currentSet = new Set();
                this.setsDue++;
            }
            return;
        }
        boolean vittoria = currentGame.puntoGiocatoreDue();
        if (vittoria) {
            if (currentSet.puntoGiocatoreDue() == true)
            {
                this.setsDue++;
                currentSet = new Set();
            }
            currentGame = new Game();
            //Aggiungo un game al set corrente
            System.out.println("Questo game l'ha vinto il giocatore 2");
        }
    }

    @Override
    public String toString() {
        return "Set totali " + this.setsUno + " - " + this.setsDue + " " + currentSet.toString() + " " + currentGame.toString();
    }
}
