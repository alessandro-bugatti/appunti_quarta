/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequenza_con_lista;

/**
 *
 * @author alex_2
 */
public class Sequenza_con_lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Sequenza s=new Sequenza();
        System.out.println(s);
        s.inserimentoInTesta(3);
        s.inserimentoInTesta(5);
        s.inserimentoInTesta(7);
        System.out.println(s);
        System.out.println(s);
        for(int i=0;i<1;i++)
            s.cancellazioneInTesta();
        s.inserimentoInCoda(10);
        System.out.println(s);
        s.inserimentoInPosizione(2, 0);
        s.inserimentoInPosizione(9, s.sizeNodi());
        System.out.println("test inseriment in posizione");
        System.out.println(s);
        s.inserimentoInPosizione(4, 2);
        System.out.println(s);
        s.cancellaInPosizione(0);
        System.out.println(s);
        s.cancellaInPosizione(s.sizeNodi()-1);
        System.out.println(s);
        s.cancellaInPosizione(2);
        System.out.println(s);
        System.out.println(s.getItem(0));
        
        
        Sequenza r = new Sequenza();
        int dimensione = 100000;
        for(int i=0; i< dimensione; i++){
            r.inserimentoInTesta(i);
        }
        int somma = 0;
        for(int i=0; i< dimensione; i++){
            somma+= r.getItem(i);
        }
        System.out.println(somma);
    }
    
}
