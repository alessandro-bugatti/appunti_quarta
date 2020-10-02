/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricorsione;

/**
 *
 * @author alex_2
 */
public class Ricorsione {

    /**
     * @param args the command line arguments
     */
    
    // n! = n * (n-1)!
    
    public static int fattoriale(int n)
    {
        if (n == 0)
            return 1;
        //System.out.println("fattoriale(" + n + ") = " + 
        //        n + " + fattoriale (" + (n-1) + ")");
        return n * fattoriale (n - 1);
    }
    
    //Ipotesi: b intero >= 0
    //p(a, b) = a + p(a, b-1)
    //p(a, 0) = 0
    public static int prodotto (int a, int b)
    {
        if (b == 0)
            return 0;
        return a + prodotto(a, b-1);
    }
    
    
    public static void main(String[] args) {
        System.out.println(fattoriale(5));
        System.out.println(prodotto(3,4));
    }
    
}
