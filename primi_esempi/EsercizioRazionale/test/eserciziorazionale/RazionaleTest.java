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
        Razionale r = null;
        Razionale instance = new Razionale();
        Razionale expResult = null;
        Razionale result = instance.sottrazione(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moltiplicazione method, of class Razionale.
     */
    @Test
    public void testMoltiplicazione() {
        System.out.println("moltiplicazione");
        Razionale r = null;
        Razionale instance = new Razionale();
        Razionale expResult = null;
        Razionale result = instance.moltiplicazione(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divisione method, of class Razionale.
     */
    @Test
    public void testDivisione() {
        System.out.println("divisione");
        Razionale r = null;
        Razionale instance = new Razionale();
        Razionale expResult = null;
        Razionale result = instance.divisione(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of semplifica method, of class Razionale.
     */
    @Test
    public void testSemplifica() {
        System.out.println("semplifica");
        Razionale r = null;
        Razionale instance = new Razionale();
        instance.semplifica(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        String expResult = "-1/4";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
        
    
}
