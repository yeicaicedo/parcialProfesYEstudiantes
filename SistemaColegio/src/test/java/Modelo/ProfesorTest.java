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
    
   @Test
    public void testCalcularPagoMensual() {

        Profesor p = new Profesor("Carlos", "Dir", "123", "01/01/1990",
                1, "Matematicas", 10, 100);

        double esperado = (10 * 100) * 1.30;

        assertEquals(esperado, p.calcularPagoMensual(), 0.001, "Fallo en test1");
    }

    @Test
    public void testCalcularPrestaciones() {

        Profesor p = new Profesor("Carlos", "Dir", "123", "01/01/1990",
                1, "Matematicas", 10, 100);

        double pago = (10 * 100) * 1.30;
        double esperado = pago * 0.19;

        assertEquals(esperado, p.calcularPrestaciones(), 0.001, "Fallo en test2");
    }

    @Test
    public void testGenerarReporteProfesor() {

        Profesor p = new Profesor("Carlos", "Dir", "123", "01/01/1990",
                1, "Matematicas", 10, 100);

        String reporte = p.generarReporte();

        assertTrue(reporte.contains("Carlos"));
        assertTrue(reporte.contains("Cedula"));
        assertTrue(reporte.contains("Pago mensual"));
    }
}
