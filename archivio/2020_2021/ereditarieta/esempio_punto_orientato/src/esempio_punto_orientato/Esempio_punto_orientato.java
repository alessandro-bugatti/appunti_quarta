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
        Punto p = new Punto(9.3, 8.7);
        
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
        
        Punto padre;
        PuntoOrientato figlio;
        //Nè upcasting nè downcasting;
        padre = p;
        //L'upcasting è sempre valido, legale
        //Upcasting implicito
        padre = po;
        //Upcasting esplicito
        padre = (Punto)po;
        //Il downcasting non è sempre legale
        //Il downcasting deve essere esplicito
        //In questo caso non sarebbe legale,
        //e ce ne si accorge in runtime
        //Downcasting legale
        figlio = (PuntoOrientato)padre;
        figlio.sposta(0);
        //Downcasting illegale in runtime
        figlio = (PuntoOrientato)p;
        figlio.sposta(0);
        
        //Downcasting che torna a essere legale
        p =(Punto)po;
        figlio = (PuntoOrientato)p;
        figlio.sposta(0);
    }
    
}
