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
public class EstudianteTest {
    
    public EstudianteTest() {
    }
    
    @Test
    public void testGenerarReporteEstudiante() {

        Estudiante e = new Estudiante("Ana", "Calle 5", "3009999999",
                "02/02/2002", "EST123");

        String reporte = e.generarReporte();

        assertTrue(reporte.contains("Ana"));
        assertTrue(reporte.contains("EST123"));
        assertTrue(reporte.contains("Direccion"));
    }
}
