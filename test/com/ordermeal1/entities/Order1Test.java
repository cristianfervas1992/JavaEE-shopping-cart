/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordermeal1.entities;

import java.util.Date;
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
public class Order1Test {
    private Bebestible bebida;
    private Cliente cliente;
    private Edificio edificio;
    private Ensalada ensalada;
    private Plato plato;
    private Postre postre;
    private TipoPago tipoPago;
    private Usuario usuario;
    protected Order1PK order1PK;
    private double ordTotalPago;
    private Date ordFechaRetiro;
    private Date ordFechaEmision;
    
    public Order1Test() {
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
     * Test of getOrder1PK method, of class Order1.
     */
    @Test
    public void testGetOrder1PK() {
        System.out.println("getOrder1PK");
        Order1 instance = new Order1(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Order1PK expResult = order1PK;
        instance.setOrder1PK(order1PK);
        Order1PK result = instance.getOrder1PK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getOrdTotalPago method, of class Order1.
     */
    @Test
    public void testGetOrdTotalPago() {
        System.out.println("getOrdTotalPago");
        Order1 instance = new Order1(1, 2, 3, 4, 5, 6, 7, 8, 9);
        double expResult = ordTotalPago;
        instance.setOrdTotalPago(ordTotalPago);
        double result = instance.getOrdTotalPago();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getOrdFechaRetiro method, of class Order1.
     */
    @Test
    public void testGetOrdFechaRetiro() {
        System.out.println("getOrdFechaRetiro");
        Order1 instance = new Order1(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Date expResult = ordFechaRetiro;
        instance.setOrdFechaRetiro(ordFechaRetiro);
        Date result = instance.getOrdFechaRetiro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getOrdFechaEmision method, of class Order1.
     */
    @Test
    public void testGetOrdFechaEmision() {
        System.out.println("getOrdFechaEmision");
        Order1 instance = new Order1();
        Date expResult = ordFechaEmision;
        instance.setOrdFechaEmision(ordFechaEmision);
        Date result = instance.getOrdFechaEmision();
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getBebestible method, of class Order1.
     */
    @Test
    public void testGetBebestible() {
        System.out.println("getBebestible");
        Order1 instance = new Order1(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Bebestible expResult = bebida;
        instance.setBebestible(bebida);
        Bebestible result = instance.getBebestible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    /**
     * Test of getCliente method, of class Order1.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Order1 instance = new Order1();
        Cliente expResult = cliente;
        instance.setCliente(cliente);
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getEdificio method, of class Order1.
     */
    @Test
    public void testGetEdificio() {
        System.out.println("getEdificio");
        Order1 instance = new Order1();
        Edificio expResult = edificio;
        instance.setEdificio(edificio);
        Edificio result = instance.getEdificio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEnsalada method, of class Order1.
     */
    @Test
    public void testGetEnsalada() {
        System.out.println("getEnsalada");
        Order1 instance = new Order1();
        Ensalada expResult = ensalada;
        instance.setEnsalada(ensalada);
        Ensalada result = instance.getEnsalada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getPlato method, of class Order1.
     */
    @Test
    public void testGetPlato() {
        System.out.println("getPlato");
        Order1 instance = new Order1();
        Plato expResult = plato;
        instance.setPlato(plato);
        Plato result = instance.getPlato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPostre method, of class Order1.
     */
    @Test
    public void testGetPostre() {
        System.out.println("getPostre");
        Order1 instance = new Order1();
        Postre expResult = postre;
        instance.setPostre(postre);
        Postre result = instance.getPostre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getTipoPago method, of class Order1.
     */
    @Test
    public void testGetTipoPago() {
        System.out.println("getTipoPago");
        Order1 instance = new Order1();
        TipoPago expResult = tipoPago;
        instance.setTipoPago(tipoPago);
        TipoPago result = instance.getTipoPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Order1.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Order1 instance = new Order1();
        Usuario expResult = usuario;
        instance.setUsuario(usuario);
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
