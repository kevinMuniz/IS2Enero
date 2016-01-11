/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Familia;
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
public class familiaServicioTest {
    
    public familiaServicioTest() {
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
     * Test of insertar method, of class familiaServicio.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Familia x = null;
        familiaServicio instance = new familiaServicio();
        String expResult = "";
        String result = instance.insertar(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class familiaServicio.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        familiaServicio instance = new familiaServicio();
        List<Familia> expResult = null;
        List<Familia> result = instance.consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
