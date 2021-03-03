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
        Abitazione a = new Abitazione(4,75,"Via dei Pini 12", "Brescia");
        //System.out.println(a);
        Villa b = new Villa(2,1000,true,7, 200, "Via dei Ciliegi 23", "Brescia");
        //Up-casting legale
        Abitazione c = new Villa(3,10000,true,17, 300, "Via dei Ciliegi 24", "Brescia");
        b.setStanze(4);
        //Down-casting illegale, molto spesso lo è
        //Villa d = new Abitazione(3,55,"Via dei Pini 22", "Brescia");
        c.setCitta("Milano");
        Villa d = (Villa)c;
        //d.getGiardino();
        System.out.println(c);
    }
    
}
