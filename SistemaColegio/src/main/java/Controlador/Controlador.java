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

}
