package net.imparando;

/**
 * Classe di utilità per generare codici unici
 */
public class GeneratoreCodici {

    /**
     * Ritorna una stringa formata da esattamente 6 caratteri
     * @return
     */
    public static String genera()
    {
        return "" + ((int)(Math.random()*900000) + 100000);
    }
}
