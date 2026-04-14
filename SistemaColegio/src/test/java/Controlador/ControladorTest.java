/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

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
public class ControladorTest {
    
    public ControladorTest() {
    }
    
     @Test
    public void testFlujoCompletoSistema() {

        Controlador ctrl = new Controlador();

        // Agregar profesor
        String r1 = ctrl.agregarProfesor(
                "Carlos", "Dir", "123", "01/01/1990",
                10, "Matematicas", 15, 80);

        assertEquals("Profesor agregado correctamente", r1);

        // Agregar estudiante
        String r2 = ctrl.agregarEstudiante(
                "Ana", "Dir", "321", "02/02/2000",
                "EST1");

        assertEquals("Estudiante agregado correctamente", r2);

        // Buscar profesor
        String buscado = ctrl.buscarProfesor(10);
        assertTrue(buscado.contains("Carlos"));
    }
}