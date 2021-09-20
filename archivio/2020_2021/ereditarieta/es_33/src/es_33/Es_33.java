/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_33;

/**
 *
 * @author alex_2
 */
public class Es_33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se abitazione diventa astratta non si possono più 
        //istanziare oggetti di tipo abitazione
        Abitazione abitazione;//non si può più fare = new Abitazione(4,75,"Via dei Pini 12", "Brescia");
        //Però posso fare
        abitazione = new Villa(3,100,true,6, 250, "Via dei Tigli 23", "Palermo");
        //System.out.println(a);
        Villa villa = new Villa(2,1000,true,7, 200, "Via dei Ciliegi 23", "Brescia");
        //Up-casting legale
        Abitazione abitazione2 = new Villa(3,10000,true,17, 300, "Via dei Ciliegi 24", "Brescia");
        villa.setStanze(4);
        //Down-casting illegale, molto spesso lo è
        //Villa d = new Abitazione(3,55,"Via dei Pini 22", "Brescia");
        abitazione2.setCitta("Milano");
        Villa villa2;
        
        villa2 = (Villa)abitazione2;//Down-casting legale
        villa2.getGiardino(); //Si può fare
        System.out.println(villa2);
        //villa2 = (Villa)abitazione; //Down-casting illegale
        //villa2.getGiardino(); //Non si può fare
        System.out.println(villa2);
        //Up-casting: sempre legale
        abitazione2 = villa; //Up-casting implicito
        abitazione2 = (Abitazione)villa; //Up-casting esplicito
        abitazione2.setCitta("Milano");
        
        Abitazione abitazioni[] = new Abitazione[4];
        System.out.println(abitazioni[0]);
        abitazioni[0] = abitazione;
        abitazioni[1] = abitazione2;
        abitazioni[2] = villa;
        abitazioni[3] = villa2;
        
        
        for (int i = 0; i < abitazioni.length; i++)
            System.out.println("Abitazione " + i + ": " + abitazioni[i]);
        
    }
    
}
