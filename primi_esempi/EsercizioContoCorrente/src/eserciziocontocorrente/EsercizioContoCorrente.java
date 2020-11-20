/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocontocorrente;

/**
 *
 * @author alex_2
 */
public class EsercizioContoCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoCorrente c1 = new ContoCorrente("Gianni",
        "Pallino");
        System.out.println(c1);
        ContoCorrente c2 = new ContoCorrente("Gianna",
        "Pallino");
        System.out.println(c2);
        ContoCorrente c3 = new ContoCorrente("Pinuccio",
        "Pastrumi");
        System.out.println(c3);
        c3.deposita(1000);
        System.out.println(c3);  
        c3.preleva(400);
        System.out.println(c3); 
        c3.preleva(1000);
        System.out.println(c3); 
    }
    
}
