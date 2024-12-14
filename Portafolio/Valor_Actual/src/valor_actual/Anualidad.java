/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valor_actual;

/**
 *
 * @author TYT
 */
public class Anualidad {
     public double renta;
    public double tasaInteres;
    public int numeroPagos;
    public String tipoAnualidad;

    public Anualidad(double renta, double tasaInteres, int numeroPagos, String tipoAnualidad) {
        this.renta = renta;
        this.tasaInteres = tasaInteres;
        this.numeroPagos = numeroPagos;
        this.tipoAnualidad = tipoAnualidad.toLowerCase();
    }
}
