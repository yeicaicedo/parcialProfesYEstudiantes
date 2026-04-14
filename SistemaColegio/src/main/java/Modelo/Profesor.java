/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Profesor extends Persona {

    private int cedula;
    private String area;
    private double salarioHora;
    private int horasTrabajadas;

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento,
            int cedula, String area, double salarioHora, int horasTrabajadas) {

        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    
    public double calcularPagoMensual() {
        double pagoMensual = salarioHora * horasTrabajadas;
        return pagoMensual + (pagoMensual * 0.30);
    }

    public double calcularPrestaciones() {
        return calcularPagoMensual() * 0.19;
    }

    @Override
    public String generarReporte() {
        return super.generarReporte()
                + "\n" + "Cedula: " + cedula
                + "\n" + "Area: " + area
                + "\n" + "Pago mensual: $" + calcularPagoMensual()
                + "\n" + "Prestaciones: $" + calcularPrestaciones();
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

}
