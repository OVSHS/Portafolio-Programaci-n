/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleacioness;

/**
 *
 * @author TYT
 */
public class Productos {
    String nombre;
    double precio;
    int cant;

    public Productos(String nombreP, double precio, int cantDis) {
    this.nombre = nombreP;
    this.precio = precio;
    this.cant = cant;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    
}
