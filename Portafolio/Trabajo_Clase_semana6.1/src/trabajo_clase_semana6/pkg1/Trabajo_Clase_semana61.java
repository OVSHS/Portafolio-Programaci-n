/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_clase_semana6.pkg1;

/**
 *
 * @author TYT
 */
public class Trabajo_Clase_semana61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Bonificacion[] empleados = new Bonificacion[3];
     
        empleados[0] = new Bonificacion("Juan", "Masculino", 200, 30, 6);
        empleados[1] = new Bonificacion("Maria", "Femenino", 26, 40, 8);
        empleados[2] = new Bonificacion("Carlos", "Masculino", 500, 50, 10);

   
        for (Bonificacion empleado : empleados) {
            empleado.mostrarDetalles();
            System.out.println("----------------------------");
        }
    }
}
