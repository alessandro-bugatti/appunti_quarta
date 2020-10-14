/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazione;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alex_2
 */
public class VettoreTest {
    
    private Vettore instance;
    
    public VettoreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Vettore(5);
        instance.set(5, 0);
        instance.set(3, 1);
        instance.set(2, 2);
        instance.set(8, 3);
        instance.set(4, 4);
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of somma method, of class Vettore.
     */
    @Test
    public void testSomma() {
        System.out.println("somma");
        int expResult = 22;
        int result = instance.somma();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Vettore.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int pos = 3;
        int expResult = 8;
        int result = instance.get(pos);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTooLow() {
        System.out.println("get too low");
        int pos = -3;
        int expResult = -1;
        int result = instance.get(pos);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTooHigh() {
        System.out.println("get too high");
        int pos = 10;
        int expResult = -1;
        int result = instance.get(pos);
        assertEquals(expResult, result);
    }

    /**
     * Test of set method, of class Vettore.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int n = 100;
        int pos = 3;
        int expResult = 100;
        instance.set(n, pos);
        int result = instance.get(pos);
        assertEquals(expResult, result);
    }
        
    @Test
    public void testSetInvalid() {
        System.out.println("set invalid");
        int n = 100;
        int pos = 30;
        boolean expResult = false;
        boolean result = instance.set(n, pos);
        assertEquals(expResult, result);
    }

    /**
     * Test of ricerca_esaustiva method, of class Vettore.
     */
    @Test
    public void testRicerca_esaustiva() {
        System.out.println("ricerca_esaustiva");
        int cercato = 8;
        int expResult = 3;
        int result = instance.ricercaEsaustiva(cercato);
        assertEquals(expResult, result);
        }

    /**
     * Test of ricerca_esaustiva method, of class Vettore.
     */
    @Test
    public void testRicerca_esaustivaFailed() {
        System.out.println("ricerca_esaustiva failed");
        int cercato = 17;
        int expResult = -1;
        int result = instance.ricercaEsaustiva(cercato);
        assertEquals(expResult, result);
        }

    
    /**
     * Test of selectionSort method, of class Vettore.
     */
    @Test
    public void testSelectionSort_0args() {
        System.out.println("selectionSort");
        String expResult = "2 - 3 - 4 - 5 - 8";
        instance.selectionSort();
        assertEquals(expResult, instance.toString());
    }

    @Test
    public void testSelectionSort_int_int() {
        System.out.println("selectionSort interval");
        int a = 1;
        int b = 3;
        instance.selectionSort(a, b);
        String expResult = "5 - 2 - 3 - 8 - 4";
        assertEquals(expResult, instance.toString());
    }
    
    @Test
    public void testSelectionSort_int_int_invalid() {
        System.out.println("selectionSort invalid interval");
        int a = -7;
        int b = 20;
        instance.selectionSort(a, b);
        String expResult = "2 - 3 - 4 - 5 - 8";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of bubbleSort method, of class Vettore.
     */
    @Test
    public void testBubbleSort_0args() {
        System.out.println("bubbleSort");
        String expResult = "2 - 3 - 4 - 5 - 8";
        instance.bubbleSort();
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of insertionSort method, of class Vettore.
     */
    @Test
    public void testInsertionSort_0args() {
        System.out.println("insertionSort");
        String expResult = "2 - 3 - 4 - 5 - 8";
        instance.bubbleSort();
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of quickSort method, of class Vettore.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        String expResult = "2 - 3 - 4 - 5 - 8";
        instance.bubbleSort();
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of mergeSort method, of class Vettore.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        String expResult = "2 - 3 - 4 - 5 - 8";
        instance.bubbleSort();
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of minimo method, of class Vettore.
     */
    @Test
    public void testMinimo() {
        System.out.println("minimo");
        int expResult = 2;
        int result = instance.minimo();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Vettore.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "5 - 3 - 2 - 8 - 4";
        assertEquals(expResult, instance.toString());
    }
    
}
