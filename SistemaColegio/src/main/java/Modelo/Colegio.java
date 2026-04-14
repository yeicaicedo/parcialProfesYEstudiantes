/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;

public class Colegio {

    private ArrayList<Profesor> profesores;
    private ArrayList<Estudiante> estudiantes;

    // CONSTRUCTOR
    public Colegio() {
        profesores = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    public void agregarPersona(Profesor p) {
        profesores.add(p);
    }

    public void agregarPersona(Estudiante e) {
        estudiantes.add(e);
    }

    public Profesor buscarProfesor(int cedula) {
        for (int i = 0; i < profesores.size(); i++) {
            if (profesores.get(i).getCedula() == cedula) {
                return profesores.get(i);
            }
        }
        return null;
    }

    public String reporteEstudiantes() {
        String reporte = "LISTA DE ESTUDIANTES\n\n";

        for (int i = 0; i < estudiantes.size(); i++) {
            reporte += estudiantes.get(i).generarReporte() + "\n\n";
        }
        return reporte;
    }

    public String reporteProfesores() {

        for (int i = 0; i < profesores.size() - 1; i++) {
            for (int j = 0; j < profesores.size() - 1 - i; j++) {

                if (profesores.get(j).calcularPagoMensual() < profesores.get(j + 1).calcularPagoMensual()) {
                    Profesor aux = profesores.get(j);
                    profesores.set(j, profesores.get(j + 1));
                    profesores.set(j + 1, aux);
                }
            }
        }

        String reporte = "PROFESORES ORDENADOS (MAYOR A MENOR)\n\n";
        double totalPrestaciones = 0;

        for (int i = 0; i < profesores.size(); i++) {
            Profesor p = profesores.get(i);

            reporte += p.getNombre() + " - $" + p.calcularPagoMensual()
                    + " - Prestaciones: $" + p.calcularPrestaciones();
            totalPrestaciones += p.calcularPrestaciones();
        }

        reporte += "\n\nTOTAL PRESTACIONES: $" + totalPrestaciones;

        return reporte;
    }
}
