/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_esempio;

/**
 *
 * @author alex_2
 */
public class LinkedList_esempio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.add(13);
        lista.add(18);
        lista.add(76);
        lista.add(2, 34);
        lista.remove();
        LinkedList lista2 = new LinkedList();
        lista2.add(23);
        lista2.add(48);
        lista.addAll(lista2);
        //for (int i = 0; i < 20000000; i++)
        //    lista.add((int)(Math.random()*1000));
        System.out.println(lista);
        lista2.add(1,33);
        System.out.println(lista);
        int cercato = 18;
        if (lista.contains(cercato))
            System.out.println("presente il " + cercato);
        else
            System.out.println("non presente il " + cercato);
        lista.clear();
        if (lista.contains(cercato))
            System.out.println("presente il " + cercato);
         else
            System.out.println("non presente il " + cercato);
        
        
    }
    
}
