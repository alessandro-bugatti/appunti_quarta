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
    private int merged[];
    
    //Costruttore che crea un vettore di dim elementi 
    //causali positivi
    public Vettore(int dim)
    { 
        dimensione = dim;
        v =  new int[dimensione];
        for (int i = 0; i < dimensione; i++)
            v[i] = (int)(Math.random()*100) + 1;
    }
    
    //Fa la somma di tutti gli elementi del vettore
    public int somma()
    {
        int temp = 0;
        for (int i = 0; i < dimensione;i++)
            temp += v[i];
        return temp;
    }
    
    //Ritorna il valore dell'elemento in posizione pos
    //Se pos è un indice non valido ritorna -1
    public int get(int pos)
    {
        if (pos < 0 || pos >= dimensione)
            return -1;
        return v[pos];
    }
    
    //Setta il valore dell'elemento in posizione 
    //pos a n. Se l'indice pos non è valido
    //la funzione ritorna false, true altrimenti
    public boolean set(int n, int pos)
    {
        if (pos < 0 || pos >= dimensione)
            return false;
        v[pos] = n;
        return true;
    }
    
    //Ricerca l'elemento cercato all'interno del vettore
    //Se lo trova ritorna la posizione, altrimenti -1
    public int ricercaEsaustiva(int cercato)
    {
        for (int i = 0; i < this.dimensione; i++)
            if (v[i] == cercato)
                return i;
        return -1;
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
        selectionSort(0, this.dimensione);
    }
    
    public void selectionSort(int a, int b)
    {
        if (a > b)
            return;
        if (a < 0)
            a = 0;
        if (b > this.dimensione)
            b = this.dimensione;
        int index = a;
        while (index < b)
        {
            int minore = v[index];
            int pos = index;
            for (int i = index; i < b; i++)
                if (v[i] < minore)
                {
                    minore = v[i];
                    pos = i;
                }    
            int temp = v[index];
            v[index] = v[pos];
            v[pos] = temp;
            index++;
        }
    }
    
    public void bubbleSort()
    {
        bubbleSort(0, this.dimensione);
    }
     
    public void bubbleSort(int a, int b)
    {
        if (a > b)
            return;
        if (a < 0)
            a = 0;
        if (b > this.dimensione)
            b = this.dimensione;
        boolean swapped;
        int index = a;
        do
        {
            swapped = false;
            for (int j = b - 1; j > index; j--)
            {
                if (v[j] < v[j - 1])
                {
                    int temp = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = temp;
                    swapped = true;
                }
            }
            index++;
        }while(swapped);
    }
    
    public void insertionSort()
    {
        insertionSort(0, this.dimensione);
    }
    
    public void insertionSort(int a , int b)
    {
        if (a > b)
            return;
        if (a < 1)
            a = 0;
        if (b > this.dimensione)
            b = this.dimensione;
        for (int i = a; i < b; i++)
        {
            int index = i;
            while (index - 1 >= a && v[index] < v[index - 1])
            {
                int temp = v[index];
                v[index] = v[index - 1];
                v[index - 1] = temp;
                index--;
            }
        }
    }
    
    //Di questi due metodi bisogna fare solo la versione
    //senza parametri, le funzioni di supporto per la partizione
    //e il merging vanno chiamate come si vuole e dichiarate
    //private
    
    private int partition(int a, int b)
    {
        int i = a - 1;
        int j = b;
        int pivot = v[b];
        while(true)
        {
            i++;
            j--;
            while(v[i] < pivot) 
                i++;
            while( v[j] > pivot && j > a) 
                j--;
            if (i >= j)
                break;
            int temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
        int temp = v[i];
        v[i] = v[b];
        v[b] = temp;
        return i;
    }
    
    private void quickSortR(int a, int b)
    {
        if (a >= b)
            return;
        int i = partition(a, b);
        quickSortR(a, i-1);
        quickSortR(i+1, b);
    }
    
    public void quickSort()
    {
        quickSortR(0,dimensione-1);
    }
    
    private void merge(int a, int half, int b)
    {
        int i = a;
        int j = half + 1;
        int k = a;
        for (;;) //while (i <= half && j <= b)
        {
            if (v[i] < v[j])
            {
                merged[k] = v[i];
                i++;
            }
            else
            {
                merged[k] = v[j];
                j++;
            }
            k++;
            if (i > half || j > b)
                break;
        }
        for (;i <= half; i++, k++)
            merged[k] = v[i];
        for (;j <= b; j++, k++)
            merged[k] = v[j];
        for (i = a; i <= b; i++)
            v[i] = merged[i];
    }
    
    private void mergeSortR(int a, int b)
    {
        if (b - a <= 0)
            return;
        int half = (b + a)/2;
        mergeSortR(a, half);
        mergeSortR(half + 1, b);
        merge(a, half, b);
    }
    // {5,3,2,8,4}
    public void mergeSort()
    {
        merged = new int[dimensione];
        mergeSortR(0, dimensione - 1);
    }

    //Restituisce il valore minino del vettore
    public int minimo()
    {
        int minimo = v[0];
        for (int i = 1; i < this.dimensione; i++)
            if (v[i] < minimo)
                minimo = v[i];
        return minimo;
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

    
