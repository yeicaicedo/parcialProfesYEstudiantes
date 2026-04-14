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
public class ProfesorTest {
    
    public ProfesorTest() {
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
     * Test of calcularPagoMensual method, of class Profesor.
     */
    @Test
    public void testCalcularPagoMensual() {
        System.out.println("calcularPagoMensual");
        Profesor instance = null;
        double expResult = 0.0;
        double result = instance.calcularPagoMensual();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPrestaciones method, of class Profesor.
     */
    @Test
    public void testCalcularPrestaciones() {
        System.out.println("calcularPrestaciones");
        Profesor instance = null;
        double expResult = 0.0;
        double result = instance.calcularPrestaciones();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarReporte method, of class Profesor.
     */
    @Test
    public void testGenerarReporte() {
        System.out.println("generarReporte");
        Profesor instance = null;
        String expResult = "";
        String result = instance.generarReporte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCedula method, of class Profesor.
     */
    @Test
    public void testGetCedula() {
        System.out.println("getCedula");
        Profesor instance = null;
        int expResult = 0;
        int result = instance.getCedula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCedula method, of class Profesor.
     */
    @Test
    public void testSetCedula() {
        System.out.println("setCedula");
        int cedula = 0;
        Profesor instance = null;
        instance.setCedula(cedula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class Profesor.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Profesor instance = null;
        String expResult = "";
        String result = instance.getArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class Profesor.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        String area = "";
        Profesor instance = null;
        instance.setArea(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalarioHora method, of class Profesor.
     */
    @Test
    public void testGetSalarioHora() {
        System.out.println("getSalarioHora");
        Profesor instance = null;
        double expResult = 0.0;
        double result = instance.getSalarioHora();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalarioHora method, of class Profesor.
     */
    @Test
    public void testSetSalarioHora() {
        System.out.println("setSalarioHora");
        double salarioHora = 0.0;
        Profesor instance = null;
        instance.setSalarioHora(salarioHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorasTrabajadas method, of class Profesor.
     */
    @Test
    public void testGetHorasTrabajadas() {
        System.out.println("getHorasTrabajadas");
        Profesor instance = null;
        int expResult = 0;
        int result = instance.getHorasTrabajadas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorasTrabajadas method, of class Profesor.
     */
    @Test
    public void testSetHorasTrabajadas() {
        System.out.println("setHorasTrabajadas");
        int horasTrabajadas = 0;
        Profesor instance = null;
        instance.setHorasTrabajadas(horasTrabajadas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
