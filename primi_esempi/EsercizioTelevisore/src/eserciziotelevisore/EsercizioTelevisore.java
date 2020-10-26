/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziotelevisore;

import java.util.Scanner;

/**
 *
 * @author alex_2
 */
public class EsercizioTelevisore {
    
    public static void menu(){
        System.out.println("Scegli la voce che ti interessa.");
        System.out.println("1 - Accendi il televisore");
        //ecc. ecc.
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();
        System.out.println(a);
        String b = scan.next();
        System.out.println(b);
        menu();
    }
    
}
