/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Especie;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mariaca del espacio
 */
public class especieServicioTest {
    
    public especieServicioTest() {
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
     * Test of insertar method, of class especieServicio.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Especie x = null;
        especieServicio instance = new especieServicio();
        String expResult = "";
        String result = instance.insertar(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class especieServicio.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        especieServicio instance = new especieServicio();
        List<Especie> expResult = null;
        List<Especie> result = instance.consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarFamilia method, of class especieServicio.
     */
    @Test
    public void testGenerarFamilia() {
        System.out.println("generarFamilia");
        especieServicio instance = new especieServicio();
        String expResult = "";
        String result = instance.generarFamilia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comboFamilia method, of class especieServicio.
     */
    @Test
    public void testComboFamilia() {
        System.out.println("comboFamilia");
        especieServicio instance = new especieServicio();
        String expResult = "";
        String result = instance.comboFamilia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comboOrden method, of class especieServicio.
     */
    @Test
    public void testComboOrden() {
        System.out.println("comboOrden");
        especieServicio instance = new especieServicio();
        String expResult = "";
        String result = instance.comboOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comboC method, of class especieServicio.
     */
    @Test
    public void testComboC() {
        System.out.println("comboC");
        especieServicio instance = new especieServicio();
        String expResult = "";
        String result = instance.comboC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comboP method, of class especieServicio.
     */
    @Test
    public void testComboP() {
        System.out.println("comboP");
        especieServicio instance = new especieServicio();
        String expResult = "";
        String result = instance.comboP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comboPro method, of class especieServicio.
     */
    @Test
    public void testComboPro() {
        System.out.println("comboPro");
        especieServicio instance = new especieServicio();
        String expResult = "";
        String result = instance.comboPro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comboE method, of class especieServicio.
     */
    @Test
    public void testComboE() {
        System.out.println("comboE");
        especieServicio instance = new especieServicio();
        String expResult = "";
        String result = instance.comboE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comboPor method, of class especieServicio.
     */
    @Test
    public void testComboPor() {
        System.out.println("comboPor");
        especieServicio instance = new especieServicio();
        String expResult = "";
        String result = instance.comboPor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comboU method, of class especieServicio.
     */
    @Test
    public void testComboU() {
        System.out.println("comboU");
        especieServicio instance = new especieServicio();
        String expResult = "";
        String result = instance.comboU();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comboPre method, of class especieServicio.
     */
    @Test
    public void testComboPre() {
        System.out.println("comboPre");
        especieServicio instance = new especieServicio();
        String expResult = "";
        String result = instance.comboPre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
