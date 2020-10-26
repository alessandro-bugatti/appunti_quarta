/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziotelevisore;

/**
 * Esermpio di una classe per gestire un televisore
 * @author Federico Brignani
 */
public class Televisore {
    private int numeroCanali; // Attributo che contiene il numero massimo dei canali del televisore
    private int canaleAttuale; // Attributo che contiene il numero del canale attuale
    private boolean acceso; // Attributo che indica se il computer è acceso
    
    /**
     * Metodo costruttore
     * @param numeroCanali Numero massimo di canali del televisore
     */
    public Televisore(int numeroCanali)
    {
        this.numeroCanali = numeroCanali;
        this.acceso = false;
    }
    
    /**
     * Seleziona un canale tra quelli validi
     * @param canale Canale sul quale si sposterà il televisore<br>
     * Se il canale passato <strong>non è valido</strong> il televisore
     * rimarrà sul canale impostato in precedenza
     * @return Il canale su cui si troverà il televisore dopo che
     * è stato chiamato il metodo
     */
    public int selezionaCanale(int canale)
    {
        if (acceso && canale >= 1 && canale <= this.numeroCanali )
            canaleAttuale = canale;
        return canaleAttuale;
    }
    
    /**
     * Cambia il canale del televisore in quello successivo<br>
     * Se il canale successivo si trova al di fuori del limite
     * <strong>numeroCanali</strong> il televisore si sposterà
     * sul canale 1
     * @return Il canale su cui si troverà il televisore dopo che
     * è stato chiamato il metodo
     */
    public int canaleSuccessivo()
    {
        if (acceso)
            if (canaleAttuale < this.numeroCanali)
                canaleAttuale++;
            else
                canaleAttuale = 1;
        return canaleAttuale;   
    }
    
    /**
     * Cambia il canale del televisore in quello precedente<br>
     * Se il canale precedente si trova al di fuori del limite
     * <strong>numeroCanali</strong> il televisore si sposterà
     * sull'ultimo canale valido
     * @return Il canale su cui si troverà il televisore dopo che
     * è stato chiamato il metodo
     */
    public int canalePrecedente()
    {
        if (acceso)
            if (canaleAttuale > 1)
                canaleAttuale--;
            else
                canaleAttuale = this.numeroCanali;
        return canaleAttuale;
    }
    
    /**
     * Accende il televisore<br>
     * Quando il televisore è spento non può cambiare canale
     */
    public void accendi()
    {
        this.canaleAttuale = 1;
        this.acceso = true;
    }
    
    /**
     * Spegne il televisore<br>
     * Quando il televisore è spento non può cambiare canale
     */
    public void spegni()
    {
        acceso = false;
    }
    
    /**
     * Controlla lo stato del televisore
     * @return Lo stato del televisore e nel caso fosse acceso
     * il canale su cui si trova
     */
    @Override
    public String toString()
    {
        String s;
        s = "Il televisore è ";
        if (acceso)
        {
            s = s + "acceso";
            s = s + "\nIl canale attivo è " + this.canaleAttuale;
        }
        else
            s = s + "spento";
        return s;
    }
}
