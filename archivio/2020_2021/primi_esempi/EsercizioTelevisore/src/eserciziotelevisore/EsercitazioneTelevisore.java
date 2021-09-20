/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziotelevisore;

import com.sun.glass.ui.SystemClipboard;
import com.sun.net.httpserver.Authenticator;
import java.util.Scanner;

/**
 *
 * @author Danish Hussain
 */
public class EsercitazioneTelevisore {

    public static void menu()
    {
        System.out.println(""
                + "[1 - Accendi televisione] "
                + " [2 - Seleziona un canale]"
                + "\n[3 - Vai al canale successivo]"
                + " [4 - Vai al canale precedente]"
                + "\n[5 - Aumenta il volume]"
                + " [6 - Diminuisci il volume]"
                + "\n[7 - Aumenta la luminosità]"
                + " [8 - diminuisce la luminosità]"
                + "\n[0 - Spegni la televisione]"
                + "\n[]Scegli tra una delle opzioni elencate:");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisore t = new Televisore(1000);
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println(t.toString());
        System.out.println("--------------------------------------------------------------");
        int option;     
        do{
            menu();
            option = scan.nextInt();
            if(option == 0)
            {
                t.spegni();
                break;
            }
            else if(option == 1)
                t.accendi();
            else if(option == 2)
            {
                System.out.println("Su che canale vuoi andare: ");
                int canaleSelezionato = scan.nextInt();
                t.selezionaCanale(canaleSelezionato);
            }
            else if(option == 3)
                t.canaleSuccessivo();
            else if(option == 4)
                t.canalePrecedente();
            else if(option == 5)
                t.aumentaVolume();
            else if(option == 6)
                t.diminuisciVolume();
            else if(option == 7)
                t.aumentaluminosita();
            else if(option == 8)
                t.diminuisciLuminosita();
            
            System.out.println("--------------------------------------------------------------");
            System.out.println(t.toString());
            System.out.println("--------------------------------------------------------------");
        }while(option >= 0 && option <= 8);
        
        
    }
    
}
