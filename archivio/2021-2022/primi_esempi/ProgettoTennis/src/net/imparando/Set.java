package net.imparando;

public class Set {

    private int gamesUno;
    private int gamesDue;
    TieBreak tiebreak;


    public Set() {
        this.gamesUno = 0;
        this.gamesDue = 0;
        tiebreak = null;
    }

    public boolean puntoGiocatoreUno() {
        if (tiebreak != null)
        {
            return tiebreak.puntoGiocatoreUno();
        }
        this.gamesUno++;
        if (this.gamesUno == 6 && this.gamesDue < 5)
            return true;
        if (this.gamesUno == 7 && this.gamesDue <= 5)
            return true;
        if (this.gamesUno == 6 && this.gamesDue == 6)
        {
            this.tiebreak = new TieBreak();
            return false;
        }
        return false;
    }

    public boolean puntoGiocatoreDue() {
        if (tiebreak != null)
        {
            return tiebreak.puntoGiocatoreDue();
        }
        this.gamesDue++;
        if (this.gamesDue == 6 && this.gamesUno < 5)
            return true;
        if (this.gamesDue == 7 && this.gamesUno <= 5)
            return true;
        if (this.gamesDue == 6 && this.gamesUno == 6)
        {
            this.tiebreak = new TieBreak();
            return false;
        }
        return false;
    }

    public boolean isTieBreak(){
        if (tiebreak == null)
            return false;
        return true;
    }

    @Override
    public String toString() {
        if (tiebreak != null)
            return tiebreak.toString();
        return "Set " + this.gamesUno + " - " + this.gamesDue;
    }


}
