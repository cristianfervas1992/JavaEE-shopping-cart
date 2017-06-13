/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordermeal1.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian
 */
public class Order1PKTest {
    
    public Order1PKTest() {
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
     * Test of getIdOrder method, of class Order1PK.
     */
    @Test
    public void testGetIdOrder() {
        System.out.println("getIdOrder");
        Order1PK instance = new Order1PK(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expResult = 1;
        int result = instance.getIdOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getPlatoIdPlato method, of class Order1PK.
     */
    @Test
    public void testGetPlatoIdPlato() {
        System.out.println("getPlatoIdPlato");
        Order1PK instance = new Order1PK(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expResult = 2;
        int result = instance.getPlatoIdPlato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getTipoPagoIdTipoPago method, of class Order1PK.
     */
    @Test
    public void testGetTipoPagoIdTipoPago() {
        System.out.println("getTipoPagoIdTipoPago");
        Order1PK instance = new Order1PK(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expResult = 3;
        int result = instance.getTipoPagoIdTipoPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   

    /**
     * Test of getUsuarioIdUsuario method, of class Order1PK.
     */
    @Test
    public void testGetUsuarioIdUsuario() {
        System.out.println("getUsuarioIdUsuario");
        Order1PK instance = new Order1PK(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expResult = 4;
        int result = instance.getUsuarioIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getClienteIdCliente method, of class Order1PK.
     */
    @Test
    public void testGetClienteIdCliente() {
        System.out.println("getClienteIdCliente");
        Order1PK instance = new Order1PK(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expResult = 5;
        int result = instance.getClienteIdCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getEdificioIdEdificio method, of class Order1PK.
     */
    @Test
    public void testGetEdificioIdEdificio() {
        System.out.println("getEdificioIdEdificio");
        Order1PK instance = new Order1PK(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expResult = 6;
        int result = instance.getEdificioIdEdificio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getPostreIdPostre method, of class Order1PK.
     */
    @Test
    public void testGetPostreIdPostre() {
        System.out.println("getPostreIdPostre");
        Order1PK instance = new Order1PK(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expResult = 7;
        int result = instance.getPostreIdPostre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getBebestibleIdBebestible method, of class Order1PK.
     */
    @Test
    public void testGetBebestibleIdBebestible() {
        System.out.println("getBebestibleIdBebestible");
        Order1PK instance = new Order1PK(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expResult = 8;
        int result = instance.getBebestibleIdBebestible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    /**
     * Test of getEnsaladaIdEnsalada method, of class Order1PK.
     */
    @Test
    public void testGetEnsaladaIdEnsalada() {
        System.out.println("getEnsaladaIdEnsalada");
        Order1PK instance = new Order1PK(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expResult = 9;
        int result = instance.getEnsaladaIdEnsalada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
