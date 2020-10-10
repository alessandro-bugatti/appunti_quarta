/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazione;


//il nome delle classi in Java per convenzione è maiuscolo
public class Vettore 
{
    //attributi
    private int dimensione;
    private int v[];
    
    //Costruttore che crea un vettore di dim elementi 
    //causali positivi
    public Vettore(int dim)
    { 
        
    }
    
    //Fa la somma di tutti gli elementi del vettore
    public int somma()
    {
        return 42;
    }
    
    //Ritorna il valore dell'elemento in posizione pos
    //Se pos è un indice non valido ritorna -1
    public int get(int pos)
    {
        return 42;
    }
    
    //Setta il valore dell'elemento in posizione 
    //pos a n. Se l'indice pos non è valido
    //la funzione ritorna false, true altrimenti
    public boolean set(int n, int pos)
    {
        return true;
    }
    
    //Ricerca l'elemento cercato all'interno del vettore
    //Se lo trova ritorna la posizione, altrimenti -1
    public int ricerca_esaustiva(int cercato)
    {
        return 42;
    }
    
    /*
    Di ogni metodo di ordinamento bisogna fare la versione
    senza parametri e quella con due parametri a e b, 
    che rappresentano gli indici entro i quali il 
    vettore deve essere ordinato. Se ad esempio 
    a = 1 e b = 4 devono essere ordinati gli elementi 
    a partire da quello di indice 1 (incluso) 
    fino a quello di indice 4 (escluso).
    Nel caso che a > b il metodo non deve fare niente, 
    se a o b si trovano fuori dai limiti del vettore 
    il metodo deve ordinare solo per i valori validi
    */
    
    public void selectionSort()
    {
        
    }
    
    public void selectionSort(int a, int b)
    {
        
    }
    
    public void bubbleSort()
    {
        
    }
     
    public void bubbleSort(int a, int b)
    {
        
    }
    
    public void insertionSort()
    {
        
    }
    
    public void insertionSort(int a , int b)
    {
        
    }
    
    //Di questi due metodi bisogna fare solo la versione
    //senza parametri, le funzioni di supporto per la partizione
    //e il merging vanno chiamate come si vuole e dichiarate
    //private
    
    private void quickSortR(int a, int b)
    {
    
    }
    
    public void quickSort()
    {
        quickSortR(0,dimensione);
    }
    
    private void mergeSortR(int a, int b)
    {
    
    }
    
    public void mergeSort()
    {
        quickSortR(0,dimensione);
    }

    //Restituisce il valore minino del vettore
    public int minimo()
    {
        return 42;
    }
    
    //Questa la tenete così com'è
    @Override
    public String toString()
    {
        String s = "" + v[0]; 
        for (int i = 1; i < dimensione; i ++)
            s += " - " + v[i]; 
        return s;
    }

}

    
