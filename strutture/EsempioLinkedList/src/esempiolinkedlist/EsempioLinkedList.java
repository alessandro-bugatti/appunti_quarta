/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempiolinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alex_2
 */
public class EsempioLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Razionale> a;
        a = new LinkedList<>();
        //for (int i = 0; i < 200000; i++)
        //    a.add(new Razionale(1,2));
        a.add(new Razionale(3,4));
        a.add(new Razionale(1,3));
        a.add(new Razionale(2,3));
        //a.add((a.size() - 1)/2
        //            , new Razionale(1,2));
        
        System.out.println(a.indexOf(new Razionale(1,3)));
        
        ArrayList<Razionale> b = new ArrayList<>();
        b.add(new Razionale(5,7));
        b.add(new Razionale(7,8));
        a.addAll(b);
        b.remove(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.get(2));
    }
    
}
