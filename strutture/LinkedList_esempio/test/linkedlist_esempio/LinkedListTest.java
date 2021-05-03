/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_esempio;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alex_2
 */
public class LinkedListTest {
    
    public LinkedListTest() {
    }

    /**
     * Fa il test dell'aggiunta in testa di un elemento
     * partendo da una lista vuota
     */
    @Test
    public void testAdd_lista_vuota() {
        System.out.println("Test metodo add con lista vuota");
        int n = 24;
        LinkedList instance = new LinkedList();
        String expResult = "[24 -> null]";
        instance.add(n);
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Fa il test dell'aggiunta in testa di un elemento
     * partendo da una lista con un elemento
     */
    @Test
    public void testAdd_lista_con_elementi() {
        System.out.println("Test metodo add con elementi già presenti");
        int n = 24;
        int m = 33;
        LinkedList instance = new LinkedList();
        instance.add(n);
        instance.add(m);
        String expResult = "[33 -> 24 -> null]";  
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd_int_int() {
        System.out.println("add");
        int pos = 0;
        int n = 0;
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.add(pos, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class LinkedList.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class LinkedList.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int e = 0;
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.remove(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class LinkedList.
     */
    @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        LinkedList l = null;
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.removeAll(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainAll method, of class LinkedList.
     */
    @Test
    public void testRetainAll() {
        System.out.println("retainAll");
        LinkedList l = null;
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.retainAll(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LinkedList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedList instance = new LinkedList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
