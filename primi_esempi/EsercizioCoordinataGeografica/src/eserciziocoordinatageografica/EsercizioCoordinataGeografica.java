/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocoordinatageografica;

/**
 *
 * @author alex_2
 */
public class EsercizioCoordinataGeografica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Angolo a = new Angolo(32,34,23);
        System.out.println(a);
        a.setGradi(44);
        System.out.println(a);
        a.setPrimi(100);
        System.out.println(a);
        
    }
    
}
