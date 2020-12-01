/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocontocorrente;

/**
 *
 * @author Maffi Daniele, Palestro Lorenzo, Basile Mirko
 */
public class EsercizioContoCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ContoCorrente c1 = new ContoCorrente("Gianni", "Pallino");
        System.out.println(c1);
        ContoCorrente c2 = new ContoCorrente("Gianna", "Pallino");
        System.out.println(c2);
        c2.deposita(1000, "Bonifico per stipendio");
        c2.deposita(500, "Pagamento fattura Giorgio Bugni");
        System.out.println(c2);
        c2.preleva(500, "Riparazione auto");
        if(!c2.preleva(1200, "Aqcuisto nuovo telefono"));
            System.out.println("Pagamento fallito");
        System.out.println(c2);
        System.out.println(c2.saldo());
        System.out.println(c2.getNominativo());
        ContoCorrente c3 = new ContoCorrente(c2);
        System.out.println(c3);
        c2.modificaDescrizioneOperazione(1, "Pagamento fattura Giorgio Bugnoni");
        c2.modificaCognome("Pallone");
        System.out.println("c2:\n" + c2);
        System.out.println("c3:\n" + c3);
        Operazione[] op = c3.getPrelievi();
        System.out.println("Elenco dei prelievi di c3");
        for (int i = 0; i < op.length; i++)
            System.out.println(op[i]);
        op[0].setDescrizione("Nuovo prelievo");
        System.out.println("c3:\n" + c3);
        */
        //Dichiarare un vettore di tre conti correnti
        //Riempierlo con tre nuovi conti correnti
        //Chiedere all'utente di inserire la posizione
        //nel vettore del conto che si intende visualizzare
        //e visualizzarlo.
        //Provare a farlo una volta con un indice valido e una
        //volta con un indice non valido
        
        
        ContoCorrente c = new ContoCorrente("Pino", "Arcelli");
        /*try{
            for (int i = 0;i < 100; i++)
                c.deposita(100, "Stipendio");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Indice sbagliato");
        }
        catch(NullPointerException e)
        {
            System.out.println("Oggetto null");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divisione per zero");
        }    
        finally{
            System.out.println("IL programma ha generato un'errore irrecuperabile e verrà terminato");
            //Chiude i file aperti, ad esempio
            //Manda una segnalazione al programmatore
            System.exit(0); 
        }
        */
        try{
            c.deposita(0, "");
        }
        catch(Exception e)
        {
            System.out.println("C'è stato un errore nell'operazione " + e);
        }
        System.out.println(c);
    }
    
}
