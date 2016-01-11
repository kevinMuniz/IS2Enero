/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Clase;
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
public class claseServicioTest {
    
    public claseServicioTest() {
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
     * Test of insertar method, of class claseServicio.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Clase x = null;
        claseServicio instance = new claseServicio();
        String expResult = "";
        String result = instance.insertar(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class claseServicio.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        claseServicio instance = new claseServicio();
        List<Clase> expResult = null;
        List<Clase> result = instance.consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
