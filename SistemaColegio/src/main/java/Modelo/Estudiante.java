/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Estudiante extends Persona {

    private String codigo;

    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento, String codigo) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
    }

    @Override
    public String generarReporte() {
        return super.generarReporte()
                + "\n" + "Codigo: " + codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
