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

    @Test
    public void testGenerarReportePersona() {

        Persona p = new Persona("Laura", "Calle 10", "3001234567", "01/01/2000");

        String esperado
                = "Nombre: Laura\n"
                + "Telefono: 3001234567\n"
                + "Direccion: Calle 10\n"
                + "Fecha de nacimiento: 01/01/2000";

        assertEquals(esperado, p.generarReporte(), "Fallo en el test1");
    }
}
