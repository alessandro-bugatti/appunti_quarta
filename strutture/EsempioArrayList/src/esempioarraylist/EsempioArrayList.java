/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempioarraylist;

import java.util.ArrayList;

/**
 *
 * @author alex_2
 */
public class EsempioArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Razionale> a;
        a = new ArrayList<>();
        //for (int i = 0; i < 200000; i++)
        //    a.add(new Razionale(1,2));
        
        
        a.add(new Razionale(3,4));
        a.add(new Razionale(1,3));
        a.add(new Razionale(2,3));
        
        System.out.println(a.indexOf(new Razionale(1,3)));
        //System.out.println(a);
        //for (int i = 0; i < 100000; i++ )
        //    a.remove(a.size() - 1);
        
        ArrayList<Razionale> b = new ArrayList<>();
        b.add(new Razionale(5,7));
        b.add(new Razionale(7,8));
        
        System.out.println(a);
        a.addAll(b);
        System.out.println(a);
        a.addAll(2,b);
        System.out.println(a);
        
        //for (int i = 0; i < 200000; i++)
        //    a.add((a.size() - 1)/2
        //            , new Razionale(1,2));
        ArrayList<Integer> interi;
        interi = new ArrayList<>();
        interi.add(13);
        System.out.println(interi);
    }
    
}
