/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_clase_semana62;

/**
 *
 * @author TYT
 */
public class Libro {
    String titulo;
    String autor;
    String ISBN;
    double precio;

    public Libro(String titulo, String autor, String ISBN, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }
    
    public void mostrardetalles(){
        System.out.println("El titulo es: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("ISBN: "+ ISBN);
        System.out.println("Precio: "+ precio);
    }
    public double aplicardesc(int edad){
        double descuento;
        if(edad >= 18){
        descuento = precio * 0.25;
        }else{
            descuento = precio * 0.10;
        }
        return precio-descuento;
    }
  
}
