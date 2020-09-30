/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vettori_esempio;


//il nome delle classi in Java per convenzione è maiuscolo
public class Vettore 
{
    //attributi
    private int dimensione;
    private int v[];
    
    //metodi
    
    public Vettore()
    {
        
        dimensione = 200000;
        v = new int[dimensione];
        int max = 50;
        for (int i = 0; i < dimensione; i ++)
        {
            v[ i ] = (int)(Math.random() * max); 
        }
        v[0] =  100;
    }
    
    public Vettore(int dim)
    {
        dimensione = dim;
        v = new int[dimensione];
        int max = 100;
        for (int i = 0; i < dimensione; i ++)
            v[ i ] = (int)(Math.random() * max); 
        
    }

    
    public int somma()
    {
        int temp = 0;
        for(int i = 0; i < dimensione; i ++)
            temp += v[i];
        return temp;
    }
    
    public int get(int pos)
    {
        int posizione = 4;
        for (int i = 0; i < dimensione; i ++)
        {
            if(i==posizione){
             pos = v[i];
            }
        }
        
        return pos;
    }
    
    public boolean set(int n, int pos)
    {
        if (pos < 0 || pos >= dimensione)
            return false;
        v[pos] = n;
        return true;
    }
    
    public int ricerca_esaustiva(int cercato)
    {
        for (int i = 0; i < this.dimensione; i++)
            if (v[i] == cercato)
                return i;
        return -1;
    }
    
    
    public void selectionSort()
    {
        selectionSort(0, dimensione);
    }
    //fatto con gregorelli
    public void selectionSort(int a, int b)
    {
        if (a<b && a<dimensione && b>0) {
            if (a<0) a=0;
            if (b>dimensione && a<dimensione-1) b = dimensione;
            
            int posMin /*posizione numero più piccolo*/, temp;
            for (int i=a; i<b-1; i++)
            {
                posMin = i;
                for (int j=i+1; j<b; j++)
                {
                    if (v[j] < v[posMin]) {
                        posMin = j;
                    }
                }
                temp = v[posMin];
                v[posMin] = v[i];
                v[i] = temp;
            }
            
        }
    }
    
    public void BubbleSort()
    {
        // con l'aiuto di gregorelli 
        int minore = 0;
        int ordine = 0;
        int scambi = 0;
        while(ordine != dimensione)
        {
            scambi = 0;
            for(int i = dimensione -1; i > 0; i--)
            {
                
                if(v[i] < v[i-1])
                {
                    minore= v[i-1];
                    v[i-1] = v[i];
                    v[i] = minore ; 
                    scambi ++;
               
                } 
            }
            if (scambi == 0)
                break;
            ordine ++;
        }
        
    }
    
    
    public void insertionSort()
    {
        int minore = 0;
        for (int i = 0; i < dimensione -1 ; i++)
        {
            for(int j = i+1; j > 0 ; j--)
            {
               if(v[j] < v[j-1])
               {
                   minore = v[j-1];
                   v[j-1] = v[j];
                   v[j] = minore;
               }
            }
        }
    }
    
    //fatto con  il mistico aiuto di Gregorelli Michele
    public void insertionSortAdvance()
    {
        int temp, n/*numero attuale da ordinare*/=0, posMin=0;
        //controllare validitÃ  numeri
        //bubble
        for (int i=1; i<dimensione; i++)
        {
            if (v[i]<v[posMin]) {
                posMin = i;
            }
        }
        temp = v[0];
        v[0] = v[posMin];
        v[posMin] = temp;
        for (int i=2; i<dimensione; i++)
        {
            
            if (v[i]>=v[i-1]) {
                continue;
            }
            n = v[i];
            for (int j=i-1; j>0; j--)
            {
                v[j+1] = v[j];
                if (n<=v[j] && n>=v[j-1]) {
                    v[j] = n;
                    break;
                }
            }
        }
    }

    
    
    public void stampa()
    {
        System.out.print(v[0]); 
        for (int i = 1; i < dimensione; i ++)
            System.out.print(" - " + v[i]); 
        System.out.println("");
    }

}

    
