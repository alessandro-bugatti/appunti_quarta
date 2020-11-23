/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocontocorrente;

/**
 *
 * @author Fusari
 */
public class EsercizioContoCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoCorrente c1 = new ContoCorrente ("Gianni","Pallino");
        System.out.println(c1);
        ContoCorrente c2 = new ContoCorrente ("Gianna","Pallino");
        System.out.println(c2);
        c2.deposita(1000, "Bonifico per stipendio");
        c2.deposita(500, "Pagamento fattura Giorgio Bugni");
        System.out.println(c2);
        
    }
    
}
