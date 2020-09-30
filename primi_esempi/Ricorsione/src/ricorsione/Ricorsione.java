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
    
    public static int fattoriale(int n)
    {
        if (n == 0)
            return 1;
        return n * fattoriale (n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(fattoriale(5));
    }
    
}
