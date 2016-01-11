/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Porcion;
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
public class porcionServicioTest {
    
    public porcionServicioTest() {
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
     * Test of insertar method, of class porcionServicio.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Porcion x = null;
        porcionServicio instance = new porcionServicio();
        String expResult = "";
        String result = instance.insertar(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class porcionServicio.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        porcionServicio instance = new porcionServicio();
        List<Porcion> expResult = null;
        List<Porcion> result = instance.consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
