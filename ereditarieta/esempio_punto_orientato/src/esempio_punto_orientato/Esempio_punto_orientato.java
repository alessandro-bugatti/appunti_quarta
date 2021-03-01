/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempio_punto_orientato;

/**
 *
 * @author alex_2
 */
public class Esempio_punto_orientato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntoOrientato po = new PuntoOrientato(9, 6, 'D');
        System.out.println(po);
        PuntoOrientato po2 = new PuntoOrientato(po);
        
        System.out.println(po2);
        po2.ruotaDestra();
        System.out.println(po);
        System.out.println(po2);
        
        if (po.equals(po2))
            System.out.println("Uguali");
        else
            System.out.println("Diversi");
        
    }
    
}
