/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziorazionale;

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
public class RazionaleTest {

    public RazionaleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addizione method, of class Razionale.
     */
    @Test
    public void testAddizione() {
        System.out.println("addizione");
        Razionale a = new Razionale(1, 2);
        Razionale b = new Razionale(1, 4);
        Razionale result = a.addizione(b);
        Razionale expResult = new Razionale(3, 4);
        assertEquals(expResult, result);
    }

    /**
     * Test of sottrazione method, of class Razionale.
     */
    @Test
    public void testSottrazione() {
        System.out.println("sottrazione");
        Razionale a = new Razionale(3, 2);
        Razionale b = new Razionale(2, 4);
        Razionale result = a.sottrazione(b);
        Razionale expResult = new Razionale(1, 1);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of moltiplicazione method, of class Razionale.
     */
    @Test
    public void testMoltiplicazione() {
        System.out.println("moltiplicazione");
        Razionale a = new Razionale(1, 2);
        Razionale b = new Razionale(2, 4);
        Razionale result = a.moltiplicazione(b);
        Razionale expResult = new Razionale (1, 4);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of divisione method, of class Razionale.
     */
    @Test
    public void testDivisione() {
        System.out.println("divisione");
        Razionale a = new Razionale(5, 2);
        Razionale b = new Razionale(4, 3);
        Razionale result = a.divisione(b);
        Razionale expResult = new Razionale (15, 8);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of semplifica method, of class Razionale.
     */
  public void testSemplifica()
    {
        System.out.println("Semplifica");
        Razionale instance = new Razionale(4, 2);
        String expResult = "2/1";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Razionale.
     */
    @Test
    public void testToStringPos() {
        System.out.println("toString");
        Razionale instance = new Razionale(1, 4);
        String expResult = "1/4";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Razionale.
     */
    @Test
    public void testToStringDenNeg() {
        System.out.println("toStringDenNeg");
        Razionale instance = new Razionale(1, -4);
        String expResult = "1/-4";
        String result = instance.toString();
        assertEquals(expResult, result);
    }


}