/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziorazionale;

/**
 *
 * @author alex_2
 */
public class EsercizioRazionale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Razionale a = new Razionale(1,4);
        Razionale b = new Razionale(1,4);
        System.out.println(a);
        System.out.println(b);
        if (a.equals(a))
            System.out.println("1 - Sono uguali");
        if (a.equals(b))
            System.out.println("1bis"
                    + " - Sono uguali");
        System.out.println(a);
        System.out.println(b);
        if (a.equals(b))
            System.out.println("2 - Sono uguali");
        b = null;
        if (a.equals(b))
            System.out.println("3 - Sono uguali");
        
        
    }
    
}
