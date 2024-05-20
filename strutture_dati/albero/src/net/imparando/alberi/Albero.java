package net.imparando.alberi;

import java.util.Iterator;

public class Albero {
    private Nodo root;
    private int quanti;

    /**
     * Crea un albero alla cui radice si trova un nodo che contiene il valore n
     * @param n
     */
    public Albero(int n) {
        root = new Nodo(n);
        quanti++;
    }

    private Nodo cercaNodo(Nodo attuale, int n){
        if(attuale.info == n)
            return attuale;
        Iterator<Nodo> i = attuale.figli.iterator();
        while (i.hasNext()){
            Nodo cercato = cercaNodo(i.next(),n);
            if (cercato != null)
                return cercato;
        }
        return null;
    }

    public boolean aggiungiFiglio(int dove, int n){
        Nodo cercato = cercaNodo(root, dove);
        if (cercato == null)
            return false;
        //Problema: bisogna cercare la presenza di valori
        //già inseriti oppure no? A seconda della risposta a questa domanda
        //il codice è diverso, noi al momento permettiamo duplicati,
        //ragionare sulle conseguenze
        cercato.figli.add(new Nodo(n));
        return true;
    }

    private void visitaAnticipataR(Nodo n)
    {
        System.out.print(n.info + " -> ");
        Iterator<Nodo> i = n.figli.iterator();
        while (i.hasNext()){
            visitaAnticipataR(i.next());
        }
    }

    public void visitaAnticipata()
    {
        if (root != null)
            visitaAnticipataR(root);
        System.out.print("end");
    }

    private void visitaPosticipataR(Nodo n)
    {

        Iterator<Nodo> i = n.figli.iterator();
        while (i.hasNext()){
            visitaPosticipataR(i.next());
        }
        System.out.print(n.info + " -> ");
    }

    public void visitaPosticipata()
    {
        if (root != null)
            visitaPosticipataR(root);
        System.out.println("end");
    }

    public int size(){
        return quanti;
    }

    public boolean empty(){
        return quanti == 0;
    }

    /*
    Idea ricorsiva: il massimo di un albero è il massimo tra il valore
    del nodo e il massimo del valore dei suoi sottoalberi
     */

    private int massimoR(Nodo n) {
        int max = n.info;
        Iterator<Nodo> i = n.figli.iterator();
        while(i.hasNext()){
            int temp = massimoR(i.next());
            if (temp > max){
                max = temp;
            }
        }
        return max;
    }

    public int massimo() throws Exception {
        if (root == null)
            throw new Exception();
        return massimoR(root);
    }

    /*
    Idea ricorsiva: la profondità di un nodo n è uguale a 1
    più la profondità misurata rispetto al sottoalbero che lo contiene.
    Se il nodo non è presente viene ritornato -1
     */
    private int profonditaR(Nodo attuale, int n, int p){
        if (attuale.info == n)
            return p;
        Iterator<Nodo> i = attuale.figli.iterator();
        while(i.hasNext()){
            profonditaR(i.next(), n, p + 1);
        }
        return -1;
        //sbagliato, da finire
    }

    public int profondita(int n){
        return profonditaR(root, n, 0);
    }

    /**
     * Calcola la dimensione di un sottoalbero in maniera ricorsiva
     * senza usare l'attributo quanti
     * @param temp Nodo radice
     * @return Dimensione dell'albero di cui temp è la radice
     */
    private int sizeR(Nodo temp) {

        return 42;
    }

    public int size2(){
        if (root == null)
            return 0;
        return sizeR(root);
    }


    //Cancellazione in cui la rimozione di un nodo elimina anche tutti i suoi figli
    /*
    Idea ricorsiva: è una visita, con la differenza che appena trovato il nodo
    da eliminare, si elimina il nodo dalla lista dei figli e la visita termina.
    Per il nodo radice viene gestito come caso particolare, perchè non è il figlio di nessuno
    e quindi non può essere eliminato da una lista dei figli
     */
    private void cancellaNodoR(Nodo attuale, int n){

    }



    public void cancellaNodo(int n){

    }

    private int altezzaR(Nodo attuale){

        return 42;
    }

    public int altezza(){
        return altezzaR(root);
    }

    private void treeSempliceR(Nodo attuale, int livello){

    }

    public void treeSemplice(){
        System.out.println("Stampa dell'albero");
        if (root == null)
            return;
        treeSempliceR(root, 0);
    }

    private void treeR(Nodo attuale, String s, boolean last){

    }

    public void tree(){
        System.out.println("Stampa dell'albero");
        if (root == null)
            return;
        treeR(root, "", true);
    }

    private int nodiPerLivelloR(Nodo nodo, int livello, int livello_nodo){
        return 42;
    }

    public int nodiPerLivello(int livello){
        return nodiPerLivelloR(root, livello, 0);
    }

}
