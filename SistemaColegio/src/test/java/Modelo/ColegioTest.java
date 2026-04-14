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
    
   @Test
    public void testAgregarYBuscarProfesor() {

        Colegio c = new Colegio();

        Profesor p = new Profesor("Luis", "Dir", "123", "01/01/1990",
                100, "Fisica", 20, 50);

        c.agregarPersona(p);

        Profesor buscado = c.buscarProfesor(100);

        assertEquals("Luis", buscado.getNombre(), "Fallo en test");
    }

    @Test
    public void testReporteEstudiantes() {

        Colegio c = new Colegio();

        Estudiante e = new Estudiante("Ana", "Dir", "111", "01/01/2000", "E1");
        c.agregarPersona(e);

        String reporte = c.reporteEstudiantes();

        assertTrue(reporte.contains("Ana"));
        assertTrue(reporte.contains("E1"));
    }

    @Test
    public void testReporteProfesoresOrdenados() {

        Colegio c = new Colegio();

        Profesor p1 = new Profesor("A", "Dir", "1", "01/01/1990", 1, "Area", 10, 10);
        Profesor p2 = new Profesor("B", "Dir", "1", "01/01/1990", 2, "Area", 20, 10);

        c.agregarPersona(p1);
        c.agregarPersona(p2);

        String reporte = c.reporteProfesores();

        assertTrue(reporte.contains("TOTAL PRESTACIONES"));
        assertTrue(reporte.contains("PROFESORES ORDENADOS"));
    }
}