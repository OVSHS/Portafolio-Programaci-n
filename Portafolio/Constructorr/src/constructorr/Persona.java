/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorr;

/**
 *
 * @author TYT
 */
public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
   public  void mostrar(){
       System.out.println("El nombre es:  " +nombre);
        System.out.println("La edad es:" + edad);
         
          
   }
        
    
}
