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
public class ColegioTest {
    
    public ColegioTest() {
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
     * Test of agregarPersona method, of class Colegio.
     */
    @Test
    public void testAgregarPersona_Profesor() {
        System.out.println("agregarPersona");
        Profesor p = null;
        Colegio instance = new Colegio();
        instance.agregarPersona(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPersona method, of class Colegio.
     */
    @Test
    public void testAgregarPersona_Estudiante() {
        System.out.println("agregarPersona");
        Estudiante e = null;
        Colegio instance = new Colegio();
        instance.agregarPersona(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarProfesor method, of class Colegio.
     */
    @Test
    public void testBuscarProfesor() {
        System.out.println("buscarProfesor");
        int cedula = 0;
        Colegio instance = new Colegio();
        Profesor expResult = null;
        Profesor result = instance.buscarProfesor(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reporteEstudiantes method, of class Colegio.
     */
    @Test
    public void testReporteEstudiantes() {
        System.out.println("reporteEstudiantes");
        Colegio instance = new Colegio();
        String expResult = "";
        String result = instance.reporteEstudiantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reporteProfesores method, of class Colegio.
     */
    @Test
    public void testReporteProfesores() {
        System.out.println("reporteProfesores");
        Colegio instance = new Colegio();
        String expResult = "";
        String result = instance.reporteProfesores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
