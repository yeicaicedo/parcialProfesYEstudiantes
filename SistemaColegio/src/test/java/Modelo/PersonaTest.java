/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of generarReporte method, of class Persona.
     */
    @Test
    public void testGenerarReporte() {
        System.out.println("generarReporte");
        Persona instance = null;
        String expResult = "";
        String result = instance.generarReporte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Persona.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Persona instance = null;
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Persona.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Persona instance = null;
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaNacimiento method, of class Persona.
     */
    @Test
    public void testGetFechaNacimiento() {
        System.out.println("getFechaNacimiento");
        Persona instance = null;
        String expResult = "";
        String result = instance.getFechaNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
