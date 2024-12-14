/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_clase_semana6.pkg1;

/**
 *
 * @author TYT
 */
public class Bonificacion extends Empleado {

    double bonificacion;

   public Bonificacion(String nombre, String genero, double salario, int edad, int antiguedad) {
        super(nombre, genero, salario, edad, antiguedad);
        this.bonificacion = calculobonificacion();
    }

    public double calculobonificacion() {
        if (salario > 45000) {
            bonificacion = salario * 0.20;
        } else if (salario > 25000 && antiguedad > 7) {
            bonificacion = salario * 0.15;
        } else if (salario > 18900 && antiguedad > 5) {
            bonificacion = salario * 0.10;
        } else {
            bonificacion = 0;
        }
        return bonificacion;
    }

    public double salarioFinal() {
        return salario + bonificacion;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: Lps. " + salario);
        System.out.println("Genero: " + genero);
        System.out.println("Edad: " + edad);
        System.out.println("Antiguedad: " + antiguedad + " annios");
        System.out.println("Bonificacion: Lps. " + bonificacion);
        System.out.println("Salario Final: Lps. " + salarioFinal());
    }
}