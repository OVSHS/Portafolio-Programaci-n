/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_clase_semana62;

/**
 *
 * @author TYT
 */
public class Trabajo_Clase_semana62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito", "Don Quijote de la Mancha", "1234560", 500);

        libro.mostrardetalles();

        int edadComprador = 20;
        double precioconDescuento = libro.aplicardesc(edadComprador);

        System.out.println("Precio con descuento: Lps. " + precioconDescuento);
    }

}
