/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author USUARIO
 */
import Modelo.Colegio;
import Modelo.Profesor;
import Modelo.Estudiante;

public class Controlador {
    private Colegio colegio;

    public Controlador() {
        colegio = new Colegio();
    }

    public boolean validarFecha(String fechaNacimiento) {
        String partes[] = fechaNacimiento.split("/");
        if (partes.length != 3) {
            return false;
        }
        try {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int anio = Integer.parseInt(partes[2]);

            if (dia < 1 || dia > 31) {
                return false;
            }
            if (mes < 1 || mes > 12) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean cedulaExiste(int cedula) {
        return colegio.buscarProfesor(cedula) != null;
    }
    
    public String agregarProfesor(String nombre, String direccion, String telefono, String fechaNacimiento,
            int cedula, String area, double salarioHora, int horasTrabajadas) {

        if (cedulaExiste(cedula)) {
            return "La cédula ya está registrada";
        }

        if (!validarFecha(fechaNacimiento)) {
            return "Fecha inválida. Use dd/MM/yyyy";
        }

        Profesor p = new Profesor(nombre, direccion, telefono, fechaNacimiento, cedula, area, salarioHora, horasTrabajadas);
        colegio.agregarPersona(p);
        return "Profesor agregado correctamente";
    }
    
    public String agregarEstudiante(String nombre, String direccion, String telefono, String fechaNacimiento,
            String codigo) {

        if (!validarFecha(fechaNacimiento)) {
            return "Fecha inválida. Use dd/MM/yyyy";
        }

        Estudiante e = new Estudiante(nombre, direccion, telefono, fechaNacimiento, codigo);
        colegio.agregarPersona(e);

        return "Estudiante agregado correctamente";
    }
    
    public String buscarProfesor(int cedula) {
        Profesor p = colegio.buscarProfesor(cedula);
        if (p != null) {
            return p.generarReporte();
        } else {
            return "Profesor no encontrado";
        }
    }

}
