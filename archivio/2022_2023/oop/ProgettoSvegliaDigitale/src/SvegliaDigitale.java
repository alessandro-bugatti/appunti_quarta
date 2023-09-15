public class SvegliaDigitale {
    private int ore, minuti, oreSveglia, minutiSveglia;
    private boolean modSveglia, modOrario;
    /*
    final static int NORMALE = 0;
    final static int SVEGLIA = 1;
    final static int ORARIO = 2;
    */
    public SvegliaDigitale(){
        ore = minuti = oreSveglia = minutiSveglia = 0;
        modSveglia = modOrario = false;
    }

    public SvegliaDigitale(int ore, int minuti){
        int oreAggiuntive = minuti / 60;
        this.minuti = minuti % 60;
        this.ore = (ore +  oreAggiuntive) % 24;
        oreSveglia = minutiSveglia = 0;
        modSveglia = modOrario = false;
    }

    public void impostaOrario(){
        if (modOrario){
            modOrario = false;
        }
        else {
            modOrario = true;
            modSveglia = false;
        }
    }

    public void impostaSveglia(){
        if (modSveglia){
            modSveglia = false;
        }
        else {
            modSveglia = true;
            modOrario = false;
        }
    }

    public void setOre(){
        if (modSveglia == false && modOrario == false){
            return;
        }
        if (modOrario){
            ore++;
            ore = ore % 24;
        }
        else {
            oreSveglia++;
            oreSveglia %= 24;
        }

    }

    public void setMinuti(){
        if (modSveglia == false && modOrario == false){
            return;
        }
        if (modOrario){
            minuti++;
            ore += minuti/60;
            ore %= 24;
            minuti = minuti % 60;
        }
        else {
            minutiSveglia++;
            oreSveglia += minutiSveglia/60;
            oreSveglia %= 24;
            minutiSveglia %= 60;
        }

    }

    public String toString(){
        String risultato;
        risultato = "Modalità ";
        if (modOrario)
            risultato += " regolazione orario";
        else if(modSveglia)
            risultato += " regolazione sveglia";
        else
            risultato += " normale";
        risultato += "\nOrario: " + (ore < 10 ? "0" + ore : ore);
        risultato += ":" + (minuti < 10 ? "0" + minuti : minuti);
        risultato += "\nSveglia: " + (oreSveglia < 10 ? "0" + oreSveglia : oreSveglia);
        risultato += ":" + (minutiSveglia < 10 ? "0" + minutiSveglia : minutiSveglia);
        return risultato;
    }
}
